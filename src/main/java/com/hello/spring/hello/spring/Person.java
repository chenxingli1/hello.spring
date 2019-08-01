package com.hello.spring.hello.spring;

public class Person {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void fillBack(int res){
        System.out.println("结果为" + res);
    }
}
