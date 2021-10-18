package com.lxg.stream.file;

/**
 * @author lxg
 * @description 递归
 * @date 2021/10/7
 *
 * 递归概述：
 *  一编程的角度来看，递归指的是方法定义中调用此方法本身的现象
 *
 * 递归解决问题的思路：
 *  把一个复杂问题层层转化为一个与原问题相似的规模较小的问题来求解，
 *  递归策略只需要少量的程序就可以描述出解题过程所需要的多次重复计算。
 *
 * 递归解决问题需要找出两个内容：
 * 1.递归出口：否则会出现内存提出
 * 2.递归规则：与原问题相似的规模较小的问题
 *
 */
public class File5 {
    public static void main(String[] args) {

        System.out.println(f(20));

        System.out.println(jiecheng(5));
    }


    /**
     * 递归求n的阶乘
     * @param n
     * @return
     */
    public static int jiecheng(int n){
        if(n==1){
            return 1;
        }else{
            return n*jiecheng(n-1);
        }
    }

    /**
     * 递归解决兔子数量计算
     * @param n
     * @return
     */
    public static int f(int n){
        if(n==1 || n==2){
            return 1;
        }else{
            return f(n-1)+f(n-2);
        }
    }
}
