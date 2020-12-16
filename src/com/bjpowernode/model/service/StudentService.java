package com.bjpowernode.model.service;

import com.bjpowernode.entity.Student;
import com.bjpowernode.model.dao.IStudentIDao;
import com.bjpowernode.util.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: 01-ssm
 * @Package: com.bjpowernode.model.service
 * @Description: java类作用描述
 * @Author: 王浩
 * @CreateDate: 2020/12/8 15:14
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service
public class StudentService implements IStudentService {

    @Autowired
    IStudentIDao iStudentIDao;

    @Override
    public List<Student> list() {
        return iStudentIDao.selectAll();
    }

    @Override
    public List<Student> list(Pager pager) {
        pager.setTotalRowCount(iStudentIDao.searchCount());
        return iStudentIDao.selectByBatch(pager);
    }

    @Override
    public void save(Student student) {
        iStudentIDao.insert(student);
    }


    @Override
    public Student get(int stuid) {
        return iStudentIDao.selectByPrimaryKey(stuid);
    }

    @Override
    public int update(Student student) {
       return iStudentIDao.updateByPrimaryKey(student);

    }

    @Override
    public int delete(int stuid) {
       return iStudentIDao.deleteByPrimaryKey(stuid);
    }
}
