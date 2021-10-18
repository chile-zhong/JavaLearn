package lxg.innerdemo;

import com.lxg.innerdemo.*;

/**
 * @author lxg
 * @description 内部类的测试类
 * @date 2021/9/3
 *
 * 内部类（当作类中得一个普通成员，只不过这个成员是class而已）：
 *   一个Java文件中可以有多个class，但是只能有一个public class
 *   如果一个类定义在另一个类的内部，此时可以称之为内部类，可以当作成员属性
 *
 * 使用：
 *   创建内部类的时候，更之前的方式不一样，需要在内部类的前面添加外部类来进行修饰
 *   InnerClassDemo.InnerClass innerClass = new InnerClassDemo().new InnerClass();
 *
 * 特点：
 *    1.内部类可以访问外部类得私有属性
 *    2.外部类不能直接访问内部类得私有属性,但如果常见了内部类的对象，则可以通过内部类对象来在外部类中访问内部类的私有属性
 *    3.内部类中不能定义静态属性
 *    4.当外部类和内部类具有相同名字的私有属性时，在内部类中访问的时候，可以直接访问内部类
 *    的属性，如果需要访问外部类的属性，需要添加 外部类类名.this.属性
 *     System.out.println(Outer.this.name);
 *
 * 在外部类中访问内部类
 *         * 外部类 外部类对象 = new 外部类();
 *         * 外部类.内部类 内部类对象 = 外部类对象.new 内部类();
 *         *
 *         * 如果主方法在外部类内部，则可以省略Outer
 *
 * 分类：
 *    匿名内部类：当定义了一个类实现了某个接口的时候，在使用过程中只是用一次，没有其他用途
 *              考虑到代码编写的简介型，可以考虑不用创建具体的实现类，而采用new interface(){ //添加未实现的方法} 的方式
 *              就叫做匿名内部类,适合只需要使用一次的类，安卓中使用比较多。
 *
 *    静态内部类：在外部类中创建静态内部类，使用static关键字，使用规则：
 *            外部类.内部类 内部类对象 = new 外部类().内部类();
 *
 *    方法内部类：在外部类的方法中定义类，就叫做方法内部类，使用的时候注意，只能在此防范中创建对象，此内部类的作用域是当前方法，
 *              所以方法内部类不能使用访问控制符和static修饰。
 *              方法内部类如果想使用方法的参数，那么参数前必须加上fina关键字。
 *             当内部类方法在传递参数的时候
 *
 */
public class Test {

    /*测试方法内部类*/
    public void TestMethodInnerClass(){
        MethodInnerClass methodInnerClass = new MethodInnerClass();
        methodInnerClass.show();
    }

    /*测试匿名内部类NoNameInnerClass*/
    @org.junit.Test
    public void TestNoNameInnerClass(){
        /*使用匿名内部类*/
        NONameInnerClass noNameInnerClass = new NONameInnerClass();
    }

    /*测试Outer类，测试内部类中存在与外部类同名的属性的时候的使用方式*/
    @org.junit.Test
    public void TestOuter(){
        Outer.Inner inner = new Outer().new Inner();
        /*在show方法中使用了外部类的属性
        * 在内部类中使用this关键字，代表的是指向该内部类的对象
        * 要使用外部类属性，方式
        * 外部类.this.属性
        * */
        inner.show();

        /*使用内部类的内部类
        * 可以定义内部类的内部类，但是很多时候没有意义
        * */
        //Outer.Inner.InnerInner innerInner = new Outer().new Inner().new InnerInner();
        //innerInner.show();
    }

    /*测试内部类*/
    @org.junit.Test
    public void TestInnerClassDemo(){
        //创建外部类
        InnerClassDemo innerClassDemo = new InnerClassDemo();
        //创建内部类
        //方式一
        InnerClassDemo.InnerClass innerClass1 = innerClassDemo.new InnerClass();
        //方式二
        InnerClassDemo.InnerClass innerClass2 = new InnerClassDemo().new InnerClass();
        //使用内部类
        innerClass1.test();
        innerClass2.test();
    }

    /*测试静态内部类*/
    @org.junit.Test
    public void TestStaticInnerClass(){
        //创建静态内部类
       // StaticInnerClass.StaticInnerClassT staticInnerClassT = new StaticInnerClass.StaticInnerClassT();
        //staticInnerClassT.show();
    }
}
