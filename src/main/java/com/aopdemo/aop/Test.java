package com.aopdemo.aop;

import lombok.Data;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("张三");
        Person p2 = new Person("李四");
        operator2(p1,p2);
        System.out.println("p1" + p1.getName());
        System.out.println("p2:" +p2.getName());
    }
    private static void operator2(Person person1,Person person2){
        person1.setName("方寸");
        person2 = new Person("方管家");
    }
}

@Data
class Person{
    private String name;
    public Person(String name) {
        this.name = name;
    }
}







