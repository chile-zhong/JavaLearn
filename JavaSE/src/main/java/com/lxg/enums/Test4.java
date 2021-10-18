package com.lxg.enums;

/**
 * @author lxg
 * @description 测试类
 * @date 2021/9/23
 */
public class Test4 {
    public static void main(String[] args) {
        //所有的枚举对象，调用show()方法的时候都是一样的
        Season4.SPRING.show();
        Season4.SUMMER.show();
        Season4.AUTUMN.show();
        Season4.WINTER.show();
    }
}
