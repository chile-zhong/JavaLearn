<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/18
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
    <form action="/request3" method="post">
        姓名:<input type="text" name="username" placeholder="请输入用户名"><br>
        密码:<input type="text" name="password" placeholder="请输入密码"><br>
        爱好:<input type="checkbox" name="hobby" value="吃饭">吃饭
            <input type="checkbox" name="hobby" value="睡觉">睡觉
            <input type="checkbox" name="hobby" value="玩游戏">玩游戏
        <br>
        <input type="submit" value="注册">
    </form>
</body>
</html>
