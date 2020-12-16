<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/12/8
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/student/save" method="post">

    学生姓名:<input type="text" name="stuname"/></td><br/>

    学生性别:
    <input type="radio" name="stusex" value="0">男
    <input type="radio" name="stusex" value="1">女<br/>

    学生状态：
    <input type="radio" name="stustatus" value="0">离校
    <input type="radio" name="stustatus" value="1">在校<br/>
    <select name="teaId">
        <option value="">请选择一位老师</option>
        <c:forEach items="${teacherList}" var="teacher">
            <option value="${teacher.teaId}">${teacher.teaName}</option>
        </c:forEach>
    </select>
            <br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
