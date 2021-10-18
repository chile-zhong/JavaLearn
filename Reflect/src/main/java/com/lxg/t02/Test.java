package com.lxg.t02;

/**
 * @author lxg
 * @description 测试类
 * @date 2021/9/21
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        /**
         * 获取字节码的四种方式
         * 注意方式一和方式二不常用，因为都是以知道类为前提的
         */

        //方式一:通过getClass()方法获取
        Person p = new Person();
        Class c1 = p.getClass();

        //方式二：通过内置class属性
        Class c2 = Person.class;
        System.out.println(c1==c2);

        //方式三：用的最多，调用Class提供的forName()方法
        Class c3 = Class.forName("com.lxg.t02.Person");

        //方式四：利用类的加载器
        ClassLoader classLoader = Test.class.getClassLoader();//获取系统类加载器
        Class c4 = classLoader.loadClass("com.lxg.t02.Person");

        //就可以通过Class对象实例来创造Person类对象了
        Person p1 = (Person)c1.newInstance();
        Person p2 = (Person)c2.newInstance();
        Person p3 = (Person)c3.newInstance();
        Person p4 = (Person)c4.newInstance();
    }
}
