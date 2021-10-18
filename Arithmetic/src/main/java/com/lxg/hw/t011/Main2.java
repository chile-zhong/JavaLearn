package com.lxg.hw.t011;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author lxg
 * @description 数字颠倒方式二
 * @date 2021/9/26
 */
public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //使用栈
        Stack stack = new Stack();
        for (int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
