/**
 * @program: jms-sping
 * @description:
 * @author: Francis
 * @create: 2018-04-17 10:23
 **/

package com.imooc.jms.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConsumer {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
    }
}
