package com.atguigu.spring6.iocxml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diarray.xml ");
        // 获取员工对象
        Emp emp = context.getBean("emp", Emp.class);
        emp.work();
        /*
        lucy work... 18
        部门名称：安保
         */
        /*
        Mary work... 20
        部门名称：财务
         */
        /*
        lucy work... 20
        部门名称：安保
        [吃饭, 睡觉, 敲代码]
         */



    }
}
