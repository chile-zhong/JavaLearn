<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/24
  Time: 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el表达之获取域对象的属性值</title>
</head>
<body>
<%
 request.setAttribute("name","张三");
 session.setAttribute("name","李四");
 session.setAttribute("age",13);
%>
<h3>获取域对象的属性值</h3>
${sessionScope.name}
${sessionScope.age}
${requestScope.name}

<%--直接使用键名--%>
${name}
</body>
</html>
