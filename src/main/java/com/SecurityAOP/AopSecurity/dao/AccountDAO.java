package com.SecurityAOP.AopSecurity.dao;

import com.SecurityAOP.AopSecurity.Account;

public interface AccountDAO {
   void addAccount(Account account,boolean vipFlag);
   boolean isAccountExist();
}
