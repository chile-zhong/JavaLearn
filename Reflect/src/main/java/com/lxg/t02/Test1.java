package com.lxg.t02;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author lxg
 * @description 测试获取构造器和创建对象
 * @date 2021/9/21
 */
public class Test1 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取子哦解码信息
        Class cls = Class.forName("com.lxg.t02.Student");

        //通过字节码信息可以获取构造器
        //getConstructors()只能获取当前运行时类的被public 修饰的构造方法
        Constructor[] constructors1 =  cls.getConstructors();
        for (Constructor constructor:constructors1) {
            System.out.println(constructor);
        }
        System.out.println("----------------------");
        //getDeclaredConstructors()获取运行时类的全部构造器
        Constructor[]  constructors2 = cls.getDeclaredConstructors();
        for (Constructor constructor:constructors2) {
            System.out.println(constructor);
        }

        System.out.println("------------------------");
        //获取指定的构造器
        //得到无参狗构造器
        Constructor con1 = cls.getConstructor();
        System.out.println(con1);

        //得到两个参数的构造器
        Constructor con2 = cls.getConstructor(double.class,double.class);
        System.out.println(con2);

        //得到一个参数的有参构造器，并且使用private修饰的
        Constructor con3 = cls.getDeclaredConstructor(int.class);
        System.out.println(con3);

        /*****************************************************************/
        //有了构造器，就可以创建对象
        Object o1 = con1.newInstance();
        System.out.println(o1);

        Object o2 = con2.newInstance(12,13);
        System.out.println(o2);
    }
}
