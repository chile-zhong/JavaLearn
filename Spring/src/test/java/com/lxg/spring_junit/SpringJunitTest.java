package com.lxg.spring_junit;

import com.lxg.annocation.config.SpringConfiguration;
import com.lxg.annocation.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lxg
 * @description Spring集成Junit测试
 * @date 2021/10/9
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:application_annotation.xml")
@ContextConfiguration(classes = {SpringConfiguration.class})
public class SpringJunitTest {

    @Autowired
    private UserService userService;

    public void test(){

        userService.save();
    }
}
