package com.aopdemo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;

public class BeforeAspect {

    @Before("com.aopdemo.aop.CommonJoinPointConfig.serviceLayerExecution()")
    public void before(JoinPoint joinPoint) {
        System.out.println(" -------------> Before Aspect ");
        System.out.println(" -------------> before execution of " + joinPoint);
    }
}