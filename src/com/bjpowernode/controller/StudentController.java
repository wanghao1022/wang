package com.bjpowernode.controller;

import com.bjpowernode.entity.Student;
import com.bjpowernode.entity.Teacher;
import com.bjpowernode.model.service.IStudentService;
import com.bjpowernode.model.service.ITeacherService;
import com.bjpowernode.util.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


/**
 * @ProjectName: 01-ssm
 * @Package: com.bjpowernode.controller
 * @Description: java类作用描述
 * @Author: 王浩
 * @CreateDate: 2020/12/8 14:44
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired
    IStudentService studentService;
    @Autowired
    ITeacherService teacherService;

    @RequestMapping( "list")
    List<Student> list (Pager pager){
        //使用分页查询
      /* return studentService.list();*/
        return studentService.list(pager);

    }

    //这一块必须写 哪怕是空的
   @RequestMapping("add")
   List<Teacher> add(){
       List<Teacher> teacherList= teacherService.selectAll();
       return teacherList;
    }

    @RequestMapping("save")
    String save(Student student){
        studentService.save(student);
        //重定向  返回一个视图的名称
        return "redirect:list";
    }

    @RequestMapping("edit")
    //使用这种方式，形参列表不能使用list，只能用ArrayList  因为list是一个接口，无法实例化
    //但是map方式可以
    Student edit(ArrayList<Teacher> list, int stuid){

        list.addAll(teacherService.selectAll());
        return studentService.get(stuid);
    }

    @RequestMapping("saveUpdate")
    String edit(Student student){
        studentService.update(student);
        return "redirect:list";
    }
    @RequestMapping("delete")
    String del(int stuid){
        studentService.delete(stuid);
        return "redirect:list";
    }
    @RequestMapping("student")
    Student get(int stuid){
       return studentService.get(stuid);
    }


}
