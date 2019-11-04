package com.aopdemo.aop;



public class AopTest {

    public static void main(String[] args) throws Exception{
        CommonJoinPointConfig commonJoinPointConfig = CommonJoinPointConfig.class.newInstance();
        commonJoinPointConfig.serviceLayerExecution();

    }
}
