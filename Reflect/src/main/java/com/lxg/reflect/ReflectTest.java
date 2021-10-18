package com.lxg.reflect;


import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author lxg
 * @description 创建自定义“框架”类
 * @date 2021/9/24
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception{
        //加载配置文件
        //创建Properties对象
        Properties pro = new Properties();
        //加载配置文件，转换成一个结合
        ClassLoader loader = ReflectTest.class.getClassLoader();
        InputStream in = loader.getResourceAsStream("pro.properties");
        pro.load(in);

        //获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //加载该类进内存
        Class cls = Class.forName(className);

        //创建对象
        Object obj = cls.newInstance();

        //获取方法对象
        Method method = cls.getMethod(methodName);

        //执行方法
        method.invoke(obj);
    }
}
