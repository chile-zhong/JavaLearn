package com.lxg.spring_mvc1.listener;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

/**
 * @author lxg
 * @description 解决耦合
 * @date 2021/10/10
 */
public class WebApplicationContextUtils {

    /**
     * 将从ServletContext中获取app属性值的代码抽取出来，
     * 以后在其他地方使用时，不用关心记不记得住“app”值了，
     * 只需要调用这个工具类中的这个方法就可以获取app对应的值ApplicationContext了
     * @param context
     * @return
     */
    public static ApplicationContext getApplicationContext(ServletContext context){
        return (ApplicationContext)context.getAttribute("app");
    }
}
