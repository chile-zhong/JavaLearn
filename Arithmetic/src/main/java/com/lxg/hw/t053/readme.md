# 第53题 杨辉三角变形
## 描述
    //杨辉三角规律                                    行号    第一个偶数在该行第几个
    //                    1                           1             -1
    //                1   1   1                       2             -1
    //            1   2   3   2   1                   3              2
    //         1  3   6   7   6   3   1               4              3
    //      1  4  10  16  19  16  10  4  1            5              2
    //   1  5  15 30  45  51  45  30  15 5  1         6              4
    //
    //  首个偶数在该行第几个的规律： -1 -1 （2 3 2 4）···（2 3 2 4）
    以上三角形的数阵，第一行只有一个数1，以下每行的每个数，是恰好是它上面的数，左上角数到右上角的数，3个数之和（如果不存在某个数，认为该数就是0）。
    
    求第n行第一个偶数出现的位置。如果没有偶数，则输出-1。例如输入3,则输出2，输入4则输出3。
    
    
    输入n(n <= 1000000000)
    本题有多组输入数据，输入到文件末尾，请使用while(cin>>)等方式读入
    输入描述：
    输入一个int整数
    
    输出描述：
    输出返回的int值
    
    示例1
    输入：
    4
    2
    复制
    输出：
    3
    -1
## 分析
    //杨辉三角规律                                    行号    第一个偶数在该行第几个
    //                    1                           1             -1
    //                1   1   1                       2             -1
    //            1   2   3   2   1                   3              2
    //         1  3   6   7   6   3   1               4              3
    //      1  4  10  16  19  16  10  4  1            5              2
    //   1  5  15 30  45  51  45  30  15 5  1         6              4
    //
    //  首个偶数在该行第几个的规律： -1 -1 （2 3 2 4）···（2 3 2 4）

## 总结
    1.不要被题目给误导了