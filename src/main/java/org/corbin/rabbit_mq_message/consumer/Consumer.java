package org.corbin.rabbit_mq_message.consumer;

import org.corbin.rabbit_mq_message.base.config.RabbitConstant;
import org.corbin.rabbit_mq_message.entity.UserInfo;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author yin
 * @date 2019/06/24
 */
@Component
public interface Consumer {

    @Component
    @RabbitListener(queues = RabbitConstant.TopicConstnt.QUEUE_USER)
    public class ConsumerUser {
        /**
         * 接受函数的类型需要与发送的类型相一致，
         * 发送的对象，一定要用对象接受
         *
         * @param info
         */
        @RabbitHandler
        public void process(UserInfo info) {
            System.out.println("Receiver1  : " + info);
        }
    }

    @Component
    @RabbitListener(queues = "topic.test")
    public class ConsumerOther {
        /**
         * 接受函数的类型需要与发送的类型相一致，
         * 发送的对象，一定要用对象接受
         *
         * @param info
         */
        @RabbitHandler
        public void process(String info) {
            System.out.println("Receiver2  : " + info);
        }
    }

}
