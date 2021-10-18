package com.lxg.springboot1.service.impl;

import com.lxg.springboot1.bean.Account;
import com.lxg.springboot1.dao.IAccountDAO;
import com.lxg.springboot1.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lxg
 * @description Service实现类
 * @date 2021/10/15
 */
@Service
public class AccountService implements IAccountService {

    @Autowired
    IAccountDAO accountDAO;

    @Override
    public int add(Account account) {
        return accountDAO.add(account);
    }

    @Override
    public int update(Account account) {
        return accountDAO.update(account);
    }

    @Override
    public int delete(int id) {
        return accountDAO.delete(id);
    }

    @Override
    public Account findAccountById(int id) {
        return accountDAO.findAccountById(id);
    }

    @Override
    public List<Account> findAccountList() {
        return accountDAO.findAccountList();
    }
}
