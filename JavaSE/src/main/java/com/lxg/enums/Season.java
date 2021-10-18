package com.lxg.enums;

/**
 * @author lxg
 * @description 季节枚举类
 * @date 2021/9/23
 */
public class Season {
    //属性
    private final String seasonName;//季节名称
    private final String seasonDesc;//季节描述
    //利用构造器对属性进行赋值操作，并将构造器私有化，外界不能调用这个构造器，只能season内部自己调用
    private Season(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //提供枚举类有限的、确定的对象
    public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","烈日炎炎");
    public static final Season AUTUMN = new Season("秋天","硕果累累");
    public static final Season WINTER = new Season("冬天","冰天雪地");

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
