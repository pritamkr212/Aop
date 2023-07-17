package com.SecurityAOP.AopSecurity.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(3)
@Aspect
@Component
public class MyApiAnalysticsAspect {
    @Before("com.SecurityAOP.AopSecurity.aspect.AopExpressions.forDaoPackageNoGetterSetter()")
    public void performanceAnalytics(){
        System.out.println("Performance compromised");
    }
}
