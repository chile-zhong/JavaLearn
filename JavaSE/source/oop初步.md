# OOP初步
## 一、编程语言分代
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210705202042559.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQwNDkzOTQ0,size_16,color_FFFFFF,t_70)
## 二、面向过程&面向对象
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210705202135415.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQwNDkzOTQ0,size_16,color_FFFFFF,t_70)
eg:
> 如何开汽车(事物比较简单，可以用线性的思维去解决)
> – 面向过程：                             – 面向对象：
> 1.采离合                                     驾驶员
> 2. 挂档                                         汽车
> 3.踩油门,放离合                           驾驶员开汽车！
> 4.开了                                            car.start();

## 三、类和对象
**现实世界是由什么组成的？**
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210705202437862.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQwNDkzOTQ0,size_16,color_FFFFFF,t_70)
**类：** 类是对象的抽象，类可以生成对象
**对象：** 是具体的事物，是类的具体
**类是对象的抽象，对象是类的具体表现**
**先有具体的对象，然后抽象各个对象之间相同的部分，归纳出类，通过类再认识其他对象。**

### 3.1 对象
**对象：** 用来描述客观事物的一个实体，由一组属性和方法构成
**属性：** 对象具有的各种特征
**方法：**对象执行的操作
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210705203204593.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQwNDkzOTQ0,size_16,color_FFFFFF,t_70)
### 3.2 类
**类：** 具有相同属性和方法的一组对象的集合，类是模子，确定对象将会拥有特征（属性）和行为（方法）
类是抽象的概念，仅仅是一个模板，通过模板来创建对象，类是对象的类型。
### 3.3 总结
- **对象和类的关系：** 特殊到一般，具体到抽象
- **类：** Java中的Class
- **对象：**Object instance（实例）
- 类可以看成一类对象的模板，对象可以看成该类的一个具体实例
- 类是用于描述同一类型的对象的一个抽象概念，类中定义了这一类对此昂所具有的静态和动态属性
- 对象是Java程序的核心，在Java中，“万事万物皆对象”
- JDK提供了很多供编程人员使用，编程人员也可以定义自己的类

## 四、类的定义与使用
定义类和使用类：


```java
public class 类名{
   //定义属性
   属性1类型 属性1;
   ....

	//定义方法的部分
	返回值 方法名(参数...){
          //方法体
   }       
//类的使用
//类名 对象名 = new 类名();
Person p = new Person();



//创建
package com.lxg.oop;

/**
 * @author: 马士兵教育
 * @create: 2019-08-18 16:18
 */
/*
* 所有类定义的时候可以添加属性和方法，但是不是必须要写的
*   一个java文件中可以定义N多个class，但是只能有一个public class并且public class的类名跟文件名保持一致
* 属性：
*   语法：
*   [访问修饰符]    数据类型      属性名称  =  值；
*
*   注意：
*       定义属性的时候可以有值也可以没有值
*       必须要包含类型和名称
*
*
* 方法：表示行为
*   语法：
*       [访问修饰符]  返回值类型(任何类型)  方法名称（形参列表）{
*               逻辑代码
*       }
*   注意：
*       1、方法的访问修饰符可以不写
*       2、方法可以有返回值，也可以没有，void表示没有返回值的意思
*       3、形参列表可以有，也可以没有
*       4、java中方法的传参都是值传递（后续会讲）
*
* 对象的创建和使用
*       1、使用new关键字来创建对象
*       ClassName objectName = new ClassName();
*       2、对象的使用
*           使用对象的时候可以通过 对象名称.属性 或者 对象名称.方法 来使用属性和方法
* */
public class Student {

    //属性的定义
    int stuNumber;
    String name;
    int age = 20;

    //方法的定义
    void study(){
        System.out.println("我正在学习");
    }

    void eat(String food){
        System.out.println("我在吃"+food);
    }

    public static void main(String[] args) {
        //创建对象
        Student student = new Student();
        //使用属性
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.stuNumber);
        //修改属性值，给属性赋值
        student.name="张三";
        student.age=40;
        student.stuNumber=20190818;
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.stuNumber);
        //调用方法
        student.study();
        student.eat("apple");
    }
}


```

## 五、局部变量和成员变量
### 5.1 两者区别
- 声明位置不同：局部变量声明在方法中，成员变量声明在类中 
- 作用范围不同： 成员变量当前类的方法  局部变量当前斱法
- 不同的方法中即使有同名的局部变量，没有关系，互不影响
- 内存存放的位置的：局部变量栈内存中 成员变量堆内存中
-  成员变量有默认值；局部变量没有默认值

## 六、引用类型
**Java 语言中除基本类型外的变量类型都称为引用类型。**
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210705205650444.png)
Java中的对象和数组是通过引用对其操作的. 
- 引用可以理解为一种受限的指针
- 指针是可以进行与整数做加减运算的，两个指针之间也可以进行大小比较运算和相减运算。引用不行，只能赋值运算。
- 引用就是一个变量或对象的别名（引用的本质是一个对象）；指针是一个段内存空间的地址(指向存储一个变量值的空间戒一个对象的空间)

## 七、内存分析
**栈**
- 存放：局部变量
- 先进后出，自下而上存储
- 方法执行完毕，自动释放空间
**堆**
- 存放new出来的对象
- 需要垃圾回收器来回收 System.gc()
**方法区**
 - 存放：类的信息(代码)，static变量、字符串常量等

## 八、构造方法 & 方法调用 （略）

