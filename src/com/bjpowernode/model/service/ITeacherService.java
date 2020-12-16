package com.bjpowernode.model.service;

import com.bjpowernode.entity.Teacher;
import com.bjpowernode.util.Pager;

import java.util.List;

/**
 * @ProjectName: 01-ssm
 * @Package: com.bjpowernode.model.service
 * @Description: java类作用描述
 * @Author: 王浩
 * @CreateDate: 2020/12/9 19:57
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public interface ITeacherService {
    int deleteByPrimaryKey(Integer teaId);

    int deleteBatch(Integer[] teaIds);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer teaId);

    List<Teacher> selectAll();

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    Teacher get(Integer teaId);

    List<Teacher> selectAll(Teacher teacher);

    List<Teacher> selectByBatch(Pager pager);

    List<Teacher> searchByBatch(Teacher teacher,Pager pager);

}
