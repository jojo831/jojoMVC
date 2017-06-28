<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="head.jsp" %>

<%--
  Created by IntelliJ IDEA.
  User: mason
  Date: 2017/5/31
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <%--<base href="<%=basePath%>">--%>
    <title>Title</title>
</head>
<body>
<form id="form1" name="form1" method="get" action="<%=basePath%>info/showMsg">
    <p>
        <label for="textfield1">Text Field:</label>
        <input type="text" name="textfield1" id="textfield1" value="vessels">
        <label for="textfield2">Text Field:</label>
        <input type="text" name="textfield2" id="textfield2" value="MASK">
    </p>
    <p>
        <label for="textfield3">Text Field:</label>
        <input type="text" name="textfield3" id="textfield3" value="tab1">
        <label for="textfield4">Text Field:</label>
        <input type="text" name="textfield4" id="textfield4" value="tab2">
    </p>
    <p>
        <label for="textfield5">Text Field:</label>
        <input type="text" name="textfield5" id="textfield5" value="tab3"><br>
        <textarea name="textfield6" id="textfield6" cols="30" rows="10">SELECT vessel1,mask1,backupcolumn1 FROM rest_demo.board_company2</textarea>
        <br><input type="submit" name="button" id="button" value="提交/保存">
        <input type="button" name="button1" id="button1" value="发布/待">
    </p><input type="hidden" name="token" value="${token}" />
</form>
</body>
</html>
