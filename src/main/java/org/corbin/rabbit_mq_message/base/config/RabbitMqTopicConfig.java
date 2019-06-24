package org.corbin.rabbit_mq_message.base.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yin
 * @date 2019/06/24
 * <p>
 * AMQP协议中的核心思想就是生产者和消费者隔离，生产者从不直接将消息发送给队列。
 * 生产者通常不知道是否一个消息会被发送到队列中，只是将消息发送到一个交换机。
 * 先由Exchange来接收，然后Exchange按照特定的策略转发到Queue进行存储。
 * 同理，消费者也是如此。Exchange 就类似于一个交换机，转发各个消息分发到相应的队列中。
 * <p>
 * <p>
 * rabbitMq 分以下四种模式，fanout,direct,topic,header
 * 此类配置topic模式
 * 所有发送到topic Exchange中的消息都会被转发到所有关心RouteKey中指定的topic的queue上
 */
@Slf4j
@Configuration
public class RabbitMqTopicConfig {

    /**
     * 定义队列
     */
    @Bean
    Queue queueUser() {
        return new Queue(RabbitConstant.TopicConstnt.QUEUE_USER);
    }

    @Bean
    Queue queueTest() {
        return new Queue("topic.test");
    }
    /**
     * 定义交换机
     */
    @Bean
    TopicExchange exchange() {
        return new TopicExchange(RabbitConstant.TopicConstnt.EXCHANGE);
    }

    /**
     * 绑定路由建
     * <p>
     * 参数为创建的队列的bean
     */
    @Bean
    Binding bindingExchangeUser(Queue queueUser, TopicExchange exchange) {
        return BindingBuilder.bind(queueUser).to(exchange).with(RabbitConstant.TopicConstnt.QUEUE_USER_ROUTING_KEY);
    }
    @Bean
    Binding bindingExchangeTset(Queue queueUser, TopicExchange exchange) {
        return BindingBuilder.bind(queueUser).to(exchange).with("topic.test");
    }

}
