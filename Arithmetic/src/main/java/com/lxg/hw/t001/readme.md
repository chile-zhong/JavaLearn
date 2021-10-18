# 第一题 字符串最后一个单词的长度

##描述
    计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。
    （注：字符串末尾不以空格为结尾）

* 输入描述：
    输入一行，代表要计算的字符串，非空，长度小于5000。

* 输出描述：
    输出一个整数，表示输入字符串最后一个单词的长度。

示例1
输入：
hello nowcoder
复制
输出：
8
复制
说明：
最后一个单词为nowcoder，长度为8

## 分析

### 方法一: 将输入的字符串去除前后空格后，以空格分割转换成字符串数组，取出最后一个元素值（字符串），
    使用length()方法取出字符串长度即为最后一个单词的长度。
    
### 方法二: 使用字符串切片
    起始位置是最后一个空格的位置，终止位置即是切片前字符串的长度。
    
## 总结
* 如果需要接受输入，就引用java.util.Scanner,然后实例化,Scanner input = new Scanner(System.in);
* 去除字符串前后空格tirm()
* 字符串分割成字符串数组，使用split()方法
* 取字符串长度方法：length()
* 判断是否输入完，input.hasNextLine()
* 获取每一行输入，s=input.nextLine();
* 获取字符串中某个元素的最后一次出现的位置，lastIndexOf()