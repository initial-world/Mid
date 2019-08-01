package com.example.demo.rabbit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Descrption TODO
 * @Author chenxin
 * @Date 2019-07-23  AM 10:37
 */
//@Component
//@RabbitListener(queues = RabbitConfig.QUEUE_A)
public class ReceiverOne {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RabbitHandler
    public void process(String content) {
        logger.info("接收处理队列A当中的消息： " + content);
    }

}
