package com.lxg.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @SpringBootApplication是一个组合注解
 *
 * - 定义如下：
 * @Target({ElementType.TYPE})
 * @Retention(RetentionPolicy.RUNTIME)
 * @Documented
 * @Inherited
 * @SpringBootConfiguration
 * @EnableAutoConfiguration
 * @ComponentScan(
 *     excludeFilters = {@Filter(
 *     type = FilterType.CUSTOM,
 *     classes = {TypeExcludeFilter.class}
 * ), @Filter(
 *     type = FilterType.CUSTOM,
 *     classes = {AutoConfigurationExcludeFilter.class}
 * )}
 * )
 * public @interface SpringBootApplication {
 *      略。。。
 * }
 *
 * 由三个注解组成：
 * 1.@SpringBootConfiguration
 *      原来就是一个@Configuration,所以这个注解表明这是一个配置类，可以在这个类中配置Bean。
 *      从这个角度来说，类似于Spring中的applicationContext.xml文件的角色。
 *
 * 2.@EnableAutoConfiguration
 *      表示开启自动化配置。Springboot中的自动化配置是非侵入式的，在任意时刻，都可以使用自定义的配置
 *      代替自动化配置中的某一项配置。
 *
 * 3.@ComponentScan
 *      完成包扫描，也是spring中的功能，由于这个注解默认扫描的类都位于当前类所在的包下面，因此建议在时机项目
 *      开发中把项目启动类放在根包中
 *
 * 虽然项目的启动类也包含@Configuaration注解表示这个类中可以配置Bean，但是也可以专门创建一个
 * 类来完成配置Bean，这样便于Bean的管理。这个类只要加上@Configuaration注解即可。
 *
 * 项目启动类中的@ComponentScan注解，除了扫描@Service、@Repository、@Component、@Controller
 * 和@RestController等外，也会扫描@Configuaration注解的类。
 */
@SpringBootApplication
public class Springboot2Application {

    public static void main(String[] args) {
        /**
         * 在代码中配置使用的启动配置文件
         */
        /*SpringApplicationBuilder builder = new SpringApplicationBuilder(Springboot2Application.class);
        builder.application().setAdditionalProfiles("dev");
        builder.run(args);*/

        SpringApplication.run(Springboot2Application.class, args);
    }

}
