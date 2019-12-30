package com.example.demo.rabbit;

import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @Descrption TODO
 * @Author chenxin
 * @Date 2019-07-23  AM 10:30
 */
//@Component
//RabbitListener(queues = RabbitConfig.QUEUE_A)
public class MsgReceiver {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RabbitHandler
    public void process(String content, Channel channel, Message message) {
        logger.info("接收处理队列A当中的消息： {}", content);
        //告诉服务器收到这条消息 已经被我消费了 可以在队列删掉 这样以后就不会再发了 否则消息服务器以为这条消息没处理掉 后续还会在发
        try {
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        } catch (IOException e) {
            //丢弃这条消息
            //channel.basicNack(message.getMessageProperties().getDeliveryTag(), false,false);
            e.printStackTrace();
        }
    }

}
