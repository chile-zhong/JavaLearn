<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/9/8
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="request" method="get">
    用户名：<input type="text" name="name" value=""><br>
    密码：<input type="text" name="pwd" value=""><br>
    爱好:<br>
    <input type="checkbox" name="fav" value="1">Java
    <input type="checkbox" name="fav" value="2">C#
    <input type="checkbox" name="fav" value="3">Python
    <input type="submit" value="登录">
  </form>
  </body>
</html>
