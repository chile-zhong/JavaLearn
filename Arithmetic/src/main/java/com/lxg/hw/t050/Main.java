package com.lxg.hw.t050;
import java.util.Stack;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 *稍微修改一下返回值可以支持小数
 */
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //将负数替换成0-X
        String str = sc.nextLine().replaceAll("(?<![0-9)}\\]])(?=-[0-9({\\[])", "0");
        //将{}，[]替换成()
        str = str.replaceAll("\\[|\\{","(").replaceAll("}|]",")");
        System.out.print(calculate(str));
    }


    public static String calculate(String str){
        // 对表达式进行预处理，并简单验证是否是正确的表达式
        // 存放处理后的表达式
        List<String> list = new ArrayList<>();
        char[] arr = str.toCharArray();

        // 存放数字临时变量
        StringBuffer tmpStr = new StringBuffer();
        for (char c : arr) {
            // 如果是数字或小数点，添加到临时变量中
            if (c >= '0' && c <= '9') {
                tmpStr.append(c);
            } else if (c == '.') {
                if (tmpStr.indexOf(".") > 0) {
                    throw new RuntimeException("非法字符");
                }
                tmpStr.append(c);
            }

            // 如果是加减乘除或者括号，将数字临时变量和运算符依次放入List中
            else if (c == '+' || c == '-' || c == '*' || c == '/' || c == '(' || c == ')') {
                if (tmpStr.length() > 0) {
                    list.add(tmpStr.toString());
                    tmpStr.setLength(0);
                }
                list.add(c + "");
            } else if (c == ' ') {
                continue;
            } else {
                throw new RuntimeException("非法字符");
            }
        }
        if (tmpStr.length() > 0) {
            list.add(tmpStr.toString());
        }

        // 初始化后缀表达式
        List<String> strList = new ArrayList<>();

        // 运算过程中，使用了两次栈结构，
        // 第一次是将中缀表达式转换成后缀表达式，第二次是计算后缀表达式的值
        Stack<String> stack = new Stack<>();

        // 声明临时变量，存放栈元素
        String tmp;

        // 将中缀表达式转换成后缀表达式
        for (String s : list) {
            // 如果是左括号直接入栈
            if (s.equals("(")) {
                stack.push(s);
            }

            // 如果是右括号，执行出栈操作，依次添加到后缀表达式中，直到出栈元素为左括号，左括号和右括号都不添加到后缀表达式中
            else if (s.equals(")")) {
                while (!(tmp = stack.pop()).equals("(")) {
                    strList.add(tmp);
                }
            }

            // 如果是加减乘除，弹出所遇优先级大于或等于该运算符的栈顶元素（栈中肯定没有右括号，认为左括号的优先级最低），然后将该运算符入栈
            else if (s.equals("*") || s.equals("/")) {
                while (!stack.isEmpty()) {
                    // 取出栈顶元素
                    tmp = stack.peek();// 取出但不移除
                    if (tmp.equals("*") || tmp.equals("/")) {
                        stack.pop();
                        strList.add(tmp);
                    } else {
                        break;
                    }
                }
                stack.push(s);
            } else if (s.equals("+") || s.equals("-")) {
                while (!stack.isEmpty()) {
                    // 取出栈顶元素
                    tmp = stack.peek();
                    if (!tmp.equals("(")) {
                        stack.pop();
                        strList.add(tmp);
                    } else {
                        break;
                    }
                }
                stack.push(s);
            }

            // 如果是数字，直接添加到后缀表达式中
            else {
                strList.add(s);
            }
        }

        // 最后依次出栈，放入后缀表达式中
        while (!stack.isEmpty()) {
            strList.add(stack.pop());
        }

        // 计算后缀表达式的值
        Stack<Integer> newStack = new Stack<>();
        for (String s : strList) {
            // 若遇运算符，则从栈中退出两个元素，先退出的放到运算符的右边，后退出的放到运算符的左边
            // 运算后的结果再进栈，直到后缀表达式遍历完毕
            if (s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-")) {
                Integer b1 = newStack.pop();
                Integer b2 = newStack.pop();
                switch (s) {
                    case "+":
                        newStack.push(b2+b1);
                        break;
                    case "-":
                        newStack.push(b2-b1);
                        break;
                    case "*":
                        newStack.push(b2*b1);
                        break;
                    case "/":
                        newStack.push(b2/b1);
                        break;
                }
            }

            // 如果是数字，入栈
            else {
                newStack.push(new Integer(s));
            }
        }
        // 最后，栈中仅有一个元素，就是计算结果
        return newStack.peek().toString();
    }
}
