package com.bjpowernode.controller;

import com.bjpowernode.entity.User;
import com.bjpowernode.model.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @ProjectName: 01-ssm
 * @Package: com.bjpowernode.controller
 * @Description: java类作用描述
 * @Author: 王浩
 * @CreateDate: 2020/12/14 21:52
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
public class LoginController {

    @Autowired
    IUserService userService;

    @RequestMapping("login")
    void login(){

        //去登录页面
    }

    @RequestMapping("saveLogin")
    String saveLogin(User user, HttpSession session){
        //进行登录验证
        User userDB = userService.selectByAll(user.getPid(),user.getUsername());
        if (userDB == null){ //登录失败
            user.setMsg("登录失败，请检查用户名和密码是否匹配");

            return "login";
        }
        //登录成功
        session.setAttribute("LOGIN_USER",userDB);
        return "redirect:/";

    }
    @RequestMapping("logout")
    String logout(HttpSession session){

        session.removeAttribute("LOGIN_USER");

        return "redirect:/";
    }


}
