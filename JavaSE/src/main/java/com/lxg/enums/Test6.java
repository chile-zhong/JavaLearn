package com.lxg.enums;

/**
 * @author lxg
 * @description ceshilei
 * @date 2021/9/23
 */
public class Test6 {
    public static void main(String[] args) {
        Gender sex = Gender.男;

        //switvh后面的（）中可以放入枚举
        //switvh后面的():int、short、byte、char、String、枚举
        switch(sex){
            case 男:
                System.out.println("男孩");
                break;
            case 女:
                System.out.println("女孩");
            default:
                System.out.println("人妖");
        }
    }
}
