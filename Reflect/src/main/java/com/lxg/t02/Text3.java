package com.lxg.t02;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author lxg
 * @description 测试通过反射获取方法并调用方法
 * @date 2021/9/21
 */
public class Text3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //获取字节码信息
        Class cls = Class.forName("com.lxg.t02.Student");

        //获取方法
        //getMethods():获取运行时类的所有被public修饰的方法和父类中被public修饰的方法
        Method[] methods1 = cls.getMethods();
        for (Method m:methods1) {
            System.out.println(m);
        }

        System.out.println("--------------------------------");
        //getDeclaredMethods()：获取所有方法
        Method[] methods2 = cls.getDeclaredMethods();
        for (Method m:methods2) {
            System.out.println(m);
        }

        System.out.println("---------------------------------");
        //获取指定的方法
        Method m1 = cls.getMethod("showInfo");
        Method m2 = cls.getMethod("showInfo", int.class, int.class);
        System.out.println(m1);
        System.out.println(m2);
        Method m3 = cls.getDeclaredMethod("work");
        System.out.println(m3);


        System.out.println("------------------------------------");
        //获取方法的具体结构
        /**
         * 注解
         * 修饰符、返回值类型、方法名（参数列表）
         */
        //名字
        String name = m3.getName();
        System.out.println(name);
        //修饰符
        System.out.println(Modifier.toString(m3.getModifiers()));
        //返回值类型
        System.out.println(m3.getReturnType());
        //参数列表
        Class[] parameterType = m2.getParameterTypes();
        for (Class c:parameterType) {
            System.out.println(c.getName());
        }
        //注解
        Method method = cls.getMethod("myMethod");
        Annotation[] annotations = method.getAnnotations();
        for (Annotation a:annotations) {
            System.out.println(a);
        }

        //获取异常
        Class[] excptionTypes = method.getExceptionTypes();
        for (Class c:excptionTypes) {
            System.out.println(c.getName());
        }

        System.out.println("-----------------------------------");
        //调用方法
        Object obj = cls.newInstance();
        method.invoke(obj); //调用obj对象的myMethod()方法
        String result= (String) m2.invoke(obj,10,10);//调用obj对象的showInfo(int a,int b)方法，传入两个参数
        System.out.println(result);
    }
}
