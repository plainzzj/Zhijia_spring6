package com.atguigu.spring6.iocxml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeptTest {
    /*
    你在 DeptTest 类中直接在类体中编写了方法调用代码，而没有将其放在任何方法中。
    在 Java 中，除了定义成员变量和方法之外，不能在类的体中直接编写可执行的代码。
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-dilist.xml ");
        // 获取员工对象
        Dept dept = context.getBean("dept", Dept.class);
        dept.info();
        /*
        部门名称：安保
        0 1
         */

    }
}
