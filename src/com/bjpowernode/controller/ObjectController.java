package com.bjpowernode.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bjpowernode.entity.City;
import com.bjpowernode.model.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @ProjectName: 01-ssm
 * @Package: com.bjpowernode.controller
 * @Description: java类作用描述
 * @Author: 王浩
 * @CreateDate: 2020/12/16 11:11
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
public class ObjectController {


    @Autowired
    private ICityService cityService;


    @RequestMapping("/objectTest01")
    public void objectTest01(HttpServletResponse response) throws IOException {
        List<City> cities = cityService.list();

        String citiedJson = JSONObject.toJSONString(cities);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(citiedJson);
    }

    @RequestMapping("/objectTest02")
    @ResponseBody
    public List<City> objectTest02(HttpServletResponse response) throws IOException {
        List<City> cities = cityService.list();
        return cities;
    }

}
