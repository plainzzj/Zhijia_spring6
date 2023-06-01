package com.atguigu.spring6.iocxml.ditest;

import java.util.List;

// 部门类
public class Dept {
    private String dname;
    private List<Emp> empList;

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDname() {
        return dname;
    }

    public void info(){
        System.out.println("部门名称：" + dname);
        // 对List 进行输出
        for (int i = 0; i < empList.size(); i++) {
            System.out.print(i + " ");
        }
    }
}
