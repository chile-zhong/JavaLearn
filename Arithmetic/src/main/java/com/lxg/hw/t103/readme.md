# 第 103 题 HJ103 Redraiment的走法
## 描述
    Redraiment是走梅花桩的高手。Redraiment可以选择任意一个
    起点，从前到后，但只能从低处往高处的桩子走。他希望走的步数最
    多，你能替Redraiment研究他最多走的步数吗？
    
    本题含有多组样例输入
     
    输入描述：
    输入多组数据，1组有2行，第1行先输入数组的个数，第2行再输入
    梅花桩的高度
    
    输出描述：
    一组输出一个结果
    
    示例1
    输入：
    6
    2 5 1 5 4 5 
    3
    3 2 1

    输出：
    3
    1

    说明：
    6个点的高度各为 2 5 1 5 4 5
    如从第1格开始走,最多为3步, 2 4 5
    从第2格开始走,最多只有1步,5
    而从第3格开始走最多有3步,1 4 5
    从第5格开始走最多有2步,4 5
    所以这个结果是3。
    
## 分析  