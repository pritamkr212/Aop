package com.SecurityAOP.AopSecurity.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(1)
@Component
public class MyCloudAsyncAspect {
    @Before("com.SecurityAOP.AopSecurity.aspect.AopExpressions.forDaoPackageNoGetterSetter()")
    public void logToCloudAsync(){
        System.out.println("Logging to cloud in async fashion");
    }
}
