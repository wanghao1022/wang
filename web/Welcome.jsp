<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>

<c:if test="${not empty LOGIN_USER}">
    您好，欢迎${LOGIN_USER.username}使用系统
    <a href="${pageContext.request.contextPath}/logout">退出</a><br/>
</c:if>

<c:if test="${empty LOGIN_USER}">
    <a href="${pageContext.request.contextPath}/login">登录</a><br/>
</c:if>

<a href="${pageContext.request.contextPath}/student/list">学生管理</a><br/>
<a href="${pageContext.request.contextPath}/teacher/list">教师管理</a><br/>
<a href="${pageContext.request.contextPath}/static">静态资源引用</a><br/>
</body>
</html>