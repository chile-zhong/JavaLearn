<%@ page import="com.lxg.domain.User" %>
<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/24
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取对象数据</title>
</head>
<body>
<%
    User user = new User();
    user.setName("张三");
    user.setAge(20);
    user.setBirthday(new Date());

    request.setAttribute("u",user);

    List list = new ArrayList<String>();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    request.setAttribute("list",list);

    Map map = new HashMap();
    map.put("sname","李四");
    map.put("gender","男");
    map.put("user",user);
    request.setAttribute("map",map);
%>
<h3>el获取对象中的属性值</h3>
${requestScope.u}
<%--
    * 通过的是对象的属性来获取
       - setter或getter方法：去掉set或get,再将剩余部分首字母变为小写
       - getName-->Name--->name
--%>
    ${requestScope.u.name}<br>
    ${u.age}<br>
    ${u.birthday}<br>
    ${u.birthday.year}<br>
    ${u.birStr}<br>


    <h3>el获取List集合的值</h3>
    ${list}<br>
    ${list[0]}<br>
    ${list[1]}<br>
    ${list[10]}<br>

    <h3>el获取Map的值</h3>
    ${map.gender}<br>
    ${map["gender"]}<br>
</body>
</html>
