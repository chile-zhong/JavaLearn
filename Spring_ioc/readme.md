# Spring Ioc
## 1.Spring Ioc的基本概念
>IOC: Inversion of Control 控制反转。将对象的控制和管理交给IOC容器，当需要使用的时候从容器中去拿就行

>DI: Dependency Inject 依赖注入，由IOC容器在运行期间动态的将某种依赖关系注入到对象之中。

> 使用Spring IOC/DI的好处:       
> - 可维护性好，便于单元测试、调试程序和诊断故障
> - 便于分工协作开发
> - 可复用性好
> - 对象的生成方式转化为外置方式，便于扩展，具有热插拔的特性
> - 解耦，降低程序的耦合性

## 2.Spring IOC/DI实现
> Spring框架的功能主要是通过其核心容器来实现的

**Spring框架的主要组件**
- Beans
- 配置文件applicationContext.xml
- Beanfactory接口及相关类
- ApplicationContext接口及相关类

### 2.1 BeanFactory接口
> BeanFactory采用了工厂设计模式，即Bean容器模式，负责读取Bean的配置文件，管理对象的生成、加载、维护Bean对象
>与Bean对象之间的依赖关系，负责Bean的生命周期。这是一个顶级接口。

### 2.2 ApplicationContext接口
> ApplicationContext 提供高级功能的容器，基本功能与BeanFactory很相似，还有以下功能：
> - 提供访问资源文件更方便的方法
> - 支持国际化消息
> - 提供文字解析的方法
> - 可以发布时间，对事件感兴趣的Bean可以接收到这些事件

> 常用实现接口：
> - FileSystemXmlApplicationContext:
> - ClassPathXmlApplicationContext:
> - XmlWebApplicationContext:

## 3.依赖注入的类型
> IOC/DI通常有setter和构造方法两种注入方式
### 3.1 使用构造方法注入
> IOC容器使用setter()方法注入被以来的实例。通过调用无参构造器或无参静态工厂方法实例化Bean后，调用该Bean的
>setter方法，即可实现基于setter()方法的依赖注入。该方式简单、直观，而且容易理解，所以被Spring设置注入大量使用。

```xml
    <beans>
        <bean id="test" class="com.lxg.dao.impl.TestDaoImpl"></bean>

        <bean id="user" class="com.lxg.model.User">
            <property name="name" value="张三"></property>
            <property name="age" value="18"></property>
            <property name="gender" value="男"></property>
            <property name="adde" value="北京"></property>
            <property name="likes">
                <list>
                    <value>读书</value>
                    <value>运动</value>
                    <value>吃饭</value>
                </list>
            </property>
        </bean>

        <bean id="userDao" class="com.lxg.dao.impl.UserDaoImpl">
            <property name="user" ref="user"></property>
        </bean>

        <bean id="userService" class="com.lxg.service.impl.UserServiceImpl">
            <property name="userDao" ref="userDao"></property>
        </bean>
    </beans>
```
### 3.2 使用属性的setter方法注入
>基于构造方法注入被依赖的实例。


## 4.Bean的配置
```xml
<!--
    bean的配置：
    常用的属性和子元素
    id: 唯一标识
    name:为Bean指定名称，可以指定多个，每个用逗号隔开
    class:指向Bean的全限定类名
    scope:Bean的作用域，属性值默认为singleton(单例)，除了这个还有，prototype（原型）、request
            session\global Session、application和Websocket
    constructor-arg:使用构造方法进行注入
    property:用于调用setter方法进行属性的注入 用ref后者value指定参数值
    ref:指向某个引用
    value:指向一个基本类型的常量值
    list:封装List或数组的依赖注入
    set:封装Set类属性的依赖注入
    map:封装Map类属性的依赖注入
    entry:<map>的子元素，用于设置一个键值对。其key属性指向字符串类型的键值
          ref或者value指向元素值
    -->
    <bean id="userDao" class="com.lxg.spring4.dao.impl.UserDaoImpl"></bean>
    <bean id="userService" class="com.lxg.spring4.service.impl.UserServiceImpl">
        <property name="userDao" ref="userDao"></property>
    </bean>

    <!--
    使用p命名空间注入属性
    -->
    <bean id="userService1" class="com.lxg.spring4.service.impl.UserServiceImpl"
           p:userDao-ref="userDao"
    ></bean>

    <!--
    使用构造方法进行注入
    -->
    <bean id="userService2"
          class="com.lxg.spring4.service.impl.UserServiceImpl">
        <constructor-arg name="userDao" ref="userDao"></constructor-arg>
    </bean>

    <!--演示注入普通类型数据-->
    <bean id="userDao1" class="com.lxg.spring4.dao.impl.UserDaoImpl">
        <property name="username" value="张三"></property>
        <property name="age" value="20"></property>
    </bean>

    <bean id="user1" class="com.lxg.spring4.domain.User">
        <property name="name" value="张三"></property>
        <property name="add" value="北京"></property>
    </bean>
    <bean id="user2" class="com.lxg.spring4.domain.User">
        <property name="name" value="李四"></property>
        <property name="add" value="上海"></property>
    </bean>
    <bean id="userDao2" class="com.lxg.spring4.dao.impl.UserDaoImpl">
        <property name="strList">
            <list>
                <value>a</value>
                <value>b</value>
                <value>c</value>
            </list>
        </property>

        <property name="userMap">
            <map>
                <entry key="u1" value-ref="user1"></entry>
                <entry key="u2" value-ref="user2"></entry>
            </map>
        </property>

        <property name="properties">
            <props>
                <prop key="p1">ppp1</prop>
                <prop key="p2">ppp2</prop>
                <prop key="p3">ppp3</prop>
            </props>
        </property>


        <property name="username" value="张三"></property>
        <property name="age" value="20"></property>
    </bean>

```
## 5.Bean的实例化
### 5.1 构造方法实例化
### 5.2 静态工厂实例化
### 5.3 实例工厂实例化
## 6.Bean的作用域

### 6.1 singleton
### 6.2 prototype
## 7.Bean的生命周期
## 8.Bean的装配方式
### 8.1 基于XML配置的装配
### 8.2 基于注解的装配