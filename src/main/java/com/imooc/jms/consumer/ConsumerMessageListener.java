/**
 * @program: jms-sping
 * @description:
 * @author: Francis
 * @create: 2018-04-17 10:18
 **/

package com.imooc.jms.consumer;

import javax.jms.*;

public class ConsumerMessageListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
            System.out.println("接收消息："+textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
