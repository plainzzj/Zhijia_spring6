package com.atguigu.spring6.iocxml.ditest;

import java.util.Arrays;

public class Emp {
    // Dept（对象）属性：员工属于哪个部门
    private Dept dept;
    private String ename;
    private int age;

    private String[] loves;

    public String[] getLoves() {
        return loves;
    }

    public void setLoves(String[] loves) {
        this.loves = loves;
    }

    public Dept getDept() {
        return dept;
    }

    public String getEname() {
        return ename;
    }

    public int getAge() {
        return age;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void work(){
        System.out.println(ename + " work... " + age);
        // 在员工中调用属性部门的info方法
        dept.info();

        // 在员工中调用数组输出方法
        System.out.println(Arrays.toString(loves));
    }
}
