<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <h1>first servlet</h1>
    <a href="servlet5">Get方式请求servlet</a>
    <form action="servlet5" method="post">
      <input type="submit" value="Post方式请求servlet"/>
    </form>

    <form action="servlet6" method="get">
      用户名：<input type="text" name="name" value=""><br>
      密码：<input type="text" name="pwd" value=""><br>
      <%--爱好:<br>
      <input type="checkbox" name="fav" value="1">Java
      <input type="checkbox" name="fav" value="2">C#
      <input type="checkbox" name="fav" value="3">Python--%>
      <input type="submit" value="登录">
    </form>
  </head>
  <body>
  $END$
  </body>
</html>
