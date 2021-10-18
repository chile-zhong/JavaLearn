package com.lxg.t02;

/**
 * @author lxg
 * @description 学生类
 * @date 2021/9/21
 * 使用自定义注解
 */
@MyAnnotation("hello")
public class Student extends Person implements MyInterface{
    //属性
    private int sno;
    double height;
    protected  double weight;
    public double score;


    //方法
    @MyAnnotation("hello info")
    public String showInfo(){
        return "info";
    }

    public String showInfo(int a,int b){
        return "重载info";
    }

    private void work(){
        System.out.println("work");
    }

    void happy(){
        System.out.println("happy");
    }

    protected int getSno(){
        return sno;
    }

    //构造

    public Student() {
        System.out.println("无参构造");
    }

    public Student(double height,double weight){
        this.height = height;
        this.weight = weight;
    }

    private Student(int sno){
        this.sno = sno;
    }

    Student(int sno,double weight){
        this.sno = sno;
        this.weight = weight;
    }

    protected Student(int sno, double height,double weight){
        this.sno = sno;
        this.height = height;
        this.weight = weight;
    }
    @Override
    @MyAnnotation("hello myMethod")
    public void myMethod() throws RuntimeException{

        System.out.println("重写myMethod方法");
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", height=" + height +
                ", weight=" + weight +
                ", score=" + score +
                '}';
    }
}
