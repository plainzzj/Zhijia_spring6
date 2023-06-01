package com.atguigu.spring6.iocxml.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {
    public static void main(String[] args) {
         ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
         // 测试： 根据类型获取接口对应bean
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println(userDao);

        userDao.run();
        /*
        com.atguigu.spring6.iocxml.bean.UserDaoImpl@6e6d5d29
        run...
         */

    }
}
