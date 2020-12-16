package com.bjpowernode.controller;

import com.bjpowernode.entity.Teacher;
import com.bjpowernode.model.service.ITeacherService;
import com.bjpowernode.util.Pager;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ProjectName: 01-ssm
 * @Package: com.bjpowernode.controller
 * @Description: java类作用描述
 * @Author: 王浩
 * @CreateDate: 2020/12/9 20:02
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    private ITeacherService teacherService;
    @RequestMapping("list")
     List<Teacher> list(Teacher teacher, Pager pager){
        /*return teacherService.selectAll();*/
       /* return teacherService.selectAll(teacher);*/
       return  teacherService.searchByBatch(teacher,pager);
    }

    //教师添加或者教师修改的入口
    @RequestMapping("edit")
 /*   Teacher edit(Integer teaId){
        return teacherService.get(teaId);

    }*/

     void edit(Teacher teacher ,Integer teaId){
         if (teaId !=null){ //说明是从修改进入的
             Teacher teacherDB = teacherService.get(teaId);
             //将teacherDB的信息复制到teacher中
             //使用BeanUtils类下的函数
             BeanUtils.copyProperties(teacherDB,teacher);
         }
     }
    /**
     * 保存或者修改教师信息
     * @param teacher
     * @return
     */
    @RequestMapping("save")
    String save(Teacher teacher){

        if (teacher.getTeaId()!=null){
            //执行修改
           teacherService.updateByPrimaryKey(teacher);
        }else {
            //执行添加
            teacherService.insert(teacher);
        }
        return "redirect:list";
    }
    //教师删除操作
    @RequestMapping("delete")
    String delete(int teaId){
        teacherService.deleteByPrimaryKey(teaId);
        return "redirect:list";
    }
    //教师批量删除操作
    @RequestMapping("deleteBatch")
    String deleteBatch(Integer[] tearIds){
        teacherService.deleteBatch(tearIds);
        return "redirect:list";
    }



}
