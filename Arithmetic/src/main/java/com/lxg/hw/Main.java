package com.lxg.hw;

import java.util.Scanner;

/**
 * @author lxg
 * @description 1
 * @date 2021/10/6
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine().trim());
        String[] a = in.nextLine().trim().split(" ");
        int[] b = new int[num];
        for (int i = 0; i <b.length ; i++) {
            b[i] = Integer.parseInt(a[i]);
        }
        int flag = 0;
        int aa=0;
        int bb=0;
        int cc=0;
        for (int i = 0; i <b.length ; i++) {
            if(flag==1){
                break;
            }
            aa = b[i];
            for (int j = 0; j <b.length ; j++) {
                if(j==i){
                    continue;
                }
                if (flag==1){
                    break;
                }
                bb = b[j];
                for (int k = 0; k <b.length ; k++) {
                    if(k==j && k==i){
                        continue;
                    }
                    if (flag==1){
                        break;
                    }
                    cc = b[k];
                    int re = bb+2*cc;
                    if(aa==re){
                        flag =1;
                        break;
                        //System.out.println(aa+" "+bb+" "+cc);
                    }
                }
            }
        }
        if(flag==1){
            System.out.println(aa+" "+bb+" "+cc);
        }else{
            System.out.println(0);
        }
    }
}
