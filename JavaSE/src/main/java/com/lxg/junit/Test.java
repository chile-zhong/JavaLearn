package com.lxg.junit;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author lxg
 * @description 测试类
 * @date 2021/9/23
 */
public class Test {
    public static void main(String[] args) {
        //测试加法
        Calculate cal = new Calculate();
        int result = cal.add(10,20);
        System.out.println(result);

        //测试减法
       //int result = cal.sub(20,10);
        System.out.println(result);

    }
}
