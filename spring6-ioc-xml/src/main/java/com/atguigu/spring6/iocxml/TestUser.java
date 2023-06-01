package com.atguigu.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        // 1. 创建容器
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 2. 获取bean（Spring容器管理的对象的实例）
        // a. 根据id获取bean
        Object user1 = (User)context.getBean("user");
        System.out.println("根据id获取bean" + user1);
        /*
        根据id获取beancom.atguigu.spring6.iocxml.User@2374d36a
         */

        // b. 根据类型获取bean
        User user2 = context.getBean(User.class);
        System.out.println("根据类型获取bean" + user1);
        /*
        根据类型获取beancom.atguigu.spring6.iocxml.User@2374d36a
         */

        // c. 根据类型和id获取bean
        User user3 = context.getBean("user", User.class);
        System.out.println("根据类型和id获取bean" + user1);
        /*
        根据类型和id获取beancom.atguigu.spring6.iocxml.User@2374d36a
         */



    }
}
