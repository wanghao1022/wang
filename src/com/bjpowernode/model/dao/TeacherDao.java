package com.bjpowernode.model.dao;

import com.bjpowernode.entity.Teacher;
import com.bjpowernode.util.Pager;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherDao {
    int deleteByPrimaryKey(Integer teaId);

    int deleteBatch(Integer[] teaIds);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer teaId);

    List<Teacher> selectAll();

    int selectTotalCount();

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    List<Teacher> selectByTeacher(Teacher teacher);

    List<Teacher> selectByBatch(Pager pager);

    List<Teacher> searchByBatch(@Param("teacher") Teacher teacher, @Param("pager") Pager pager);

    int searchTotalCount(@Param("teacher") Teacher teacher);


}