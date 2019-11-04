package com.aopdemo.aop;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* com.aopdemo.aop.*.*(..))")
    public void serviceLayerExecution() {
        System.out.println("hello");
    }

}