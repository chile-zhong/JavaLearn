package lxg.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author lxg
 * @description 异常测试类
 * @date 2021/9/4
 *
 * 异常：
 *    在程序运行过程中，出现的不正常的情况叫做异常
 *
 *    注意：
 *      1.相同的代码在运行的时候，根据输入的参数或者操作的不同，有可能会发生异常，有可能不会发生异常
 *      所以在编写代码的时候尽可能的保证代码的正确性，以及对异常的处理。
 *
 *      2.如果需要增加过滤条件来解决代码中出现的异常，很多时候需要添加复杂的逻辑代码来进行判断，会使代码变得非常臃肿，
 *      不利于维护，可读性还非常差，因此，Java中使用异常机制来处理程序中出现的问题。
 *
 *      3程序在运行过程中如果出现了问题，会导致后面的代码无法争产执行，而使用异常机制之后，可以对异常进行处理，同时后续的代码会
 *      继续执行，不会终端整个程序。
 *
 *      4.在异常的处理过程中，不要知识简单的输出，要尽可能详细的异常信息进行输出
 *       e.printStackTrace():打印异常的堆栈信息，可以从异常信息的最后一行开始追踪，寻找自己编写的Java类
 *
 * 异常处理：
 *      Java使用异常处理机制为程序提供了错误处理的能力
 *
 * 异常处理步骤：
 *      程序中预先设置好对付异常的处理方法---->程序运行----->遇见异常------>对异常进行处理------->处理完毕，程序继续运行
 *
 * 异常关键字：
 *      try  catch  finally  throw  throws
 *
 * 异常处理方式：
 *      1.捕获异常：
 *         try: 执行可能产生异常的代码
 *         try{d代码逻辑}catch(Exception e){异常处理逻辑}
 *
 *         try{代码逻辑}catch(具体的异常Exception e){异常处理逻辑}catch(具体异常Exception e){异常处理逻辑}
 *            可以针对每一种具体的异常做出相应的丰富的处理。
 *             注意：使用多层异常的时候一定要注意相关异常的顺序，将子类放在最前面的catch里面，父类异常放在最后面。
 *
 *            执行过程中可能存在的情况：
 *               1.正常执行，只执行try中的代码
 *               2.遇到异常情况，会处理try中异常代码之前的逻辑，后面的逻辑不会执行，最后会执行catch中的逻辑。
 *               3.使用多重catch的时候，会遇到异常不匹配的情况，此时依然会报错，因此建议在catch的最后加上Exception的捕获，
 *
 *         catch：捕获异常
 *
 *         finally：无论是否发生异常，代码总能执行
 *         在程序运行过程中，如果处理异常的过程中包括了finally的处理，那么无论代码是否发生异常，finally中的代码总会执行，
 *         finally一般包含哪些处理？
 *           1.IO流的关闭操作一般设置在finally中
 *           2.数据库的链接关闭操作设置在finally中
 *
 *         总结：
 *           try语句在返回前，将其他所有的操作执行完，保留好要返回的返回值，而后转入执行finally中的return语句，而后分为以下三种情况：
 *           1.如果finally中有return语句，则会将try中的return语句覆盖掉，直接执行finally中的return语句，得到返回值，
 *             这样便无法得到try之前保留的返回值。
 *           2.如果finally中没有return 语句，也没有要改变返回值，则执行完finally中的语句后，会接着执行try中的return语句，返回之前
 *             保留的值。
 *           3.如果finally中没有return语句，但是需要改变返回值，这里类似与引用传递与参数传递的区别，分以下两种情况：
 *             1）如果return的数据是基本数据类型或文本字符串，则在finally中对该基本数据类型的改变不起作用，try中的return语句
 *             依然会返回进入finally之前的保留的值。
 *             2）如果return的数据是引用数据类型，而在finally中对该引用的属性值改变起作用，try中return语句返回的就是finally中
 *             改变后的属性值。
 *
 *
 *      2.声明异常：
 *         throws：声明方法可能要抛出的所有异常
 *         在异常情况出席那的时候，可以使用try---catch---finally的方式对异常进行处理，初次之外，可以将异常向外抛出
 *         1.在方法调用过程当中，可以存在很多方法之间的调用，此时假如每个方法都包含了异常情况，那么就需要在每个方法中都需要
 *           进行try——--catch---，另外一种简单的方式，就是在最外层的调用处处理一次即可，使用throws的方法，对所有执行过程中的所有方法
 *           出现的异常进行同一集中处理。
 *         2.如何判断是使用throw还是使用try__catch的方式？
 *           最稳当的方式就是在每个方法中都使用异常处理
 *           偷懒的方式是判断在整个调用过程中，外层的调用方式是否有对异常的处理，如果有，直接使用throws，如果没有，那么就是用
 *           try——catch的方式处理
 *
 *
 *      3.抛出异常：
 *         throw：手动抛出异常
 *
 */
