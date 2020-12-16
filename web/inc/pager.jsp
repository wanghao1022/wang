
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

当前第${pager.no}页，总共${pager.totalPageNo}页，总共${pager.totalRowCount}条记录
<c:if test="${pager.hasPrev}">
    <a href="${pager.url}">首页</a>
</c:if>
<c:if test="${ not pager.hasPrev}">
    首页
</c:if>
<c:if test="${pager.hasPrev}">
    <a href="${pager.url}&no=${pager.no - 1}">上一页</a>
</c:if>

<c:if test="${ not pager.hasPrev}">
    上一页
</c:if>

<c:if test="${pager.hasNext }">
    <a href="${pager.url}&no=${pager.no + 1}">下一页</a>
</c:if>
<c:if test="${ not pager.hasNext }">
    下一页
</c:if>

<c:if test="${pager.hasNext }">
    <a href="${pager.url}&no=${pager.totalPageNo}">尾页</a>
</c:if>
<c:if test="${ not pager.hasNext }">
    尾页
</c:if>

去<input type="text" onchange="changePage(this);"/>页
去
<select  onchange="window.location.href='${pageContext.request.contextPath}/teacher/list?no='+this.value" >
    <c:forEach var="i" begin="1" end="${pager.totalPageNo}">
        <option value="${i}" ${pager.no eq i ? "selected ='selected'":""}>${i}</option>
    </c:forEach>
</select>
页
</form>

<script>
    function changePage(input) {
        //进行跳转
        window.location.href="${pageContext.request.contextPath}/teacher/list?no="+input.value;
    }
</script>
