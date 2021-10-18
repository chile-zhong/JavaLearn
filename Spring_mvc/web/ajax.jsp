<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.6.0.js"></script>
    <script>
        var userList = new Array();
        userList.push({username:"zhangsan",age:19});
        userList.push({username:"lisi",age:20});

        $.ajax({
            type:"POST",
            url: "/Spring_mvc/quick15",
            data: JSON.stringify(userList),
            contentType:"application/json;charset=utf-8"
        });
    </script>
</head>
<body>

</body>
</html>
