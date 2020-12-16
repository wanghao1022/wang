<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/12/9
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>教师管理</title>
    <script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/js/datePicker/WdatePicker.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    <script>
        function del(id) {
            if (confirm("确认执行删除吗？")){
                //true  执行删除
                window.location.href="${pageContext.request.contextPath}/teacher/delete?teaId="+id;
            }
        }
       function delBatch (){
            /*这里是标签选择器*/
            if ($("[name=\"tearIds\"]:checked").length > 0){
                //说明用户至少选中了一条
                if (confirm("请确认是否执行删除操作！")){
                    $("#teaForm").submit();
                }
            } else {
                //说明用户一条都没有选中
                alert("请至少选中一条数据!")
            }
        }

        $(function () {

            $("#selectAll").click(function () {
                $("[name=\"tearIds\"]").prop("checked",this.checked);

               // $("[name=\"tearIds\"]").prop("checked",$(this).prop("checked"));
            });
        });

    </script>
</head>
<body>
<form action="${pageContext.request.contextPath}/teacher/list" method="post">
    <!--
    param  是request.parameter的意思
    -->
   <%-- 教师姓名:<input type="text" name="teaName" value="${param.teaName}"><br/>
    教师性别:
    <input type="radio" name="teaSex" value=""  ${ empty param.teaSex? "checked='checked'":""}/>不限
    <input type="radio" name="teaSex" value="男"  ${ param.teaSex eq '男'? "checked='checked'":""}/>男
    <input type="radio" name="teaSex" value="女"  ${ param.teaSex eq '女'? "checked='checked'":""}/>女<br/>
    教师年龄：
    <input type="text" name="teaAge" value="${param.teaAge}" /><br/>
    <input type="submit" value="搜索">--%>

    教师姓名:<input type="text" name="teaName" value="${teacher.teaName}"><br/>
    教师性别:
    <input type="radio" name="teaSex" value=""  ${ empty teacher.teaSex? "checked='checked'":""}/>不限
    <input type="radio" name="teaSex" value="男"  ${ teacher.teaSex eq '男'? "checked='checked'":""}/>男
    <input type="radio" name="teaSex" value="女"  ${ teacher.teaSex eq '女'? "checked='checked'":""}/>女<br/>
    教师年龄：
   <%-- <input type="text" name="teaAge" value="${teacher.teaAge}" /><br/>--%>
    <input type="text" name="teaAgeBegin" value="${teacher.teaAgeBegin}"/>至<input type="text" name="teaAgeEnd" value="${teacher.teaAgeEnd}">岁<br/>
    入职时间:
    <input type="text" name="teaDateBegin" value="${teacher.teaDateBegin}" class="Wdate" onClick="WdatePicker()" readonly="readonly"/>
    至
    <input type="text" name="teaDateEnd" value="${teacher.teaDateEnd}" class="Wdate" onClick="WdatePicker()" readonly="readonly"/>
    <br/>
    <input type="submit" value="搜索">
</form>

<a href="${pageContext.request.contextPath}/teacher/edit">教师添加</a><br/><br/>
<a href="javascript:delBatch();">批量删除</a><br/>
<input type="checkbox" id="selectAll"/>全选/取消<br/>


<form  id="teaForm" action="${pageContext.request.contextPath}/teacher/deleteBatch" method="post">
<c:forEach var="teacher" items="${teacherList}">
    <input type="checkbox" name="tearIds" value="${teacher.teaId}">
    ${teacher.teaId},${teacher.teaName},${teacher.teaSex},${teacher.teaAge},${teacher.teaDate}
    <a href="${pageContext.request.contextPath}/teacher/edit?teaId=${teacher.teaId}">修改</a>
    <a href="javascript:del(${teacher.teaId});">删除</a>
    <br/>
</c:forEach>
    <%@include file="/inc/pager.jsp"%>
</body>
</html>
