# 第51题 HJ51 输出单向链表中倒数第k个结点
## 描述
    输入一个单向链表，输出该链表中倒数第k个结点，链表的倒数第1个结点为链表的尾指针。
    
    链表结点定义如下：
    
    struct ListNode
    
    {
    
    int       m_nKey;
    
    ListNode* m_pNext;
    
    };
    
    
    
    正常返回倒数第k个结点指针，异常返回空指针
    
    本题有多组样例输入。

    输入描述：
    输入说明
    1 输入链表结点个数
    2 输入链表的值
    3 输入k的值
    
    输出描述：
    输出一个整数
    
    示例1
    输入：
    8
    1 2 3 4 5 6 7 8
    4
    复制
    输出：
    5

## 分析
    给出长度size,倒数K 转换为正数size-k,这样就方便多了。
    
## 总结
    1.定义节点ListNode
    2.根据输入长度和数值构建单向链表
    3.正向遍历链表，输出找到的节点值
