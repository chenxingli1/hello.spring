package com.hello.spring.hello.spring;

public class SuperCalculator {

    public void add(int a, int b, Person stu){
        int result = a + b;

        System.out.println(stu.getName()+"请求计算器计算了"+a+"+"+b);
        stu.fillBack(result);

    }

}
