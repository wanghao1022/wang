package com.bjpowernode.model.dao;

import com.bjpowernode.entity.Student;
import com.bjpowernode.util.Pager;

import java.util.List;

public interface IStudentIDao {
    int deleteByPrimaryKey(Integer stuid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer stuid);

    List<Student> selectAll();

    List<Student> selectByBatch(Pager pager);
    int searchCount();

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    // 当老师表删除后设置学生的teaId为null值
    void updateStudentTeaIdNull(Integer teaId);
}