# MVC开发模式
1.JSP演变历史
- 早期只有Servlet，只能使用response输出标签数据，非常麻烦
- 后来有了JSP，简化了Servlet的开发，但是如果过度使用JSP，在JSP
  中嵌套了大量的Java代码，又有大量的HTML代码，造成了页面代码臃肿，难以维护，难于分工协作开发
- Java的Web开发，使用MVC模式，使得程序的设计更加合理，各部分代码放在不同的位置，各司其职。

2.MVC
- M:Model 模型 JavaBean
> 完成具体的业务操作，如：查询数据库，封装对象

- V:View 视图 JSP
>展示数据

- C:Controller 控制器 Servlet
>获取用户的输入、调用模型、将数据交给视图进行展示

