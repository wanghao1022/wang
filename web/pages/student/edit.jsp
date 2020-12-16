<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/12/8
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/student/saveUpdate" method="post">
     <input type="hidden" name="stuid" value="${student.stuid}">
    学生姓名:<input type="text" name="stuname" value="${student.stuname}"/><br/>
    学生性别:<input type="radio" name="stusex" value="0" ${student.stusex == 0? "checked":""}/>男
             <input type="radio" name="stusex" value="1" ${student.stusex == 1? "checked":""}/>女<br/>
    学生状态:<input type="radio" name="stustatus" value="0" ${student.stustatus==0?"checked":""}/>离校
             <input type="radio" name="stustatus" value="1" ${student.stustatus==1?"checked":""}/>在校<br/>
    指导老师: <select name="teaId">
                <option value="">请选择一位老师</option>
                <c:forEach items="${teacherList}" var="teacher">
                    <option value="${teacher.teaId}" ${student.teaId eq teacher.teaId? "selected ='selected '" : ""}>${teacher.teaName}</option>
                </c:forEach>
            </select>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
