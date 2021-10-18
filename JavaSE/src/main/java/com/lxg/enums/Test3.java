package com.lxg.enums;

/**
 * @author lxg
 * @description 测试类
 * @date 2021/9/23
 */
public class Test3 {
    public static void main(String[] args) {

        /**
         * 使用enum关键字创建的Season枚举类父类是java.lang.Enum,父类中的方法，子类可以
         * 拿来用，常用方法有一下部分：
         */

        //toString():获取对象名字
        Season3 autumn = Season3.AUTUMN;
        System.out.println(autumn);

        //values():返回枚举对象的数组
        Season3[] values = Season3.values();
        for (Season3 s:values) {
            System.out.println(s);
        }

        //valueOf():通过对象名获取枚举对象
        //注意：对象的名字必须写对，否则会抛出异常
        Season3 autumn1 = Season3.valueOf("AUTUMN");
    }
}
