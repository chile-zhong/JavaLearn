# 第 108 题:最小公倍数
## 描述
    正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
    
    输入描述：
    输入两个正整数A和B。
    
    输出描述：
    输出A和B的最小公倍数。
    
    示例1
    输入：
    5 7

    输出：
    35
## 分析
    求最小公倍数，需要求最大公约数，再使用两数相乘除以最大公约数，
    结果即为做小公倍数。