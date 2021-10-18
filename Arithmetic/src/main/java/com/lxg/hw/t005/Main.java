package com.lxg.hw.t005;

import java.util.Scanner;

/**
 * @author lxg
 * @description 进制转换
 * @date 2021/9/26
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            String s = input.nextLine();
            int sum = getDecimal(s);
            System.out.println(sum);
        }
    }

    /**
     * 将输入的16进制的s转换位十进制输出
     * @param s
     */
    public static int getDecimal(String s){
        int sum = 0;
        int temp = 0;
        //去掉前面的0x
        s = s.substring(2);
        //从后向前遍历，获取每个位置的值，再乘以权值
        for(int i=0;i<s.length();i++){
            char a = s.charAt(s.length()-i-1);
            if(a>='0' && a<='9'){
                temp = a - '0';
            }
            if(a>='A' && a <='Z'){
                temp = a - 'A' +10;
            }
            if(a>='a' && a<= 'z'){
                temp = a - 'a' + 10;
            }
            sum+=temp*Math.pow(16,i);
        }
        return sum;
    }

}
