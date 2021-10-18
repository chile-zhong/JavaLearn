package lxg.thread;

/**
 * @author lxg
 * @description 多线程测试类
 * @date 2021/9/7
 *
 * 线程的概念；
 * 程序：Program，是一个指令的集合
 * 进程：progress，正在执行中的程序，是一个静态的概念
 *    - 进程是程序的一次静态执行过程，占用特定的地址空间
 *    - 每个进程都是独立的，由3部分组成：cpu,code,data
 *    - 缺点：内存的浪费，cpu的负担
 * 线程：是进程中的一个”单一的连续控制流程“（a single sThread,equential flow of control）/执行路径
 *    - 线程又被称为轻量级进程
 *    - thread run at the same time,independently of one another
 *    - 一个进程可以拥有多个并行的线程
 *    - 一个进程中的线程共享相同的内存单元/内存地址空间-可以访问相同的变量和对象，而且它们从同一堆中分配对象-->通信、数据交换、同步操作
 *    - 由于线程间的通信是在同一地址空间上进行的，所以不需要额外的通信机制，这就使得通信更简便而且信息传递的速度也更快
 */
public class Test {
}
