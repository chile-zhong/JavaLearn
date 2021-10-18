package com.lxg.enums;


/**
 * 枚举类实现接口
 */
public enum Season4 implements TestInterface{
    SPRING{
        @Override
        public void show() {
            System.out.println("春天");
        }
    },
    SUMMER{
        @Override
        public void show() {
            System.out.println("夏天");
        }
    },
    AUTUMN{
        @Override
        public void show() {
            System.out.println("秋天");
        }
    },
    WINTER{
        @Override
        public void show() {
            System.out.println("冬天");
        }
    };

    /**
     * 重写接口中的抽象方法
     */
    /*@Override
    public void show() {
        System.out.println("这是Season4");
    }*/
}
