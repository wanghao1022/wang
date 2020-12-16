<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/12/10
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>静态资源文件加载</title>
</head>
<body>
<!--
访问静态资源文件必须加上网站名  即${pageContext.request.contextPath}
-->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/static.css" >
<script src="${pageContext.request.contextPath}/js/static.js"></script>
<div>
    静态资源文件加载

</div>
<img src="${pageContext.request.contextPath}/images/杀生丸.jpg"/>
</body>
</html>
