package com.lxg.hw.t052;

import java.util.*;
/**
 * @author lxg
 * @description 字符串距离
 * @date 2021/10/5
 */
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.next();//字符串1
            String s2 = sc.next();//字符串2
            int dp[][] = new int[s1.length()+1][s2.length()+1];
            dp[0][0] = 0;
            for(int i = 1;i<dp.length;i++){
                dp[i][0] = i;
            }
            for(int i = 1;i<dp[0].length;i++){
                dp[0][i] = i;
            }
            for(int i = 1;i<dp.length;i++){
                for(int j = 1;j<dp[0].length;j++){
                    if(s1.charAt(i-1)==s2.charAt(j-1))
                    {
                        dp[i][j] = dp[i-1][j-1];
                    }
                    else {
                        dp[i][j] = Math.min(dp[i-1][j-1]+1,Math.min(dp[i][j-1]+1,dp[i-1][j]+1));
                    }
                }
            }
            System.out.println(dp[s1.length()][s2.length()]);
        }
    }
}
