package com.lxg.thread;

/**
 * @author lxg
 * @description 买火车票的多线程例子
 * @date 2021/9/13
 *
 * 原理: 每个窗口都是一个线程对象
 *
 */
public class BuyTicketThread1 extends Thread{

    //定义票数量10张
    static int ticketNum = 10; //多个对象共享10张票、增加static修饰

    //编写构造方法
    public BuyTicketThread1(String name){
        super(name);
    }
    /**
     * 每个窗口都是一个线程对象，每个对象执行的代码放入run方法中
     */
    @Override
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            /**
             * 使用BuyTicketThread1.class（唯一性）是确保
             * 该线程类的所有对象使用的是同一把锁，这样才能达到同步的效果
             *
             * 同步监视器总结：
             * 总结1：认识同步监视器（锁子）---synchronized(同步监视器)
             * 1.必须是引用数据类型，不能是基本数据类型
             * 2.也可以创建一个专门的同步监视器，没有任何业务含义
             * 3.一般使用共享资源作为同步监视器即可，比如这个例子中可以使用ticketNum变量，但是必须把类型改成
             *   引用类型
             * 4.在同步代码块中不能改变同步监视器的引用
             * 5.尽量不要用String类和包装类Integer做同步监视器
             * 6.建议使用final修饰同步监视器
             *
             * 总结2：同步代码块的执行过程
             * 1.第一个线程来到同步代码块，发现同步监视器处于open状态，需要close然后执行其中的代码
             * 2.第一个线程执行过程中，发生了线程切换（阻塞 就绪），第一个线程失去了cpu，但是没有开锁open
             * 3.第二个线程获取了cpu，来到了同步代码块，发现同步监视器处于close状态，无法执行其中的代码，第二个线程也
             *   进入阻塞状态
             * 4.第一个线程再次得到cpu，接着执行后续的代码，同步代码块执行完毕，释放锁 open
             * 5.第二个线程再次获得cpu，来到了同步代码块，发现同步监视器处于open状态，拿到锁并且锁上，由阻塞状态进入
             *   就绪状态，再进入运行状态，重复第一个线程的处理过程（加锁）
             * 强调：
             *  同步代码块中能发生cpu的切换吗？ 能，但是后续被执行的线程也无法执行同步代码块，因为锁任然处于close状态
             *
             * 总结3：
             * 1.多个代码块使用了同一个同步监视器（锁），锁住一个代码块的同时，也锁住使用该锁的所有代码块，其他的线程无法访问其中任何一个
             *   被锁锁住的代码块
             * 2.多个代码块使用了同一个同步监视器（锁），锁住一个代码块的同时，也锁住使用该锁的所有代码块，但是没有锁住使用其他同步监视器的
             * 代码块，其他线程有机会访问其他同步监视器的代码块。
             *
             *
             *
             */
            /*synchronized(BuyTicketThread1.class){
                if(ticketNum>0){ //对票数进行判断、票数大于0才抢票
                    System.out.println("我在"+getName()+"买到从北京到哈尔冰的第"+ticketNum--+"张票");
                }
            }*/

            /**
             * 使用同步方法
             * 同步方法总结：
             * 总结1：
             * 多线程再争抢资源，就要实现线程的同步（就要进行加锁，并且这个锁必须是共享的，必须是唯一的）
             * 使用的锁一般都是引用类型
             * 加锁的目的就为了解决线程安全问题
             *
             * 总结2：
             * 1.不要将run方法定义为同步方法，锁住的东西太多，效率低
             * 2.非静态同步方法的同步监视器是this,静态同步方法的同步监视器就是 类名.class 字节码信息对象
             * 3.同步代码块的效率要高于同步方法
             *   - 原因：同步方法是将线程挡在了方法的外部，同步代码块将线程挡在了代码块的外部，但是是方法的内部。
             * 4.同步方法的锁是this,一旦锁住一个方法，就锁住了所有同步的方法；同步代码块只是锁住了使用该同步监视器的
             * 代码块，而没有锁使用其他监视器的代码块。
             *
             *
             */
            buyTicket();
        }
    }

    /**
     * 定义同步方法
     * 使用static锁住的同步监视器是：BuyTicketThread1.Class
     */
     public static synchronized void buyTicket(){
         if(ticketNum>0){ //对票数进行判断、票数大于0才抢票
             System.out.println("我在"+Thread.currentThread().getName()+"买到从北京到哈尔冰的第"+ticketNum--+"张票");
         }
     }
}

/**
 * @author lxg
 * @description 测试买火车票的案例
 * @date 2021/9/14
 */
class TestBuyTicketThread1 {

    public static void main(String[] args) {
        /**
         * 多个窗口抢票：几个窗口就对应几个线程对象
         *
         * 创建三个线程对象，表示三个购票窗口
         */
        BuyTicketThread1 t1 = new BuyTicketThread1("窗口1");
        t1.start();

        BuyTicketThread1 t2 = new BuyTicketThread1("窗口2");
        t2.start();

        BuyTicketThread1 t3 = new BuyTicketThread1("窗口3");
        t3.start();


    }
}
