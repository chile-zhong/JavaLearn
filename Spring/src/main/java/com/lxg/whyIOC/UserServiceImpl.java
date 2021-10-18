package com.lxg.whyIOC;

public class UserServiceImpl implements UserService{

    //private  UserDao userDao = new UserDaoImpl();

    //private  UserDao userDao = new UserDaoMysqlImpl();

    private UserDao userDao;  // = new UserDaoOracleImpl();

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
