package com.atguigu.spring6.iocxml.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {

    @Test
    public void testSetter(){
        // 1. 加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        // 2. 得到book对象
        Book book = context.getBean("book", Book.class);

        System.out.println(book);
        /*
        无参数构造执行了...
        Book{bname='前端开发', author='zzj', others='a<b'}
         */
    }
    @Test
    public void testConstructor(){
        // 1. 加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        // 2. 得到book对象
        Book book = context.getBean("bookCon", Book.class);

        System.out.println(book);
        /*
        有参数构造执行了...
        Book{bname='后端开发', author='尚硅谷', others='null'}
         */

    }
}
