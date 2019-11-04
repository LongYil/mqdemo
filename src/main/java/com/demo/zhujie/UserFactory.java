package com.demo.zhujie;

import java.lang.reflect.*;


public class UserFactory{
    public static User create(){
        User user = new User();
        // 获取User类中所有的方法（getDeclaredMethods也行）
        Method[] methods = User.class.getMethods();
        Field[] fields = User.class.getDeclaredFields();
        try{

            for (Field field:fields){
                if(field.isAnnotationPresent(Init.class)){
                    field.set(user,"555555");
                }
            }

            for (Method method : methods){
                // 如果此方法有注解，就把注解里面的数据赋值到user对象
                if (method.isAnnotationPresent(Init.class)){
                    Parameter[] parameters = method.getParameters();
                    Init init = method.getAnnotation(Init.class);
                    method.invoke(user, init.value());
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }

        return user;
    }
}