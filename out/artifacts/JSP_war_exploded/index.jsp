<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="500.jsp" %>

<%--
导入标签库
prefix:前缀
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <%--<%@include file="top.jsp"%>

    <% String manager= "mr"%>
    管理员:<%=manager%>
    <%= "管理员"+manager%>
    <%= 5+6%>

    <br>--%>
    <h1>九九乘法表</h1>
    <%
    String str="";
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j < i; j++) {
                str+=j+"*"+i+"="+j*i;
                str+="&nbsp;";
            }
            str+="<br>";
        }
    %>
    <table style="width: 100%;height: 50%;">
        <tr>
            <td>
                <%=str%>
            </td>
        </tr>
    </table>

    <%--演示出现错误跳转页面--%>
    <%--<%
     int i = 3/0;
    %>--%>



</body>
</html>
