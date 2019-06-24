//package org.corbin.rabbit_mq_message.consumer;
//
//import org.springframework.amqp.rabbit.annotation.RabbitHandler;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
///**
// * @author yin
// * @date 2019/06/24
// */
//@Component
//@RabbitListener(queues = "topic.user_order")
//public class Consumer1 {
//    @RabbitHandler
//    public void process(String value) {
//        System.out.println("Receiver2  : " + value);
//    }
//
//}
