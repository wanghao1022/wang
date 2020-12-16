package com.bjpowernode.util;

import com.bjpowernode.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ProjectName: 01-ssm
 * @Package: com.bjpowernode.util
 * @Description: java类作用描述
 * @Author: 王浩
 * @CreateDate: 2020/12/15 10:18
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class LoginInterceptor  implements HandlerInterceptor {

    //此方法在进入Controller之前被调
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        User user = (User) request.getSession().getAttribute("LOGIN_USER");

        if (user == null){

            //向登录入口做重定向
            response.sendRedirect(request.getContextPath()+"/login");

            //未登录，返回false表示，无法闯过此拦截器
            return false;
        }


        return true;
    }
}
