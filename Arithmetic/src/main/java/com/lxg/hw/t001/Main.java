package com.lxg.hw.t001;

import java.util.Scanner;

/**
 * @author lxg
 * @description 华为机考第一题
 * @date 2021/9/23
 *
 *
 * 描述
 * 计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。
 * （注：字符串末尾不以空格为结尾）
 * 输入描述：
 * 输入一行，代表要计算的字符串，非空，长度小于5000。
 *
 * 输出描述：
 * 输出一个整数，表示输入字符串最后一个单词的长度。
 * 示例1
 * 输入：
 * hello nowcoder
 * 复制
 * 输出：
 * 8
 * 复制
 * 说明：
 * 最后一个单词为nowcoder，长度为8
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(test(s));
    }
    public static int test(String s){
        String[] ss = s.trim().split(" ");
        return ss[ss.length-1].length();
    }
}
