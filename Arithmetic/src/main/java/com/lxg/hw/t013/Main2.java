package com.lxg.hw.t013;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author lxg
 * @description 字符串逆序方式二，使用栈的先进后出特性
 * @date 2021/9/27
 */
public class Main2 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String[] s = str.split(" ");
            for(int i=0;i<s.length;i++){
                stack.push(s[i]);
            }
            while(!stack.isEmpty()){
                System.out.print(stack.pop()+" ");
            }
            System.out.println();
        }
    }
}

