package com.bjpowernode.entity;

import java.io.Serializable;

/**
 * t_student
 * @author 
 */
public class Student implements Serializable {
    /*
    学生id
     */
    private Integer stuid;

    /*
   学生姓名
    */
    private String stuname;

    /*
   学生性别( 0 男  1 女)
    */
    private Integer stusex;
    /*
   状态( 0 离校 1 在校)
    */
    private Integer stustatus;

    /*
    外键：老师类的主键
     */
    private Integer teaId;

    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    private static final long serialVersionUID = 1L;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public Integer getStusex() {
        return stusex;
    }

    public void setStusex(Integer stusex) {
        this.stusex = stusex;
    }

    public Integer getStustatus() {
        return stustatus;
    }

    public void setStustatus(Integer stustatus) {
        this.stustatus = stustatus;
    }
}