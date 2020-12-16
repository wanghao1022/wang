<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/12/8
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>添加页面</title>
</head>
<body>
<!--放入model中的是Teacher对象  首字母小写为teacher  与形参中的对象名无关，只与形参中的类型有关-->
<%--<form action="${pageContext.request.contextPath}/teacher/save" method="post">
    <input type="hidden" name="teaId" value="${teacher.teaId}">
    教师姓名:<input type="text" name="teaName" value="${teacher.teaName}"/><br/>
    教师性别:
    <input type="radio" name="teaSex" value="男"
           ${teacher.teaSex eq "男"?"checked='checked'":""}>男
    <input type="radio" name="teaSex" value="女"
           ${teacher.teaSex eq "女"?"checked='checked'":""}>女<br/>
    教师年龄：
    <input type="text" name="teaAge" value="${teacher.teaAge}" >
    <input type="submit" value="提交">
</form>--%>

<!--使用spring中的form提交-->
<f:form action="${pageContext.request.contextPath}/teacher/save" modelAttribute="teacher">
    <f:hidden path="teaId"/>
    教师姓名:<f:input path="teaName"/><br/>
    教师性别:
    <f:radiobutton path="teaSex" value="男" label="男"/>
    <f:radiobutton path="teaSex" value="女" label="女"/><br/>
    教师年龄:<f:input path="teaAge"/><br/>
    <input type="submit" value="提交">

</f:form>
</body>
</html>
