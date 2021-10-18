package com.lxg.hw.t006;

import java.util.Scanner;

/**
 * @author lxg
 * @description 质数因子
 * @date 2021/9/26
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        String result = getResult(num);
        System.out.println(result);
    }

    /**
     * 获取输入数据的质因数组成的字符串结果
     * @param num
     * @return
     */
    public static String getResult(long num){
        String result="";
        for (long i = 2; i <=Math.sqrt(num) ; i++) {
            while(num%i==0){
                num=num/i;
                result = result+i+" ";
            }
        }
        return num==1?result:result+num+" ";
    }
}
