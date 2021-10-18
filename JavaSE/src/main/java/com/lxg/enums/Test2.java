package com.lxg.enums;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author lxg
 * @description 测试类2
 * @date 2021/9/23
 */
public class Test2 {
    public static void main(String[] args) {
        Season2 winter = Season2.WINTER;
        System.out.println(winter);

        //enum关键子对应的枚举类上层父类是Java.lang.Enum
        //自定义的枚举类上层父类是Object
        System.out.println(Season2.class.getSuperclass().getName());
    }
}
