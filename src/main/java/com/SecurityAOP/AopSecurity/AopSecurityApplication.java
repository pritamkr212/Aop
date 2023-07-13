package com.SecurityAOP.AopSecurity;

import com.SecurityAOP.AopSecurity.dao.AccountDAO;
import com.SecurityAOP.AopSecurity.dao.MembershipDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopSecurityApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO accountDAO, MembershipDAO membershipDAO){
		return runner -> {
			demoAccount(accountDAO,membershipDAO);
		};
	}


	private void demoAccount(AccountDAO accountDAO, MembershipDAO membershipDAO) {
		accountDAO.addAccount(new Account(),true);
		accountDAO.isAccountExist();

		membershipDAO.addMembershipAccount();
		membershipDAO.isMembered();
	}
}
