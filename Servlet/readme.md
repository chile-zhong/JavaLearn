# Servlet
## 1.Servlet基础
### 1.1 Servlet结构体系
### 1.2 Sevlet技术特点
### 1.3 Servlet与JSP的区别
### 1.4 Servlet代码结构


## 2.Servlet API编程常用接口和类
### 2.1 Servlet接口
### 2.2 ServletConfig接口
### 2.3 HttpServletRequest接口
### 2.4 HttpServletResponse接口
### 2.5 GenericServlet类
### 2.6 HttpServlet类

## 3.Servlet开发
### 3.1 Servlet创建
### 3.2 Servlet配置
1.声明Servlet对象

2.映射Servlet

## 4.Servlet过滤器
Servlet过滤器主要用于对客户端的请求（浏览器）进行过滤处理，再将过滤后的
请求转交给下一个资源，它在JavaWeb开发中具有十分重要的意义。
### 4.1 什么是过滤器（Filter）
### 4.2 过滤器核心对象
### 4.3 过滤器创建与配置
### 4.4 字符编码过滤器

## 5.Servlet监听器
在Servlet技术中已经定义了一些事件，并且可以针对这些事件来编写相关的事件监听器，
从而对事件做出响应的处理。例如，想要Web应用程序启动和关闭时执行一些任务（如
数据库连接的建立和释放），或者想要监控session的创建和销毁，那么就可以通过监听器来
实现。

### 5.1 Servlet监听器（Listener）简介
### 5.2 Servlet监听器的原理
### 5.3 Servlet上下文监听
- 1.ServletContextListener接口

- 2.ServletAttributeListener接口

### 5.4 HTTP会话监听
- 1.HttpSessionListener接口
- 2.HttpSessionActivationListener接口
- 3.HttpBindingListener接口
- 4.HttpSessionAttributeListener接口

### 5.5 Servlet请求监听
- 1.ServletRequestListener接口
- 2.ServletResquestAttributeListener接口

### 5.6 Servlet监听器统计在线人数

## 6.Servlet3新特性
### 6.1 新增注解
### 6.2 对文件上传的支持
### 6.3 异步处理