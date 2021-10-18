package com.lxg.t02;

/**
 * @author lxg
 * @description 验证Class类对象实例
 * @date 2021/9/21
 */
public class Demo {
    public static void main(String[] args) {
        /**
         * Class类具体实例
         * 1.类：外部类、内部类
         * 2.接口
         * 3.注解
         * 4.数组
         * 5.基本数据类型
         * 6.void
         */

        Class c1 = Person.class;
        Class c2 = Comparable.class;
        Class c3 = Override.class;

        int[] array1 = {1,2,3};
        Class c4 = array1.getClass();
        int[] array2 = {4,5,6};
        Class c5 = array2.getClass();
        /*
        * 结果为true，同一纬度，同一个元素类型，得到的字节码就是同一个
        * */
        System.out.println(c4==c5);

        Class c6 = int.class;
        Class c7 = void.class;
    }
}
