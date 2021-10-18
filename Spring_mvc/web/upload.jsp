<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/12
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/quick22" method="post" enctype="multipart/form-data">
        名称:<input type="text" name="username"><br>
        文件:<input type="file" name="upload"><br>
        <input type="submit" value="提交">
    </form>

    <%--多文件上传--%>
    <form action="${pageContext.request.contextPath}/quick23" method="post" enctype="multipart/form-data">
        名称:<input type="text" name="username"><br>
        文件1:<input type="file" name="upload"><br>
        文件2:<input type="file" name="upload"><br>
        文件3:<input type="file" name="upload"><br>
        文件4:<input type="file" name="upload"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
