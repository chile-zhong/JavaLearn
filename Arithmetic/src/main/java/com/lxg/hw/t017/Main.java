package com.lxg.hw.t017;

import java.util.Scanner;

/**
 * @author lxg
 * @description 坐标移动
 * @date 2021/9/30
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            String str = in.nextLine();
            String[] ss = str.trim().split(";");
            int x=0;
            int y=0;
            for (int i = 0; i <ss.length ; i++) {
                if(!ss[i].matches("[AWDS][0-9]{1,2}")){
                    continue;
                }
                String flag = ss[i].substring(0,1);
                int num = Integer.parseInt(ss[i].substring(1,ss[i].length()));
                if("A".equals(flag)){
                    x-=num;
                }else if("D".equals(flag)){
                    x+=num;
                }else if("W".equals(flag)){
                    y+=num;
                }else if("S".equals(flag)){
                    y-=num;
                }
            }
            System.out.println(x+","+y);
        }
    }
}
