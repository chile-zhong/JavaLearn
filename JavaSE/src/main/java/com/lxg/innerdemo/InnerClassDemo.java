package com.lxg.innerdemo;

/**
 * @author lxg
 * @description 内部类例子
 * @date 2021/9/3
 */
public class InnerClassDemo {
    private int id;
    private String name;

    public void show(){
        System.out.println("show");

        //可以通过
    }

    /*定义内部类*/
    public class InnerClass{
        //内部类属性
        private int age;
        //static String name = "zhangsan"; 内部类中不能定义静态属性

        //内部类方法
        public void  test(){
            System.out.println("test");
            System.out.println(id);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
