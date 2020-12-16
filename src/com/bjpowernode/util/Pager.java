package com.bjpowernode.util;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Enumeration;

/**
 * @ProjectName: 01-ssm
 * @Package: com.bjpowernode.util
 * @Description: java类作用描述
 * @Author: 王浩
 * @CreateDate: 2020/12/14 10:09
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class Pager {
    //当前页号
    private int no = 1;
    //每页纪录数
    private int pageNo = 10;
    //起始行号
    private int skipNo;
    //总共多少条记录
    private int totalRowCount;
    //总共多少页
    private int totalPageNo;
    //是否有上一页
    private boolean hasPrev;
    //是否有下一页
    private boolean hasNext;

    public boolean isHasPrev() {
        return hasPrev;
    }

    public void setHasPrev(boolean hasPrev) {
        this.hasPrev = hasPrev;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    //设置url地址
    private String url;

    public Pager() {

        //从本地线程中获取请求
        HttpServletRequest request = ((ServletRequestAttributes) (RequestContextHolder.currentRequestAttributes())).getRequest();
        //获取当前的请求地址
        String uri = request.getRequestURI() + "? 1=1";//${pageContext.request.contextPath}/teacher/list
        //获取请求当中的所有参数名称
        Enumeration<String> parameterNames = request.getParameterNames();
        //迭代所请求当中的所有参数名称
        while (parameterNames.hasMoreElements()) {
            //取出参数名称
            String paramName = parameterNames.nextElement();
            //取出参数名称对应的值
            String paramValue = request.getParameter(paramName);

            //如果参数的值不为空，并且参数不为常驻参数，则对参数进行拼接
            if (paramValue != null && !paramValue.equals("") && !paramName.equals("no")) {

                //对地址栏参数做转码
                try {
                    paramValue = URLEncoder.encode(paramValue,"UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                uri += "&" + paramName + "=" + paramValue;
            }
        }
        //为url属性赋值
        url = uri;
    }

    //是否有上一页/首页的方法
    public void reCountHasPrev(){
        this.hasPrev = (this.no !=1);
    }

    //是否有下一页/首页的方法
    public void reCountHasNext(){
        this.hasNext = (this.no !=this.totalPageNo);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //总页数=总记录数/每页的纪录数(向上取整)
    public void reCountTotalPageNo() {
        this.totalPageNo = (int) Math.ceil(this.totalRowCount * 1.0 / this.pageNo);
    }


    public int getTotalPageNo() {
        return totalPageNo;
    }

    public void setTotalPageNo(int totalPageNo) {
        this.totalPageNo = totalPageNo;
        reCountTotalPageNo();
    }

    public int getTotalRowCount() {
        return totalRowCount;
    }

    //在执行总记录数的set方法时将总页数的set方法页执行一次
    public void setTotalRowCount(int totalRowCount) {
        this.totalRowCount = totalRowCount;
        //重新计算总页数
        reCountTotalPageNo();
        //重新计算是否有下一页（尾页）
        reCountHasNext();
    }

    //计算每一页的起始条数
    public  void  reCountSkipNo(){
        this.skipNo = (this.no - 1) * this.pageNo;
    }

    public int getSkipNo() {
        return skipNo;
    }

    public void setSkipNo(int skipNo) {
        this.skipNo = skipNo;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
        //重新计算起始行号的值
        reCountSkipNo();
        //重新计算是否有上一页(首页)
        reCountHasPrev();
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getSkipNp() {
        return skipNo;
    }

    public void setSkipNp(int skipNo) {
        this.skipNo = skipNo;
    }
}
