# 第 101题 输入整型数组和排序标识，对其元素按照升序或降序进行排序
## 描述
    输入整型数组和排序标识，对其元素按照升序或降序进行排序
    输入描述：
    第一行输入数组元素个数
    第二行输入待排序的数组，每个数用空格隔开
    第三行输入一个整数0或1。0代表升序排序，1代表降序排序
    
    输出描述：
    输出排好序的数字
    
    示例1
    输入：
    8
    1 2 4 9 3 55 64 25
    0

    输出：
    1 2 3 4 9 25 55 64

    示例2
    输入：
    5
    1 2 3 4 5
    1

    输出：
    5 4 3 2 1

## 分析
    读取输入的数据保存在数组中，再读取排序方式，根据排序方式来
    调用排序算法对数组进行排序。
    
## 总结
    