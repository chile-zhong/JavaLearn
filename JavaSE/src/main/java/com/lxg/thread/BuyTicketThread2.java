package com.lxg.thread;

/**
 * @author lxg
 * @description 使用第二种方式创建线程的方式来完成抢火车票的小例子
 * @date 2021/9/14
 */
public class BuyTicketThread2 implements Runnable{
    //火车票数
    int ticketNum = 10;

    @Override
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            //同步代码块,ticketNum--可能出现安全问题
            /*synchronized(this){
                if(ticketNum > 0){
                    System.out.println("我在"+Thread.currentThread().getName()+"买到第"+ticketNum--+"张火车票");
                }
            }*/

            //使用同步方法
            buyTicket();
        }
    }

    /**
     * 将可能出现安全问题的代码封装在一个同步方法中
     */
    public synchronized void buyTicket(){//锁住的同步监视器是this
        if(ticketNum > 0){
            System.out.println("我在"+Thread.currentThread().getName()+"买到第"+ticketNum--+"张火车票");
        }
    }
}

/**
 * @author lxg
 * @description 测试第二种强火车票
 * @date 2021/9/14
 */
class TestBuyTicketThread2 {

    public static void main(String[] args) {
        //定义三个窗口，及创建三个子线程
        BuyTicketThread2 buyTIcket = new BuyTicketThread2();
        Thread t1 = new Thread(buyTIcket, "窗口一");
        t1.start();

        Thread t2 = new Thread(buyTIcket, "窗口二");
        t2.start();

        Thread t3 = new Thread(buyTIcket, "窗口三");
        t3.start();
    }
}
