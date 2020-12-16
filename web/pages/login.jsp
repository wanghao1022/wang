<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/12/15
  Time: 8:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<div  style="color: red">${user.msg}</div>
<form action="${pageContext.request.contextPath}/saveLogin" method="post">

用户名：<input name="username"/><br/>
密码：<input name="pid"/><br/>
<input type="submit" value="登录">

</form>
</body>
</html>
