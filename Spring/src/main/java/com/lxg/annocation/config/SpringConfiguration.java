package com.lxg.annocation.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;

/**
 * @author lxg
 * @description 标志Spring的核心配置类，用来取代xml文件配置
 * @date 2021/10/9
 */
@Configuration
//    <context:component-scan base-package="com.lxg.annocation"></context:component-scan>
@ComponentScan("com.lxg.annocation") //注解表名扫描位置

//<import resource=""/>
@Import(DataSourceConfiguration.class)
public class SpringConfiguration {

}
