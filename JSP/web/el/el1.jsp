<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/23
  Time: 23:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式</title>
</head>
<body>

    ${3>4}
    \${3>4}

<hr>
    <h3>算数运算符</h3>
    ${3 + 4}<br>
    ${3 * 4}<br>
    ${3 / 4}<br>
    ${3 div 4}<br>
    ${3 % 4}<br>
    ${3 mod 4}<br>

    <h3>比较运算符</h3>
    ${3 == 4}<br>
    ${3 < 4}<br>

    <h3>逻辑运算符</h3>
    ${3>4 && 3<4}<br>
    ${3>4 and 3<4}<br>
</body>
</html>
