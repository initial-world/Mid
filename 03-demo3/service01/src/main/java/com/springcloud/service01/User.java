package com.springcloud.service01;

/**
 * @Descrption TODO
 * @Author chenxin
 * @Date 2019/8/5
 * @Time 9:36
 */
public class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

}
