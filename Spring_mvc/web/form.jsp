<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/10
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/quick14" method="post">
        <%--第一个对象--%>
        <input type="text" name="userList[0].username"><br>
        <input type="text" name="userList[0].age"><br>
        <input type="text" name="userList[1].username"><br>
        <input type="text" name="userList[1].age"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
