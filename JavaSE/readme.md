# Java基础语法
## 一、入门程序 [HelloWorld](JavaSE/src/com/lxg/basic/HelloWorld.java)
**注意事项:**   
 *  1、java文件的名称必须跟public class的名称保持一致
 * 	2、一个java文件中可以包含多个class,凡是public class只能有1个
 * 	3、public static void main(String[] args)是所有java程序的入口，如果向执行对应的java代码，则必须要添加如下方法，且格式是固定
 * 	4、main方法中参数列表可以支持多种写法：String[] args,String [] args,String args[]
 * 	5、main方法中参数的名称无所谓，但是一般写成args
 * 	6、java代码在编写的时候，每行结尾的时候需要使用;结束
 * 	7、java代码的代码块需要使用{}括起来，前后匹配

 **三种注释:**
> 单行注释： // 这是单行注释
> 多行注释：/*这是多行注释*/
> 文档注释：/**这是文档注释*/

## 二、标识符&保留字
### 2.1 标识符  
* 作用： 用作类、方法、常量、变量和包等的名称
* 规则：   
1、由字母、数字、下划线或美元符号组成  
2、不能以数字开头
3、标识符大小写敏感，长度无限制    
4、不可以时java关键字
> 正确的： name, Name，user_name ,$name , _name, publicName;     
>错误的： 9username ,user name , public 
### 2.2 关键字/保留字
* **Java关键字**是Java语言保留供内部使用的特殊的标识符，如class关键字用于定义java类，public、private等关键字用于访问控制，Java关键字就是保留字
* Java关键字如下图所示
[![RYjeO0.md.png](https://z3.ax1x.com/2021/06/27/RYjeO0.md.png)](https://imgtu.com/i/RYjeO0)     

### 2.3 字符集简介
[![RYXvQI.md.png](https://z3.ax1x.com/2021/06/27/RYXvQI.md.png)](https://imgtu.com/i/RYXvQI)

## 三、数据类型和运算符

[OperatorDemo](JavaSE/src/com/lxg/basic)

### 3.1 数据类型
- **Java是强类型语言**，常量和变量都必须有其数据类型     
  		**强类型表示**，变量在定义的时候必须显式的声明类型是什么		java
  		**弱类型表示**，变量会根据值自己去推断，不需要指定类型是什么	js,python,scala

- **java数据类型**

  ​        **1.基本数据类型（4类8种）**

  ​			**整数类型：byte short int long(不同类型表示不同的长度)**
  ​				**byte:** 	使用一个字节存储，因此范围是	-128-127        即  -2^7 ~ 2^7-1
  ​				**short:**	使用两个字节存储，因此范围是 -32768-32767  即 -2^15 ~ 2^15-1
  ​				**int:**	     使用四个字节存储，因此范围是 正负21亿           即 -2^31 ~2^31-1 
  ​				**long：**	使用八个字节存储，（自己猜猜）                          -2^63 ~ 2^63-1
  ​				**注意：**
  ​					1、在使用整型类型的时候，默认都是**int类型**，
  ​					2、如果需要使用long类型的话，必须要在数字的后面添加L,建议使用大写，小写容易跟1混淆。

  ​			  **浮点类型: float double   小数类型：使用小数点	使用科学计数法**
  ​				**float:**	     单精度，精度可以精确到小数点后7位
  ​				**double:**	双精度，精度是float的双倍
  ​				**注意：**
  ​					1、默认浮点类型是double类型
  ​					2、使用float的时候，数字后要添加f
  ​					3、浮点类型并不能表示一个精确的值，会损失一定的精度

  ​			**字符类型: char**
  ​				占用2个字节，使用的时候使用''表示

  ​			 **布尔类型: boolean**
  ​				只有true和false两值，在存储的时候占1位

  ​		**2.引用数据类型:**
  ​			自定义类
  ​			接口
  ​			数组
  [![RYXHoD.md.png](https://z3.ax1x.com/2021/06/27/RYXHoD.md.png)](https://imgtu.com/i/RYXHoD)

- **变量&常量**

**定义：** 在程序中存在大量的数据来代表程序的状态，其中有些数据在程序的运行过程中值会发生改变，有些数据在

程序运行过程中值不能发生改变，这些数据在程序中分别被叫做变量和常量。

​        在实际的程序中，可以根据数据在程序运行中是否发生改变，来选择应该是使用变量代表还是常

量代表。

**java变量：**

​         是程序中最基本的存储单元，其要素包括变量名，变量类型和作用域。

​		 变量在使用前必须对其声明,只有在变量声明以后，才能为其分配相应长度的存储单元，声

明格式为：

```
int a = 10; //包括变量类型 变量名称 以及给变量赋值。可以先声明，再赋值使用
```

**注意事项：**

           1. 每个变量都必须有类型，可以是基本数据类型，也可以是引用类型。
           2. 每个变量的命名必须符合标识符命名规则。

**final常量：**

    1. 使用final修饰的常量，其值只能被初始化一次，初始化后不能改变了，就编程了常量。
       2. final常量是有名称的

```java
public class Circle{
    finale double PI = 3.1415926;  //定义final常量 并指定初始化值，名称为PI
}
```

 ### 3.2 命名规则

1.  所有方法、变量、类名：见名知意
2. 变量、方法名：首字母小写、驼峰命名方法
3. 常量：全部大写，多个单词用下划线链接
4. 类名：首字母大写，多单词使用驼峰方式

### 3.3 运算符

- **算术运算符** 

[![RYXIL6.png](https://z3.ax1x.com/2021/06/27/RYXIL6.png)](https://imgtu.com/i/RYXIL6)
- **赋值运算符**
[![RYXTeK.png](https://z3.ax1x.com/2021/06/27/RYXTeK.png)](https://imgtu.com/i/RYXTeK)

- **关系运算符**
[![RYX5sx.png](https://z3.ax1x.com/2021/06/27/RYX5sx.png)](https://imgtu.com/i/RYX5sx)

- 逻辑运算符

  [![RYX7dO.png](https://z3.ax1x.com/2021/06/27/RYX7dO.png)](https://imgtu.com/i/RYX7dO)

  [![RYXxyt.md.png](https://z3.ax1x.com/2021/06/27/RYXxyt.md.png)](https://imgtu.com/i/RYXxyt)
  

- **位运算符**

[![RYXqFe.md.png](https://z3.ax1x.com/2021/06/27/RYXqFe.md.png)](https://imgtu.com/i/RYXqFe)


- **运算符的优先级**

  [![RYXjSA.png](https://z3.ax1x.com/2021/06/27/RYXjSA.png)](https://imgtu.com/i/RYXjSA)

- **基本数据之间的转换**

  **在赋值运算或算术运算时，要求数据类型相同，否则要进行类型转换**

  **转换方式**

  1. 自动转换
  2. 强制转换

  除boolean类型外，所有的基本数据类型因为各自的精度不同，赋值时都要考虑这个问题。

  除boolean类型外，所有的基本数据类型包括：整型，浮点型，字符型。

  **算术运算时的转换**

  整型,浮点型,字符型数据可以混合运算。 

  运算中，不同类型的数据先转化为同一类型，然后进行运算，转换从低级到高级。

  ```
  –3+'A'+45L
  
  –5+3.6+'A'+3.14f
  ```

  [![RYXOWd.md.png](https://z3.ax1x.com/2021/06/27/RYXOWd.md.png)](https://imgtu.com/i/RYXOWd)



## 四、控制流程语句

### 4.1 概述

​        流程控制语句是用来控制程序中各语句执行顺序的语句，可以把 语句组合成能完成一定功能的小逻辑模块。

​        其流程控制方式采用结构化程序设计中规定的三种基本流程结构， 即：顺序结构、分支结构和循环结构，如下图所示：

[![RYXzOP.md.png](https://z3.ax1x.com/2021/06/27/RYXzOP.md.png)](https://imgtu.com/i/RYXzOP)

**顺序结构** 

**选择结构** 

```
– if-else switch 
```

**循环结构** 

```
– while do-while for 
```

**跳转**

```
– break continue return 
```

**多重循环** 

**方法**

```
– 定义、调用、重载 
```



### 4.2 分支结构

- **单分支结构：if**
- **双分支结构：if    else**
- **多分枝结构：if    else  if   esle .....** **switch**



### 4.3 循环结构

- **while**

  ```java
  int num = 10;
  int i=0;
  while(i<num){
      System.out.println(i);
      i++
  }
  ```

  

- **for**

  ```java
  for(int i=0;i<10;i++){
      System.out.println(i);
  }
  ```

  

- **do while**

  ```java
  int i = 0;
  do{
      System.out.println(i);
  }while(i<10);
  ```

-  **while和do   while的区别**

  do while 先执行后判断，至少执行一次，while，先判断后执行，如果不满足条件，一次也不执行。

### 4.4 跳转语句

- **continue:跳出本次循环**

- **break：完全跳出循环**

- **continue&break：**

  **使用场合**

  break可用亍switch结构和循环结构中

  continue叧能用亍循环结构中

  **作用（循环结构中）**

  break诧句终止某个循环，程序跳转到循环块外的下一条诧句。

  continue跳出本次循环，迚入下一次循环

- **return：return诧句从当前方法退出，返回到调用该方法的诧句处，幵从该诧句的下条诧句处继续执行程序**

  

## 五、数组

### 5.1 数组概述

**数组：** 相同类型数据的有序、有限集合

1. 相同的数据类型的若干数据，按照一定的先后次序组合起来
2. 其中每个数据称作一个数组元素
3. 每个数组元素可以通过数组下标访问

**特点：** 

1. 长度确定。一旦定义好并确定好长度，就不能改变。
2. 同种类型。数组元素必须是同种类型，在声明数组的时候就确定该数组保存什么样的数据类型的数据。
3. 数组元素的类型可以是任何类型。可以保存基本数据类型，也可以是引用类型。
4. 数组是属于引用类型。
5. 数组变量就是存储相同类型数据的一组数据。
6. 声明数组就是在内存中划出一段连续的内存空间存储数据。
7. 数组下标从0开始。

### 5.2 数组使用

**声明数组：**

```java
int[] a;  //声明数组变量a,存储一段int类型的数据。
```



**分配空间：**

```java
a = new int[5];  //分配长度为5的存储空间 即从a[0] ~ a[4]

//int[] a = new int[5];
```



**赋值：**

```java
for(int data=0;data <5;data++){
	a[data] = data;  //循环给数组a赋值  
}
```



**数组使用：**

```java
//取数
int b = a[3];  
//操作元素
int c = a[2]*999;
...
```



**数组的初始化：**

1. 动态初始化：数组定义与为数组元素分配空间并赋值的操作分开进行

```
int a[] = null; 
a = new int[3]; 
a[0] = 3; 
a[1] = 9; 
a[2] = 8;
```

2. 静态初始化：除了用new关键字来产生数组以外,还可以直接在定义数组的同时 就为数组元素分配空间并赋值。

   ```
   public class Test { 
    	public static void main(String args[]) { 	
    		int [] a = { 3, 5, 7 }; 
    	}
   }
   ```

3. 默认初始化：数组是引用类型，它的元素相当于类的实例变量，因此数组一经 分配空间，其中的每个元素也被按照实例变量同样的方式被隐式 初始化。

**数组的界限：**

1. 定义并用运算符**new**为之分配空间后，才可以引用数组中的每个元素； 

2. 数组元素的引用方式：arrayName[index] 

​        index为数组元素下标，可以是整型常量或整型表达式。如a[3] , b[i] , c[6*i]; 数组元素下标从0开始；长度为n的数组合法下标取值范围： 0 ~ n-1； 

3. 每个数组都有一个属性**length**指明它的长度，例如：**a.length** 指明数组**a**的长度 (元素个数)； 

4. 数组的长度: 数组名.length

5. 起点和终点：

   起点: 数组名[0] 

​       终点: 数组名[length-1] 

### 5.3 二维数组&多维数组

**二维数组：**

```java
int[][] a;  //声明二维int类型的数组
```



....

### 5.4 其他

**数组拷贝：**

```java
/*使用java.lang.System类的静态方法 
public static void arraycopy (Object src,int srcPos,Object dest, int destPos,int length) 

可以用于数组src从第srcPos项元素开始的length个元素拷贝到目 标数组从destPos项开始的length个位置。

如果源数据数目超过目标数组边界会抛出 IndexOutOfBoundsException 异常。
*/
public class ArrayTest7 { 
    public static void main(String args[]) { 
        String[] s = {"Mircosoft","IBM","Sun","Oracle","Apple"}; 
        String[] sBak = new String[6]; 
        System.arraycopy(s,0,sBak,0,s.length); 
        for(int i=0;i<sBak.length;i++){ 
            System.out.print(sBak[i]+" "); 
        }
        System.out.println(); 
        
        int[][] intArray = {{1,2},{1,2,3},{3,4}}; 
        int[][] intArrayBak = new int[3][]; 
        System.arraycopy(intArray,0,intArrayBak,0,intArray.length); 
        intArrayBak[2][1] = 100; 
        
        for(int i = 0;i<intArray.length;i++){ 
            for(int j =0;j<intArray[i].length;j++){ 
                System.out.print(intArray[i][j]+" "); 
            }
            System.out.println(); 
        } 
    } 
}
```

**Java.uitl.Arrays:**

1. 该类提供了关于数组操作的API. 

2. 打印数组----toString方法。 

3. 比较两个数组是否相同----equals方法。 

4. 数组排序----sort方法。 

5. 数组查找----**binarySearch** 方法
