package com.lxg.t02;

import java.lang.annotation.Annotation;

/**
 * @author lxg
 * @description 测试通过反射获取类接口，包，注解
 * @date 2021/9/21
 */
public class Test4 {
    public static void main(String[] args) {
        //获取字节码信息
        Class cls = Student.class;

        Class[] interfaces = cls.getInterfaces();
        for (Class c:interfaces) {
            System.out.println(c);
        }

        //得到父类的接口
        //先得到父类的字节码信息
        Class supperClass =  cls.getSuperclass();

        //得到接口
        Class[] interfaces1 = supperClass.getInterfaces();
        for (Class c:interfaces1) {
            System.out.println(c);
        }

        //获得运行时类所在的包
        Package apackage = cls.getPackage();
        System.out.println(apackage);
        System.out.println(apackage.getName());

        //获取运行时类的注解
        Annotation[] annotations = cls.getAnnotations();
        for (Annotation a:annotations) {
            System.out.println(a);
        }
    }

}
