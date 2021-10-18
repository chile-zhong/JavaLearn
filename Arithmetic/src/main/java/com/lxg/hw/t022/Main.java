package com.lxg.hw.t022;

import java.util.Scanner;

/**
 * @author lxg
 * @description 汽水瓶
 * @date 2021/9/29
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i <10 ; i++) {
            int num = in.nextInt();
            if(num==0){
                return;
            }
            int count=0;
            int n=0;
            int m=0;
            if(num<3){
                System.out.println(0);
            }else{
                while(num>=3){
                    n = num/3;
                    m = num%3;
                    if((n+m)==2){
                        num = n+m+1;
                    }else{
                        num = n+m;
                    }
                    count+=n;
                }
                if(m!=0){
                    count+=n;
                }
                System.out.println(count);
            }
        }
    }
}
