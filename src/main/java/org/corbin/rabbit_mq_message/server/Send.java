package org.corbin.rabbit_mq_message.server;

import org.corbin.rabbit_mq_message.base.config.RabbitConstant;
import org.corbin.rabbit_mq_message.entity.UserInfo;
import org.eclipse.jetty.server.Authentication;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yin
 * @date 2019/06/24
 */
@Service
public class Send {
    private AmqpTemplate rabbitTemplate;

    @Autowired
    Send(AmqpTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMsg() {
        for (int i = 1; i < 100; i++) {
            UserInfo userInfo = UserInfo.builder().id(Integer.valueOf(i).longValue()).name("haha" + i).build();
            rabbitTemplate.convertAndSend(RabbitConstant.TopicConstnt.EXCHANGE,RabbitConstant.TopicConstnt.QUEUE_USER, userInfo);
            rabbitTemplate.convertAndSend("topic.test", userInfo.getName().toString());
        }
    }


}
