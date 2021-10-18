package com.lxg.enums;

/**
 * 使用关键字enum创建枚举类
 */
public enum Season2 {
    //提供枚举类有限的、确定的对象

    /**
     * enum 枚举类要求对象（常量）必须放在最开始的位置上
     * 多个对象之间使用逗号隔开，最后一个对象之后使用分号
     */
    SPRING("春天","春暖花开"),
    SUMMER("夏天","烈日炎炎"),
    AUTUMN("秋天","硕果累累"),
    WINTER("冬天","冰天雪地");


    //属性
    private final String seasonName;//季节名称
    private final String seasonDesc;//季节描述

    //利用构造器对属性进行赋值操作，并将构造器私有化，外界不能调用这个构造器，只能season内部自己调用
    private Season2(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }


    //额外因素
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

}
