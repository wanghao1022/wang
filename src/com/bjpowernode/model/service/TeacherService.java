package com.bjpowernode.model.service;

import com.bjpowernode.entity.Teacher;
import com.bjpowernode.model.dao.IStudentIDao;
import com.bjpowernode.model.dao.TeacherDao;
import com.bjpowernode.util.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: 01-ssm
 * @Package: com.bjpowernode.model.service
 * @Description: java类作用描述
 * @Author: 王浩
 * @CreateDate: 2020/12/9 19:58
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service
public class TeacherService implements ITeacherService {
    @Autowired
    private TeacherDao teacherDao;
    @Autowired
    private IStudentIDao studentDao;

    @Override
    public int deleteByPrimaryKey(Integer teaId) {
        //执行教师删除操作后，将学生信息的teaid设置为null
        studentDao.updateStudentTeaIdNull(teaId);
        return teacherDao.deleteByPrimaryKey(teaId);
    }

    @Override
    public int deleteBatch(Integer[] teaIds) {
        return teacherDao.deleteBatch(teaIds);
    }

    @Override
    public int insert(Teacher record) {
        return teacherDao.insert(record);
    }

    @Override
    public int insertSelective(Teacher record) {
        return teacherDao.insertSelective(record);
    }

    @Override
    public Teacher selectByPrimaryKey(Integer teaId) {
        return teacherDao.selectByPrimaryKey(teaId);
    }

    @Override
    public List<Teacher> selectAll() {
        return teacherDao.selectAll();
    }

    @Override
    public int updateByPrimaryKeySelective(Teacher record) {
        return teacherDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Teacher record) {
        return teacherDao.updateByPrimaryKey(record);
    }

    @Override
    public Teacher get(Integer teaId) {
        return teacherDao.selectByPrimaryKey(teaId);
    }

    @Override
    public List<Teacher> selectAll(Teacher teacher) {
        return teacherDao.selectByTeacher(teacher);
    }

    @Override
    public List<Teacher> selectByBatch(Pager pager) {
        pager.setTotalRowCount(teacherDao.selectTotalCount());
        return teacherDao.selectByBatch(pager);
    }

    //按条件进行分页查询
    @Override
    public List<Teacher> searchByBatch(Teacher teacher, Pager pager) {
        pager.setTotalRowCount(teacherDao.searchTotalCount(teacher));
        return teacherDao.searchByBatch(teacher,pager);
    }


}
