<%--
  Created by IntelliJ IDEA.
  User: mason
  Date: 2017/5/31
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
//    System.out.println(basePath);
//    System.out.println(path);
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE-edge">
<meta name="viewport" conent="width=device-width,initial-scale=1">
<link href="<%=path%>/bootstrap/css/bootstrap.css" rel="stylesheet">
<script src="<%=path%>/bootstrap/js/bootstrap.min.js"></script>

