package com.bjpowernode.entity;

import java.io.Serializable;

/**
 * t_teacher
 * @author 
 */
public class Teacher implements Serializable {
    private Integer teaId;

    private String teaName;

    private Integer teaAge;

    private Integer teaAgeBegin;
    private Integer teaAgeEnd;

    private String teaSex;

    private String teaDate;

    private String teaDateBegin;
    private String teaDateEnd;

    private static final long serialVersionUID = 1L;

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public Integer getTeaAge() {
        return teaAge;
    }

    public void setTeaAge(Integer teaAge) {
        this.teaAge = teaAge;
    }

    public Integer getTeaAgeBegin() {
        return teaAgeBegin;
    }

    public void setTeaAgeBegin(Integer teaAgeBegin) {
        this.teaAgeBegin = teaAgeBegin;
    }

    public Integer getTeaAgeEnd() {
        return teaAgeEnd;
    }

    public void setTeaAgeEnd(Integer teaAgeEnd) {
        this.teaAgeEnd = teaAgeEnd;
    }

    public String getTeaSex() {
        return teaSex;
    }

    public void setTeaSex(String teaSex) {
        this.teaSex = teaSex;
    }

    public String getTeaDate() {
        return teaDate;
    }

    public void setTeaDate(String teaDate) {
        this.teaDate = teaDate;
    }

    public String getTeaDateBegin() {
        return teaDateBegin;
    }

    public void setTeaDateBegin(String teaDateBegin) {
        this.teaDateBegin = teaDateBegin;
    }

    public String getTeaDateEnd() {
        return teaDateEnd;
    }

    public void setTeaDateEnd(String teaDateEnd) {
        this.teaDateEnd = teaDateEnd;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


}