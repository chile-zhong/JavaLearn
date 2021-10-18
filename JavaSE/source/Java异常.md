# 一、异常概念
## 1.1 异常
异常是指在程序的运行过程中所发生的不正常的事件，它会中断
正在运行的程序
![异常](https://img-blog.csdnimg.cn/img_convert/f60f80e2243ece2cff0b257bc43320dd.png)
## 1.2 异常和错误
**异常**是程序中的一些错误，但并不是所有的错误都是异常，也就是有的程序中，不存在所谓的“异常”，只存在错误并且错误有时候是可以避免的。

**错误**会导致我们的程序在运行期无法继续运行比如说，你的代码少了一个分号，那么会出现编译不通过。

如果一个无法处理接收到除数为零时的情况， System.out.println(11/0)，那么是因为你用0做了除数，就会抛出 java.lang.ArithmeticException 的异常，我无法处理，在这个时候就可以抛出一个异常，然后将它交给你处理（不然程序就中止了）。

java 为了解决出现的问题时发出的一个通知，这个通知到达它该到达的地方，然后在这个地方得到解决，然后使程序能够继续运行，这就是异常处理。
通常包含以下几种发生异常的原因：
1. 用户输入非法数据
2. 要打开的文件不存在
3. 网络通信时链接中断，或者JVM内存溢出

以上 这些异常有的是因为用户错误引起，有的是程序错误引起的，还有其它一些是因为物理错误引起的。

# 二、异常分类
## 2.1 异常分类
Java标准库内创建了一些通用的异常，这些异常类以Throwable作为顶层的父类，Throwable派生处Error类和Exception类。
**异常分类结构图**
![异常结构图](https://img-blog.csdnimg.cn/img_convert/9545a5d0980344393feb982abf810b44.png)
**Error**
Error用来表示编译时和系统错误，我们一般不关心，其实异常就是发生错误时被抛出的一个通知，所以Error是在编译时和系统出错时被抛出的异常。

**Exception**

我们需要关心异常，因为当异常抛出时，说明程序出现了问题，我们需要处理这些问题。
**eg**

```java
public void method(String s){
	if(s==null){
		throw new NullPointException();
	}
}
```
**Exception又分为不检查异常和检查异常**

- 不检查异常：
当出现了使用指向空的引用时，系统会自动抛出异常，不需要我们手动抛出所有的RuntimeException类型的异常，我们不需要去捕获他，象这类异常被称为不检查异常。往往我们程序的问题就是出现这些不被检查的异常，如NullPointException.

- 检查异常：
这一类异常抛出时，我们必须去捕获它，如SQLException、XMLStreamException等异常。

# 三、异常处理
![在这里插入图片描述](https://img-blog.csdnimg.cn/img_convert/a7c0306cf4bacef01fa3e3fcf3bc6945.png)
![在这里插入图片描述](https://img-blog.csdnimg.cn/img_convert/9ad7907058d788d536dbf8efc4634a10.png)
![在这里插入图片描述](https://img-blog.csdnimg.cn/img_convert/8623059129c0475627f9afb505f5bf2d.png)
![在这里插入图片描述](https://img-blog.csdnimg.cn/img_convert/42284c07a9d2be751ba5c9e9725a9385.png)![在这里插入图片描述](https://img-blog.csdnimg.cn/img_convert/74895e269e5457f6471fd41b7ecc34e3.png)
![在这里插入图片描述](https://img-blog.csdnimg.cn/img_convert/b48c811b40c26aa486f977df609de3c5.png)
![在这里插入图片描述](https://img-blog.csdnimg.cn/img_convert/9a0aa5c3b0bab156c174e06eb1cc7794.png)
![在这里插入图片描述](https://img-blog.csdnimg.cn/img_convert/89736fe24b85e3344c0966b8ba8140d9.png)
![在这里插入图片描述](https://img-blog.csdnimg.cn/img_convert/4ff5ed0d13c05c61788e816d3d828d1e.png)

![在这里插入图片描述](https://img-blog.csdnimg.cn/img_convert/d27251459c5f9f189af631c3c3625582.png)
![在这里插入图片描述](https://img-blog.csdnimg.cn/img_convert/8e0a7b391e0c61176a7e922f3dcaeecd.png)


## 3.1 异常捕获
语法：
```java
try{
	//可能发生运行错误的代码
}catch(异常类型 异常对象引用){
	//用于处理异常的代码
}finally{
	//用于最后执行的代码
}
```

```java
try { // 有可能发生的运行错误代码； }
```
如果在方法内部抛出了异常或者在方法内部调用的其他方法抛出了异常，这方法将在抛出异常后终止，如果不希望方法就此终止，那么在方法内设置一个特殊的块来捕获异常，所以称为try 块，这也属于是异常监控区域。

```java
catch(异常类型 异常对象引用){ // 用于处理异常的代码 }
```
一个 try 代码块后面跟随多个 catch 代码块的情况就叫多重捕获。

```java
try{ // 程序代码 }
catch(异常类型1 异常的变量名1){ // 程序代码 }
catch(异常类型2 异常的变量名2){ // 程序代码 }
catch(异常类型2 异常的变量名2){ // 程序代码 }
```
**不被检查的异常编译时不会强制让我们捕获**

抛出的异常必须要得到处理。当发生异常时（监控区域抛出异常），Java 异常处理机制将负责搜寻 catch 中与异常类型相匹配的第一个处理程序，进入这个 catch 块。

也就是说只有匹配的catch字句才能执行，即便是下面还有匹配的类型为什么下面还会存在匹配的类型，因为类继承原因，下面还存在父类的异常），也不会执行，具有唯一匹配性。

Java的这种异常捕获、处理的模式，可以很好的将正常的代码和出现问题时处理的代码分开，而不是混在一起。

**Code**

```java
public class Test1 {
  public static void main(String[] args) {
      try{
          int a[] = new int[2];
          System.out.println("获取数组第三个元素 :" + a[3]);
      }catch(ArrayIndexOutOfBoundsException e){
          System.out.println("异常信息  :" + e);
      }
  }
}
```
## 3.2 异常关键字
**Finally关键字**
finally 关键字用来创建在 try 代码块后面执行的代码块。无论是否发生异常，finally 代码块中的代码总会被执行。
在 finally 代码块中，把资源恢复到它们的初始状态，如：已打开的文件或网络链接等，总言之，就是与外界“世界”的某个开关。

```java
try{
// 程序代码
}
catch(异常类型2 异常的变量名2){
// 程序代码
}
finally{
// 程序代码
}
```
代码演示

```java
public class Test1 {
  public static void main(String[] args) {
      int a[] = new int[2];
      try{
          System.out.println("获取数组第三个元素 :" + a[3]);
      }catch(ArrayIndexOutOfBoundsException e){
          System.out.println("异常信息  :" + e);
      }
      finally{
          a[0] = 6;//为数组的第一个元素赋值
          System.out.println("打印第一个元素 " +a[0]);
      }
  }
}
```

**throws/throw关键字**
如果一个方法没有捕获一个检查性异常，那么该方法必须使用 throws 关键字来声明。throws 关键字放在方法与方法体中间的部分。

也可以使用 throw 关键字抛出一个异常，无论它是新实例化的还是刚捕获到的。

也可以使用 throw 关键字抛出一个异常，无论它是新实例化的还是刚捕获到的。

```java
public void deposit(double amount) throws RemoteException//声明
{
  // 抛出异常
  throw new RemoteException();
}
```
一个方法可以声明抛出多个异常，多个异常之间用逗号隔开。

```java
public void withdraw(double amount) throws RemoteException, Exception//声明多个异常
 {
     // Method implementation
 }
```

# 四、自定义异常

## 4.1 自定义异常
![在这里插入图片描述](https://img-blog.csdnimg.cn/img_convert/45335b3a9ee5815bf9472bd2b76f1a82.png)

自定义异常，需要记住以下几点
1. 所有异常必须是Throwable的子类
2. 写一个检查性异常类，则需要继承 Exception 类。
3. 写一个运行时异常类，那么需要继承 RuntimeException 类。

定义异常类：

```java
class MyException extends Exception{ }
```
只继承 Exception 类来创建的异常类是检查性异常类。

## 4.2 代码演示
以下实例是一个银行账户的模拟，通过银行卡的号码完成识别，可以进行存钱和取钱的操作。

```java
public class MyException extends Exception {
  /**
   * 此处的amount用来储存当出现异常（取出钱多于余额时）所缺乏的钱
   */
  private int amount;
  public MyException(int amount)
  {
      this.amount = amount;
  }
  public int getAmount()
  {
      return amount;
  }
}
```
为了展示如何使用我们自定义的异常类，

在下面的 ExceptionTest 类中包含一个 withdraw() 方法抛出一个 MyException 异常。

```java
public class ExceptionTest{
  //balance为余额，number为卡号
  private int balance;
  private int number;
  public ExceptionTest(int number){        
      this.number = number;   
  }
  public void deposit(int amount){   
       balance += amount;   
  } //方法：存钱
  public void withdraw(int amount) throws MyException{    //方法：取钱
      if(amount <= balance)
      {
          balance -= amount;
      }
      else
      {
          int needs = amount - balance;
          throw new MyException(needs);
      }
  }
  public int getBalance()    { //方法：返回余额
      return balance;
  }
  public int getNumber()    {//方法：返回卡号
      return number;
  }
}
```
下面的 BankDemo 程序示范了如何调用ExceptionTest 类的 deposit() 和 withdraw()方法。

```java
public class BankDemo {
  public static void main(String[] args) {
      ExceptionTest c = new ExceptionTest(101);
      System.out.println("存入 500块...");
      c.deposit(500);
      try
      {
          System.out.println("\n取100...");
          c.withdraw(100);//还剩400
          System.out.println("\n取600...");
          c.withdraw(600);//引发异常
      }catch(MyException e)
      {
          System.out.println("异常信息提示，余额不足，差200块." + e.getAmount());
          System.out.println("======================");
          System.out.println(e);
      }
  }
}
```

## 4.3 常用异常类列表
异常|说明
-----|--------
ArithmeticException|当出现异常的运算条件时，抛出此异常。例如，一个整数“除以零”时，抛出此类的一个实例。
ArrayIndexOutOfBoundsException|用非法索引访问数组时抛出的异常。如果索引为负或大于等于数组大小，则该索引为非法索引。
ArrayStoreException|试图将错误类型的对象存储到一个对象数组时抛出的异常。
ClassCastException|当试图将对象强制转换为不是实例的子类时，抛出该异常。
ClassNotFoundException|当应用程序试图使用以下方法通过字符串名加载类时，抛出该异常：Class 类中的 forName 方法。ClassLoader 类中的 findSystemClass 方法。ClassLoader 类中的 loadClass 方法。但是没有找到具有指定名称的类的定义。
CloneNotSupportedException:|当调用 Object 类中的 clone 方法复制对象，但该对象的类无法实现 Cloneable 接口时，抛出该异常。重写 clone 方法的应用程序也可能抛出此异常，指示不能或不应复制一个对象。
IllegalAccessException:|当应用程序试图反射性地创建一个实例（而不是数组）、设置或获取一个字段，或者调用一个方法，但当前正在执行的方法无法访问指定类、字段、方法或构造方法的定义时，抛出 IllegalAccessException。
IllegalArgumentException|抛出的异常表明向方法传递了一个不合法或不正确的参数
IndexOutOfBoundsException|指示某排序索引（例如对数组、字符串或向量的排序）超出范围时抛出。应用程序可以为这个类创建子类，以指示类似的异常。
InstantiationException|当应用程序试图使用 Class 类中的 newInstance 方法创建一个类的实例，而指定的类对象无法被实例化时，抛出该异常。实例化失败有很多原因。包括但不仅限于以下原因：类对象表示一个抽象类、接口、数组类、基本类型、void类没有非 null 构造方法
NullPointerException|当应用程序试图在需要对象的地方使用 null 时，抛出该异常。这种情况包括：调用 null 对象的实例方法。访问或修改 null 对象的字段。将 null 作为一个数组，获得其长度。将 null 作为一个数组，访问或修改其时间片。将 null 作为 Throwable 值抛出。应用程序应该抛出该类的实例，指示其他对 null 对象的非法使用。
NumberFormatException|当应用程序试图将字符串转换成一种数值类型，但该字符串不能转换为适当格式时，抛出该异常
StringIndexOutOfBoundsException|此异常由 String 方法抛出，指示索引或者为负，或者超出字符串的大小。对诸如 charAt 的一些方法，当索引等于字符串的大小时，也会抛出该异常。
TypeNotPresentException|当应用程序试图使用表示类型名称的字符串对类型进行访问，但无法找到带有指定名称的类型定义时，抛出该异常。此异常与ClassNotFoundException 不同，ClassNotFoundException 是一个经过检查的异常，而此异常是未经检查的。**注意**，当访问未定义的类型变量时，以及当加载类型（例如，类、接口或注释类型）时，可以使用此异常。
