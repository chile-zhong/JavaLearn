<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/23
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="top.jsp"%>
<html>
<head>
    <title>home</title>
</head>
<body>
    <h1>主体信息</h1>

    <%
     pageContext.setAttribute("msg","hello");

     /*可以通过pageContext获取其他八个内置对象*/
        pageContext.getRequest();
        pageContext.getResponse();
        pageContext.getException();
        pageContext.getPage();
        pageContext.getOut();
        pageContext.getServletContext();
        pageContext.getServletConfig();
        pageContext.getSession();
    %>

    <%
        String msg = (String) pageContext.getAttribute("msg");
        out.write(msg);
    %>
</body>
</html>
