package com.atguigu.spring6;

import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;


public class TestUser {
    // 手动写入日志！ -1
    private Logger logger = LoggerFactory.getLogger(TestUser.class);
    @Test
    public void testUserObject(){
        // 加载Spring配置文件，对象创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 获取创建的对象
        User user = (User) context.getBean("user");
        System.out.println("1: " + user);

        // 使用对象调用方法进行测试
        user.add();

        // 手动写入日志！-2
        logger.info("### 执行调用成功了...");
        /*
        0： 无参数构造执行了
        1： com.atguigu.spring6.User@5136d012 -> User对象！ （对象的创建）
        2： add... -> User对象的add方法 （方法的调用）
        2023-05-29 08:54:55 518 [main] INFO com.atguigu.spring6.TestUser - ### 执行调用成功了...
         */

    }
    // 反射创建对象相关代码
    @Test
    public void testUserObject1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 1. 获取类class对象
        Class clazz = Class.forName("com.atguigu.spring6.User");
        // 2. 调用方法创建对象
//        Object o = clazz.newInstance(); -> JDK17版本已过时！
        User user = (User) clazz.getDeclaredConstructor().newInstance();
        System.out.println();

        /*
        0: 无参数构造执行了
         */

    }
}
