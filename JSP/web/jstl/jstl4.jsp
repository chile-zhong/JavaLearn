<%@ page import="com.lxg.domain.User" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/24
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        List<User> list = new ArrayList<User>();
        list.add(new User("张三",18,new Date()));
        list.add(new User("李四",19,new Date()));
        list.add(new User("王五",20,new Date()));
        list.add(new User("赵六",21,new Date()));
        request.setAttribute("list",list);
    %>
<table border="1" width="500" align="center">
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>生日</td>
    </tr>

    <c:forEach items="${list}" var="user" varStatus="s">

        <c:if test="${s.count mod 2 !=0}">
            <tr bgcolor="red">
                <td>${s.count}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.birStr}</td>
            </tr>
        </c:if>
        <c:if test="${s.count mod 2 ==0}">
            <tr bgcolor="green">
                <td>${s.count}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.birStr}</td>
            </tr>
        </c:if>
    </c:forEach>

</table>
</body>
</html>
