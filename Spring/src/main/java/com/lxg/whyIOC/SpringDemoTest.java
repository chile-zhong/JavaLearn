package com.lxg.whyIOC;

public class SpringDemoTest {
    public static void main(String[] args) {
       /*UserService userService = new UserServiceImpl();
       userService.getUser();*/

        UserService userService = new UserServiceImpl();

        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());

        userService.getUser();

        ((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl());

        userService.getUser();

    }
}
