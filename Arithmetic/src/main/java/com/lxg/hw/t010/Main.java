package com.lxg.hw.t010;

import java.util.Scanner;

/**
 * @author lxg
 * @description 字符个数统计
 * @date 2021/9/26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String s=scanner.nextLine();
            int len=getLen(s.trim());
            System.out.println(len);
        }
    }


    public static int  getLen(String s) {
        //辅助数组记录每个字符是否出现
        int[] arr=new int[128];
        //循环遍历字符串，统计出现的字符
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]=1;
        }
        int len=0;
        //遍历辅助数组，值为1的字符即为出现的字符，统计出现的字符种类
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                //计算出现的字符种类
                len++;
            }
        }
        return len;
    }
}
