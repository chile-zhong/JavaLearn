# 质数因子
## 描述
    功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）
    （如180的质因子为2 2 3 3 5 ）
    最后一个数后面也要有空格

    输入描述：
    输入一个long型整数

    输出描述：
    按照从小到大的顺序输出它的所有质数的因子，以空格隔开。最后一个数后面也要有空格。

    示例1
    输入：
    180
    复制
    输出：
    2 2 3 3 5

## 概念
    * 质因数
        在数论里是指能整除给定正整数的质数。除了1以外，两个没有其他共同质因子的正整数称为互质。因为1没有质因子，
        1与任何正整数（包括1本身）都是互质。正整数的因数分解可将正整数表示为一连串的质因子相乘，质因子如重复可
        以用指数表示。根据算术基本定理，任何正整数皆有独一无二的质因子分解式 [1]  。只有一个质因子的正整数为
        质数。
        每个合数都可以写成几个质数（也可称为素数）相乘的形式 [2]  ，这几个质数就都叫做这个合数的质因数。
        如果一个质数是某个数的因数，那么就说这个质数是这个数的质因数；而这个因数一定是一个质数。
    * 质数
        质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数。
    * 合数
        合数是指在大于1的整数中除了能被1和本身整除外，还能被其他数（0除外）整除的数。与之相对的是质数，
        而1既不属于质数也不属于合数。最小的合数是4。其中，完全数与相亲数是以它为基础的。
    * 注意：1既不是质数，也不是合数
     
## 分析
    使用一个双重循环解决。
    
    外循环的需要满足条件num不等于1
    
    pnum从2开始不断递增
    
    内循环每次判断num是否能被pnum整除，如果可以，就把pnum加进结果，否则pnum自加1，继续进行判断
    
    因为是从2开始判断的，也就是说，从2到num中的所有数中，是2的倍数的数都不会再出现了。3也是同样在道理，
    这就保证每次出现的，被选择用来整除num的，都是质数。
    
## 总结
    1.利用Scanner类得到一个长整数sc.nextLong()；
    
    2.判断得到的正整数是否是一个质数，否就执行下面步骤，
    
    (1).分解质因数
    
    (2).定义一个集合，用于装分解出来的因数，
    
    (3).对合数取商数和余数
    
    (4).对余数进行判断是否是质数，是就跳出循环，否就执行循环体，直至是质数
    
    3.遍历集合，打印出质因数。
    这里不考虑4,6,9等的原因是，如果可以被4整除，那么肯定可以被2整除，其余同理。所以不必担心这一点
