package com.atguigu.spring6.iocxml.dimap;

import java.util.List;
import java.util.Map;

public class Student {
    private String sid;
    private String sname;

    // Map类型的属性
    private Map<String, Teacher> teacherMap;
    private List<Lesson> lessonList;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public void run(){
        System.out.println("学生编号" + sid + "学生名称" + sname);
        System.out.println(teacherMap);
        System.out.println(lessonList);
    }
}
