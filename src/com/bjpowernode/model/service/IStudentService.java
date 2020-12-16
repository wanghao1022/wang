package com.bjpowernode.model.service;

import com.bjpowernode.entity.Student;
import com.bjpowernode.util.Pager;

import java.util.List;

/**
 * @ProjectName: 01-ssm
 * @Package: com.bjpowernode.model.service
 * @Description: java类作用描述
 * @Author: 王浩
 * @CreateDate: 2020/12/8 15:13
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public interface IStudentService {

    List<Student> list();

    //分页查询
    List<Student> list(Pager pager);

    void save(Student student);

    Student get(int stuid);

    int update(Student student);

    int delete(int stuid);
}
