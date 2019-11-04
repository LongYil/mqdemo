package com.aopdemo.aop;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        operator();
    }
    private static void operator(){
        int[] ary1 = new int[6];
        int[] ary2 = {1,2,3,4};
        ary1 = Arrays.copyOf(ary2,5);
        System.out.println(ary2);
    }
}







