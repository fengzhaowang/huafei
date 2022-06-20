<%--
  Created by IntelliJ IDEA.
  User: fzw
  Date: 2022/6/20
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
    request.getSession().setAttribute("path",  path);
    request.getSession().setAttribute("basePath",  basePath);
%>
<html>
<head>
    <title>套餐详情</title>
</head>
<body>
套餐详情页面
</body>
</html>
