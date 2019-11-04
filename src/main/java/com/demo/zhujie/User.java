package com.demo.zhujie;



public class User{
    private String name;
    private String age;
    @Init
    public String tel;

    private String getName()
    {
        return name;
    }

    @Init(value = "liang")
    private void setName(String name)
    {
        this.name = name;
    }

    private String getAge()
    {
        return age;
    }

    @Init(value = "23")
    private void setAge(String age)
    {
        this.age = age;
    }

    private String getTel() {
        return tel;
    }

    private void setTel(String tel) {
        this.tel = tel;
    }
}