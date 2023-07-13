package com.SecurityAOP.AopSecurity.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {

    //Declaration of pointcut
    @Pointcut("execution(* com.SecurityAOP.AopSecurity.dao.*.*(..))")
    private void forDaoPackage() {}

    //Applying pointcut declaration to advice
    @Before("forDaoPackage()")
    public void beforeAddAccountAdvice(){
        System.out.println("Check Before adding");
    }

    @Before("forDaoPackage()")
    public void performanceAnalytics(){
        System.out.println("Performance compromised");
    }
}
