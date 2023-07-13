package com.SecurityAOP.AopSecurity.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO{
    @Override
    public boolean addMembershipAccount() {
        System.out.println("Adding Membership for this acount");
        return true;
    }

    @Override
    public boolean isMembered() {
        System.out.println("It is membered User");
        return true;
    }


}
