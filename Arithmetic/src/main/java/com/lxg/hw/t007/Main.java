package com.lxg.hw.t007;


import java.util.Scanner;

/**
 * @author lxg
 * @description 取近似值
 * @date 2021/9/26
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double  num = input.nextDouble();
        System.out.println(getReturn(num));
        /**
         * 使用现成的函数round()
         */
        //System.out.println(Math.round(num));
    }
    public static int getReturn(double num){
        int i = (int)num;
        return (num-i)>=0.5?i+1:i;
    }
}
