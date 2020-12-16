package com.bjpowernode.util;

import javax.servlet.*;
import java.io.IOException;

/**
 * @ProjectName: 01-ssm
 * @Package: com.bjpowernode.util
 * @Description: java类作用描述
 * @Author: 王浩
 * @CreateDate: 2020/12/10 9:12
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class CharacterEncodingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        filterChain.doFilter(servletRequest,servletResponse);

    }
}
