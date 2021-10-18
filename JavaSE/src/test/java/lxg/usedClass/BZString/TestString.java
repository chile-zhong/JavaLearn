package lxg.usedClass.BZString;


import org.junit.Test;

/**
 * @author lxg
 * @description String类的包装类测试类
 * @date 2021/9/4
 *
 *
 * 注意：字符串常量池1.7放置在堆空间之中
 * 字符串的使用：
 *   两种创建方式：
 *      String a = "abc";
 *      String a = new String("abc");
 *      第一种用的比较多
 *
 *  字符串的本质：
 *    字符串的本质就是字符数组或者叫做字符序列
 *
 *  String类使用final关键字修饰，不能被继承。
 *  使用equals方法比较的是字符数组每一个位置的值
 *
 *
 *可变字符：
 *  StringBuffer： 线程安全（方法中使用synchronized关键字修饰，加锁机制），效率低
 *  StringBuilder：线程不安全，效率高
 */
public class TestString {

    @Test
    public void test(){
        String str = "abc";
        String str2 = new String("abc");

        System.out.println(str == str2);

        System.out.println("equals:"+str.equals(str2));

        System.out.println(str.charAt(0));
        //数组的复制过程
        System.out.println(str.concat("cde"));
        //返回指定下标的元素
        System.out.println(str.indexOf("a"));
        String s = "abcdefghijklmn";
        System.out.println(s.substring(3));
        //在截取字符串的时候，需要注意是左闭右开区间
        System.out.println(s.substring(3,5));
        System.out.println(s.length());
        System.out.println("-----------------");
//        String a = "abc";
//        String b = new String("abc");
//        b = b.intern();
//        System.out.println(a==b);

        String a = "abc";
        String b = "def";
        String c = "abcdef";
        String d = (a+b).intern();
        String e = "abc"+"def";
        System.out.println(c==d);
        System.out.println(c==e);
        String f = "a" + "b" +"c";
        String a1 = "a";
        String a2 = "b";
        String a3 = "c";
        String f1 = a1+a2+a3;

    }


    /*StringBuffer && StringBuilder*/

    /*
    * 可变字符：
    *  StringBuffer： 线程安全（方法中使用synchronized关键字修饰，加锁机制），效率低
    *  StringBuilder：线程不安全，效率高
    * */
    @Test
    public void testStringBuffer(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(1).append(122.2).append("abc").append(true);
        System.out.println(stringBuffer);

        //打印长度
        System.out.println(stringBuffer.length());

        //打印字符段长度
        System.out.println(stringBuffer.capacity());

        /*StringBuilder*/
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(123).append("djfov").append(false);
        System.out.println(stringBuilder.length());
        System.out.println(stringBuffer.capacity());

    }
}
