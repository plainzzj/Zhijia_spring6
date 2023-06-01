package com.atguigu.spring6.iocxml.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOrders {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        Object orders = context.getBean("orders",Orders.class);

        System.out.println(orders);
        Object orders1 = context.getBean("orders",Orders.class);
        System.out.println(orders1);

        /*
        Creating shared instance of singleton bean 'orders'
        com.atguigu.spring6.iocxml.scope.Orders@4a11eb84
        com.atguigu.spring6.iocxml.scope.Orders@4a11eb84

        --> 两个对象是一个对象！ 单实例！ -> 初始化创建
                              多实例 -> 获取bean时创建
         */
    }
}
