package com.lxg.hw.t107;

import java.util.Scanner;

/**
 * @author lxg
 * @description 求立方根
 * @date 2021/9/30
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        if(num<0.0){
            num = Math.abs(num);
            System.out.println("-"+getCube(num));
        }else if(num==0){
            System.out.println("0");
        }else{
            System.out.println(getCube(num));
        }
    }
    public static String getCube(double num){
        int a = 0;
        double b = 0.0;
        double c = 0.00;
        while(true){
            if(a*a*a<=num && (a+1)*(a+1)*(a+1)>=num){
                break;
            }
            a++;
        }
        while(true){
            double i = a+b;
            double j = a+b+0.1;
            if( (i*i*i)<= num && (j*j*j)>=num){
                break;
            }
            b+=0.1;
        }
        while(true){
            double i = a+b+c;
            double j = a+b+c+0.01;
            if( (i*i*i)<= num && (j*j*j)>=num){
                break;
            }
            c+=0.01;
        }
        return String.format("%.1f",a+b+c);
    }
}
