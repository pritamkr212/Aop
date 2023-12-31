package com.SecurityAOP.AopSecurity.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Aspect
@Component
public class DemoLoggingAspect {
    //Applying pointcut declaration to advice
    @Before("com.SecurityAOP.AopSecurity.aspect.AopExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(){
        System.out.println("Check Before adding");
    }

}
