package org.corbin.rabbit_mq_message.base.config;

/**
 * @author yin
 * @date 2019/06/24
 * <p>
 * rabbit配置常量
 */
public interface RabbitConstant {
    /**
     * rabbitmq 通配符模式(Topic)：配置常量
     */
    class TopicConstnt {
//        /**
//         * 通配符模式(Topic)：配置常量
//         */
//        constant;
        /**
         * 指定交换机
         */

        public final static String EXCHANGE = "topic.exchange";

        /**
         * 指定队列
         */

        public final static String QUEUE_USER = "topic.user";

        /**
         * 该队列的路由键,此处暂设为全匹配
         */

        public final static String QUEUE_USER_ROUTING_KEY = "topic.user";
    }


}