public class Test {

    /*测试异常1*/
    @org.junit.Test
    public void test(){
        /*除数为0的异常*/
        //System.out.println(1/0);

        /*文件找不到异常
         * 现在jdk8版本不报错，是因为会自动创建不存在的文件
         * */
        //File file = new File("abc.txt");

        /*可能存在除数为0的异常*/
        /*Scanner in = new Scanner(System.in);
        System.out.println("请输入被除数:");
        int num1 = in.nextInt();
        System.out.println("请输入被除数：");
        int num2 = in.nextInt();
        System.out.println(String.format("%d / %d = %d",num1,num2,num1/num2));
        System.out.println("感谢使用本程序");*/

        /*添加过滤条件控制出错情况*/
        Scanner in = new Scanner(System.in);
        System.out.println("请输入被除数:");
        int num1 = in.nextInt();
        if(num1>0 && num1<1000) {
            System.out.println("请输入被除数：");
            int num2 = in.nextInt();
            if(num2!=0){
                System.out.println(String.format("%d / %d = %d", num1, num2, num1 / num2));
            }else{
                System.out.println("除数不能为0");
            }
        }else{
            System.out.println("输入参数有问题");
        }
        System.out.println("感谢使用本程序");
    }


    /*使用异常机制*/
    @org.junit.Test
    public void test2(){
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("请输入被除数:");
            int num1 = in.nextInt();
            System.out.println("请输入被除数：");
            int num2 = in.nextInt();
            System.out.println(String.format("%d / %d = %d", num1, num2, num1 / num2));
        }/*catch(Exception e){
            System.out.println("出现异常");
            *//*打印异常堆栈*//*
            e.printStackTrace();

            *//*打印异常原因*//*
            System.out.println(e.getMessage());
        }*/
        catch(ArithmeticException e){
            System.out.println("数字异常，除数不能是0");
            e.printStackTrace();
        }catch(InputMismatchException e ){
            System.out.println("输入参数类型不匹配");
            e.printStackTrace();
        }catch(Exception e){
            System.out.println("最后的异常");
            e.printStackTrace();
        }

        System.out.println("感谢使用本程序");
    }


    /*Finally Demo*/
    @org.junit.Test
    public void testFinally(){
        try{
            //出现异常
            //System.out.println(1/0);
            //没有异常
            System.out.println(1/1);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //try中的代码有无异常，finally中的代码都执行
            System.out.println("i am finally");
        }
    }

    /*exception Demo*/
    @org.junit.Test
    public void exceptionDemo(){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入课程号：");
        try{
           int i = in.nextInt();
           if(i==0){
               System.out.println("Java");
           }else if(i==1){
                System.out.println("c++");
            }else if (i==2){
                System.out.println("python");
            }
        }catch(InputMismatchException e){
            e.printStackTrace();
        }finally{
            System.out.println("欢迎选课");
        }
    }

    /*抛出异常*/
    @org.junit.Test
    public void testThrow(){
        try{
            show();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void show() throws Exception {
       String gender = "1234";
       if("man".equals(gender)){
           System.out.println("man");
       }else if("wuman".equals(gender)){
           System.out.println("woman");
       }else{
           throw new Exception("性别出现错误");
       }
    }

}
