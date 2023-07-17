package com.SecurityAOP.AopSecurity.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class AopExpressions {
    @Pointcut("execution(* com.SecurityAOP.AopSecurity.dao.*.get*(..))")
    public void getter() {}
    @Pointcut("execution(* com.SecurityAOP.AopSecurity.dao.*.set*(..))")
    public void setter() {}

    @Pointcut("execution(* com.SecurityAOP.AopSecurity.dao.*.*(..))")
    public void forDaoPackage() {}

    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter() {}
}
