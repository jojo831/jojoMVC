<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="head.jsp" %>
<%--
  Created by IntelliJ IDEA.
  User: mason
  Date: 2017/5/25
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
spring mvc -successfully!!!!!!!!!!!!!!!!!!!!!!!!!
<c:if test="${arrlist==null || fn:length(arrlist) == 0}">
    暂无记录
</c:if>

<table border="1">
    <tr>
        <td>serial_number</td>
        <td>url信息描述</td>
        <td>所关联的url地址</td>
        <td>SQL查询语句</td>
        <td>date</td>
    </tr>
    <c:forEach items="${arrlist}" var="item" varStatus="status">
        <tr>
            <td>${item.id}</td>
            <td>${item.url_description}</td>
            <td><a href="${item.link_on_url}">${item.link_on_url}</a></td>
            <td>${item.sql_language}</td>
            <td>${item.insertionDate}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

