package com.SecurityAOP.AopSecurity.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {
    @Before("execution(* com.SecurityAOP.AopSecurity.dao.*.*(..))")
    public void beforeAddAccountAdvice(){
        System.out.println("Check Before adding");
    }
}
