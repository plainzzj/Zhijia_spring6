package com.atguigu.spring6.iocxml.dimap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStu {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diref.xml");
        Student student = context.getBean("studentp", Student.class);
        student.run();
        /*
        学生编号2000学生名称张三
        {
                            10010
                        =Teacher{teacherID='100', teacherName='西门'},
                            20020
                        =Teacher{teacherID='200', teacherName='吹雪'}
         }
         */

        /*
        学生编号2000学生名称张三
        {10010=Teacher{teacherID='100', teacherName='西门'}, 10086=Teacher{teacherID='200', teacherName='吹雪'}}
        [Lesson{lessonName='Java'}, Lesson{lessonName='Python'}]
         */

        /*
        (studentp)
        学生编号100学生名称mary
        {10010=Teacher{teacherID='100', teacherName='西门'}, 10086=Teacher{teacherID='200', teacherName='吹雪'}}
        [Lesson{lessonName='Java'}, Lesson{lessonName='Python'}]
         */

    }
}
