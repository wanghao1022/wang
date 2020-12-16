package com.bjpowernode.controller;

import com.bjpowernode.entity.City;
import com.bjpowernode.model.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: 01-ssm
 * @Package: com.bjpowernode.controller
 * @Description: java类作用描述
 * @Author: 王浩
 * @CreateDate: 2020/12/8 10:08
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
@RequestMapping("city")  //命名空间（namespace）
public class CityController {

    @Autowired
    ICityService cityService;

    //1.原始的ServletAPI实现
  /*  @RequestMapping("list")
    public void list(HttpServletRequest request, HttpServletResponse response) throws Exception{
        //1.接收请求当中的参数
        //2.调用模型层
        List<City> cityList =cityService.list();
        //3.往作用域放值
        request.setAttribute("cityList",cityList);
        //4.响应  使用请求转发
        request.getRequestDispatcher("/pages/city/list.jsp").forward(request,response);
    }
*/


  //2.使用ModelAndView实现
  /*  @RequestMapping("list")
     ModelAndView list() throws Exception{
        ModelAndView modelAndView = new ModelAndView();

        //1.接收请求当中的参数
        //2.调用模型层
        List<City> list = cityService.list();
        //3.往作用域放值
        modelAndView.addObject("cityList",list);
        //4.响应用户,( 请求转发，重定向)
        //modelAndView.setView(new InternalResourceView("/pages/city/list.jsp"));

        return modelAndView;
    }
*/

  //3.返回视图的名称,  list  视图的名称: 被视图解析器的前辍与后辍包夹的那个字符串
   /* @RequestMapping("list")
    String list(ArrayList<City> list){
        //2.调用模型层
        List<City> listDB =cityService.list();
        list.addAll(listDB);
        //3.往作用域放值(request,session)
        //什么都不用做，形参list会自动加入到request的attribute当中
        //4.响应
        return "city/list";
    }*/

   //4.返回视图的名称 map
   /* @RequestMapping("list")
    String list(Map<String,Object> map){
        //2.调用模型层
        List<City> listDB = cityService.list();
        //3.往作用域放值
        map.put("cityList",listDB);
        //4.请求转发
        return "city/list";
    }*/

   //5.使用约定实现(返回void)
  /*  @RequestMapping("list")
    void list(Map<String,Object> map){
        //2.调用模型层
        List<City> listDB = cityService.list();
        //3.往作用域放值
        map.put("cityList",listDB);
        //4.请求转发,约定: 当没有指明要做何种响应的时候，默认请求转发到
        // 视图解析器的前辍 + namespace + action + 视图解析器的后辍
    }*/

  //6.使用约定实现(返回void)
    /*@RequestMapping("list")
    public void list(Map<String,Object> map) throws Exception{

        //1.接收请求当中的参数
        //2.调用模型层
        List<City> cityList = cityService.list();
        //3.往作用域放值
        map.put("cityList",cityList);
        //4.按照约定进行请求转发
    }*/

 /*   //7.使用约定实现(返回Collection)
    @RequestMapping("list")
    public List<City> list() throws Exception{
        //1.请求参数
        //2.调用模型层
        List<City> cityList = cityService.list();
        //3.往作用域放值 返回集合，此集合自动进入到request作用域
        //4.响应
        return cityList;
    }
*/

 //8.使用约定实现(返回Map)
  /*  @RequestMapping("list")
    public Map<String,Object> list() throws Exception{
        //1.接收请求当中的参数
        //2.调用模型层
        List<City> cityList=cityService.list();
        //3.往作用域中放值
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("cityList",cityList);
        //返回map，此map中所有的entry自动进入到request作用域
        //4.响应
        return map;
    }
*/


   /* @RequestMapping("list")
    List<City> test(){
        return cityService.list();
    }*/

}
