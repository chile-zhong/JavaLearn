<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/24
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>if标签</title>
</head>
<body>
    <%--
        <c:if标签
           1.属性
             * test必须属性，接收Boolean表达式 即条件
                为true，显示if标签中内容，否者不显示
             * 一般情况下 test 属性会结合el 表达式一起使用
           2.注意：<c:if> 标签没有else 的情况的写法，如果需要使用，则可可以另外再添加一个<c:if>标签配合使用


    --%>
    <%
        //判断request域中的list集合是否为空，如果不为null则显示遍历集合
        List list = new ArrayList();
        list.add("aaaa");
        request.setAttribute("list",list);

        request.setAttribute("number",4);
    %>

    <c:if test="${not empty list}">
        遍历集合。。。
    </c:if>

    <c:if test="${number % 2 !=0}">
        ${number}是奇数
    </c:if>
</body>
</html>
