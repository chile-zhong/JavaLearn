package com.lxg.t01;

/**
 * @author lxg
 * @description 测试类
 * @date 2021/9/21
 *
 * 缺点：
 *
 */
public class Test {
    public static void main(String[] args) {
        //定义一个字符串，用来模拟前台支付方式
        String str = "微信";

        if("微信".equals(str)){
            //微信支付
            //new WeChat().payOnline();
            pay(new WeChat());
        }

        if("支付宝".equals(str)){
            //new AliPay().payOnline();
            pay(new AliPay());
        }

    }

   /* public static void pay(WeChat weChat){
        weChat.payOnline();
    }

    public static void pay(AliPay aliPay){
        aliPay.payOnline();
    }*/

    /**
     * 方法形参是接口，具体传入的是接口的实习那类对象--》多态的一种方式
     * @param m
     */
    public static void pay(Mtwm m){
        m.payOnline();
    }
}
