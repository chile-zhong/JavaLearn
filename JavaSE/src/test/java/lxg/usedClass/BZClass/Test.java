package lxg.usedClass.BZClass;

/**
 * @author lxg
 * @description 包装类测试类
 * @date 2021/9/4
 *
 * 包装类：
 *   包装类是将基本类型封装成一个类，包含属性和方法
 *   使用：
 *     在使用过程中，会涉及到自动装箱和自动拆箱
 *     拆箱：包装类型自动转换为基本数据类型
 *         如： a = new Integer(100);
 *         本质上 编译器为我们添加了：
 *          int a = new Integer(100).intVlaue();
 *
 *     装箱：基本类型自动的封装到与他相同的类型的包装类中，
 *         如： Integer i = 100；
 *         本质上是，编译器为我们添加了：
 *         Integer i = Integer.valueOf(100);
 *
 */
public class Test {

    /*测试整数类型的基本数据类型和包装类型*/
    @org.junit.Test
    public void  test(){

        //        int a = 10;
        //        Integer i = new Integer(10);
        //        //通过方法进行类型的转换
        //        Integer i2 = Integer.valueOf(a);
        //        int i3 = i.intValue();
        //        System.out.println(a == i);
        //        Float f1 = new Float(3.14);
        //        Double d1 = new Double(3.14);
        //        int i =100;
        //        Integer i1 = 100;
        //        Integer i2 = 100;
        //        Integer i3 = 200;
        //        Integer i4 = 200;
        //        System.out.println(i1==i2);
        //        System.out.println(i3==i4);

        //        Double d1 = 1.0;
        //        Double d2 = 1.0;
        //        Double d3 = 2.0;
        //        Double d4 = 2.0;
        //        System.out.println(d1==d2);
        //        System.out.println(d3==d4);

        Integer i = 10;
        int a = i;
        System.out.println(a==i);
    }

}
