package com.SecurityAOP.AopSecurity.dao;

import com.SecurityAOP.AopSecurity.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{
    @Override
    public void addAccount(Account account,boolean vipFlag) {
        System.out.println("Adding the account");
    }

    @Override
    public boolean isAccountExist() {
        System.out.println("Account Existed!");
        return true;
    }
}
