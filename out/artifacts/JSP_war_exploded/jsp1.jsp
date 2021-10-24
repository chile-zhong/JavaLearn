<%@ page language="java"
         import="java.util.Date"
         import="java.text.SimpleDateFormat"
         pageEncoding="utf-8"
         contentType="text/html;charset=UTF-8"
         session="false"
         buffer="128KB"
         autoFlush="true"
         isErrorPage="false"
         errorPage="index.jsp"
%>
<%--
    - language:用于设置JSP页面使用的语言
    - extend: 设置JSP页面继承的类。
    - import:设置JSP导入的包
    - pageEncoding:指定编码格式，即文件文件编码
    - contentType:设置JSP页面的MIME类型和字符编码，浏览器会据此显示网页内容。
    - session:指定JSP页面是否使用HTTP的session会话对象，其属性值是Boolean类型，true：可以使用session；false：不能使用session
    - buffer:设置JSP的out输出对象使用的缓冲区大小，默认为8KB,单位只能使用KB
    - autoFlush:设置是否自动刷新缓存
    - isErrorPage:设置JSP页面为错误处理页面，。以处理另外一个JSP页面的错误，就是异常处理。意味着JSP页面业务的改变。
    - errorPage:用于指定当前页面的异常错误的另一个JSP页面，
      被指定的JSP页面的isErrorPage属性值必须被设置为true。

--%>
<html>
<head>
    <title>显示系统当前时间</title>
</head>
<body>
<%
    Date date = new Date();
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String today = df.format(date);
%>
<h1>当前时间:<%=today%></h1>
</body>
</html>
