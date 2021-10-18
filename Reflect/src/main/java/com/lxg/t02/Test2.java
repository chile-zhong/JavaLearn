package com.lxg.t02;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author lxg
 * @description 测试通过反射获取属性并赋值
 * @date 2021/9/21
 */
public class Test2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        //获取字节码信息
        Class cls = Student.class;

        //获取属性
        //getFields():获取当前运行时的类和其父类的被public修饰的属性
        Field[] fields1 = cls.getFields();
        for (Field f:fields1) {
            System.out.println(f);
        }

        System.out.println("----------------------------------");
        //getDeclaredFields()获取运行时类中所有的属性
        Field[] fields2 = cls.getDeclaredFields();
        for (Field f:fields2) {
            System.out.println(f);
        }

        System.out.println("-----------------------------------");
        //获取指定属性
        Field score = cls.getField("score");
        System.out.println(score);

        Field sno = cls.getDeclaredField("sno");
        System.out.println(sno);

        System.out.println("------------------------------------");
        //获取属性的具体结构
        //获取修饰符
        int modifier =  sno.getModifiers();//可以有多个修饰符
        System.out.println(modifier);
        System.out.println(Modifier.toString(modifier));
        System.out.println(Modifier.toString(sno.getModifiers()));

        //获取属性的数据类型
        Class clazz = sno.getType();
        System.out.println(clazz.getName());

        //获取属性名字
        String name = sno.getName();
        System.out.println(name);

        System.out.println("--------------------------------------");
        //给属性赋值,给属性设置值，必须要有对象
        Field score1 = cls.getField("score");
        Object o1 = cls.newInstance();
        score1.set(o1,98);//给o1这个对象设置score这个属性值为98.
        System.out.println(o1);
    }
}
