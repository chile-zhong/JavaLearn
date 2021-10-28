package com.lxg.singleton;

/**
 * @author lxg
 * @description 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用。
 * 缺点：不管用到与否，类装载时就完成初始化
 * @date 2021/10/28
 */
public class Mgr01 {

    //饿汉式，一开始就实例化，等到要使用的时候来拿就行
    private static final Mgr01 INSTANCE = new Mgr01();

    //另外一种写法
    private static final Mgr01 INSTANCE2;
    //也可以使用静态代码块初始化
    static {
        INSTANCE2 = new Mgr01();
    }

    /**
     * 私有化构造方法，保证在外界不能通过new关键字来实例化对象，
     * 只能使用已经初始化好的这个实例，想要使用的，来拿这个就行
     */
    private Mgr01(){

    }
    /**
     * 通过接口来获取已经初始化的单例
     * @return
     */
    public static Mgr01 getInstance(){
        return INSTANCE;
    }

    public void method(){
        System.out.println("method...");
    }

    public static void main(String[] args) {
        Mgr01 m1 = Mgr01.getInstance();
        m1.method();
        Mgr01 m2 = Mgr01.getInstance();
        m2.method();
        System.out.println(m1==m2);
    }
}
