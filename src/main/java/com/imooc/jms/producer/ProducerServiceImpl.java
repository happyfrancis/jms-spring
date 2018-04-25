/**
 * @program: jms-sping
 * @description:
 * @author: Francis
 * @create: 2018-04-17 09:52
 **/

package com.imooc.jms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.TextMessage;

public class ProducerServiceImpl implements ProducerService {

    @Autowired
    private JmsTemplate jmsTemplate;

//    @Resource(name="queueDestination") 队列模式
    @Resource(name = "topicDestination")
    private Destination destination;

    @Override
    public void sendMessage(String message) {
//        jmsTemplate.send(destination, new MessageCreator() {
//            @Override
//            public Message createMessage(Session session) throws JMSException {
//                TextMessage textMessage = session.createTextMessage(message);
//                return textMessage;
//            }
//              System.out.println("发送消息："+message);
//        });
        //使用JmsTemplate发送消息
        jmsTemplate.send(destination,(session) -> {
                //创建一个消息
                TextMessage textMessage = session.createTextMessage(message);
                return textMessage;
        });
        System.out.println("发送消息："+message);
    }
}
