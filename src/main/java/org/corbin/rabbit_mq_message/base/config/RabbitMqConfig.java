package org.corbin.rabbit_mq_message.base.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * @author yin
 * @date 2019/06/21
 */
@Configuration
@Slf4j
public class RabbitMqConfig {
    @Autowired
    private RabbitTemplate rabbitTemplate;
}
