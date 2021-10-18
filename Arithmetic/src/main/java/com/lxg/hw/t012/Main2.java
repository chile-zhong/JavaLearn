package com.lxg.hw.t012;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author lxg
 * @description 字符串反转方式二
 * @date 2021/9/27
 */
public class Main2 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for (int i = 0; i <s.trim().length() ; i++) {
            stack.push(s.charAt(i));
        }
        while(!stack.empty()){
            System.out.print(stack.pop());
        }
    }
}
