package com.lxg.hw.t089;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author lxg
 * @description 24点问题
 * @date 2021/9/29
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        //按空格切分成字符串数组
        String[] s = str.trim().split(" ");
        //将字符串数组转换为数字数组
        int[] num = new int[s.length];
        //保存纸牌面值跟数字的对应关系，索引表示对应数字减一，元素值表示纸牌面值
        String[] ss = new String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        //将字符串数组转化为数字数组，如果字符串中有大王小王则输出 “ERROR”，退出程序。
        for (int i = 0; i < s.length; i++) {
            if("joker".equals(s[i]) || "JOKER".equals(s[i])){
                System.out.println("ERROR");
                return;
            }
        }
        for (int i = 0; i <s.length ; i++) {
            //A表示1
            if("A".equals(s[i])){
                num[i] = 1;
            }else if("J".equals(s[i])){ //J为11
                num[i] = 11;
            }else if("Q".equals(s[i])){//Q为12
                num[i] = 12;
            }else if("K".equals(s[i])){//K为13
                num[i] = 13;
            }else{//数字型正常转换
                num[i] = Integer.parseInt(s[i]);
            }
            //System.out.print(num[i]+" ");
        }
        //开始暴力解决
        int flag = 0;  //如果有多个组合满足条件，则通过这个标志只打印一个就退出程序
        if(flag==0){
            for (int i = 0; i <4 ; i++) {
                //取第一个计算数
                int a = num[i];
                for (int j = 0; j <4 ; j++) {
                    //每个数只能出现一次，即不能是第一个数，后面同理
                    if(j==i){
                        continue;
                    }
                    //已经有一个满足条件的数据了
                    if(flag==1){
                        break;
                    }
                    //取第二个计算数
                    int b = num[j];
                    for (int k = 0; k <4 ; k++) {
                        //第三个数不能是第一个和第二个
                        if(k==j || k==i){
                            continue;
                        }
                        if(flag==1){
                            break;
                        }
                        int c = num[k];
                        for (int l = 0; l <4 ; l++) {
                            //第四个数不能是前面三个
                            if(l==k || l==j || l==i){
                                continue;
                            }
                            if(flag==1){
                                break;
                            }
                            int d = num[l];
                            //调用helper方法，找出这四个数能满足条件的运算组合方式
                            String out = helper(a,b,c,d);
                            //存在组合方式，且输出结果就是组合出现的运算符，进行字符串拼接
                            if(!"NONE".equals(out)){
                                String re="";
                                re+=ss[a-1]+out.charAt(0);
                                re+=ss[b-1]+out.charAt(1);
                                re+=ss[c-1]+out.charAt(2);
                                re+=ss[d-1];
                                System.out.println(re);
                                flag = 1;
                            }
                        }
                    }
                }
            }
        }
        // helepr function输出为NONE输出NONE：
        if(flag==0){
            System.out.println("NONE");
        }
    }

    /**
     * 判断两个数能否通过 + - * / 来计算得到结果24
     * 如果能 返回运算符
     * 如果不能 返回 NONE
     * @param a
     * @param b
     * @return
     */
    public static String  helper(int a,int b){
        if((a+b)==24){
            return "+";
        }else if((a-b)==24){
            return "-";
        }else if((a*b)==24){
            return "*";
        }else if(b != 0 && a % b == 0 && a / b == 24){
            return "/";
        }else{
            return "NONE";
        }
    }

    /**
     * 重载，判断三个数是否能通过 + - * / 四种运算符计算得到结果24
     * @param a
     * @param b
     * @param c
     * @return
     */
    static public String helper(int a, int b, int c){
        if (!helper(a * b, c).equals("NONE")) return "*" + helper(a * b, c);
        else if (!helper(a + b, c).equals("NONE")) return "+" + helper(a + b, c);
        else if (!helper(a - b, c).equals("NONE")) return "-" + helper(a - b, c);
        else if (b != 0 && a % b == 0 && !helper(a / b, c).equals("NONE")) return "/" + helper(a * b, c);
        else return "NONE";
    }

    /**
     * 重载，判断四个数是否能通过 + - * / 四种运算符计算得到结果24
     * @param a
     * @param b
     * @param c
     * @param d
     * @return
     */
    static public String helper(int a, int b, int c, int d){
        if (!helper(a * b, c, d).equals("NONE")) return "*" + helper(a * b, c, d);
        else if (!helper(a + b, c, d).equals("NONE")) return "+" + helper(a + b, c, d);
        else if (!helper(a - b, c, d).equals("NONE")) return "-" + helper(a - b, c, d);
        else if (b != 0 && a % b == 0 && !helper(a / b, c, d).equals("NONE")) return "/" + helper(a * b, c, d);
        else return "NONE";
    }
}
