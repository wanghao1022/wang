package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceView;

/**
 * @ProjectName: 01-ssm
 * @Package: com.bjpowernode.controller
 * @Description: java类作用描述
 * @Author: 王浩
 * @CreateDate: 2020/12/14 21:59
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
public class IndexController {

    @RequestMapping("index")
        ModelAndView index(){
             ModelAndView modelAndView = new ModelAndView();

             modelAndView.setView(new InternalResourceView("/Welcome.jsp"));

            return modelAndView;
        }

}
