package com.muzi.Structural.proxy.dynamicProxy.cglib;

import com.muzi.Creational.builder.Person;
import org.springframework.cglib.proxy.Enhancer;

public class Main {

    public static void main(String[] args) {
        //cglib通过Enhancer
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(DatabaseDataQuery.class);
        //设置一个拦截器，用来拦截方法
        enhancer.setCallback(new CacheMethodInterceptor());
        //创建代理类
        DatabaseDataQuery databaseDataQuery = (DatabaseDataQuery) enhancer.create();


        databaseDataQuery.query("Key1");
        databaseDataQuery.query("Key1");
        databaseDataQuery.query("Key2");



    }
}
