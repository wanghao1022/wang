<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/12/8
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生信息管理</title>
</head>
<body>
<table border="2px">
    <tr>
        <td>学生编号</td>
        <td>学生姓名</td>
        <td>学生性别</td>
        <td>学生状态</td>
        <td>老师姓名</td>
        <td colspan="2">修改和删除</td>
    </tr>
    <c:forEach items="${studentList}" var="student">
    <tr>
        <td>${student.stuid}</td>
        <td>${student.stuname}</td>
        <td>${student.stusex == 0? "男":"女"}</td>
        <td>${student.stustatus ==0?"离校":"在校"}</td>
        <td>${student.teacher.teaName}</td>
        <td><a href="${pageContext.request.contextPath}/student/edit?stuid=${student.stuid}">修改</a></td>
        <td><a href="${pageContext.request.contextPath}/student/delete?stuid=${student.stuid}">删除</a></td>
        <td><a href="${pageContext.request.contextPath}/student/student?stuid=${student.stuid}"></a></td>
    </tr>
</c:forEach>
    <td><a href="${pageContext.request.contextPath}/student/add">学生添加</a></td>

</table>
<%@include file="/inc/pager.jsp"%>
</body>
</html>
