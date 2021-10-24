<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/23
  Time: 22:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>500</title>
</head>
<body>
<h1>服务器正忙...</h1>
<%
    /*只有标识了该页面是错误页面
    * 即：isErrorPage="true"
    * 才能使用exception内置对象
    * */
    String message = exception.getMessage();
    out.write(message);
%>
</body>
</html>
