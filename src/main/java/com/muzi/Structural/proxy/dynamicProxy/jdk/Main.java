package com.muzi.Structural.proxy.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


public class Main {

    public static void main(String[] args) {
        // jdk提供的代理实现，主要是使用Proxy类来完成
        // 1、classLoader：被代理类的类加载器
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        // 2、代理类需要实现的接口数组
        Class[] classes = new Class[]{DataQuery.class};
        // 3、InvocationHandler
        CacheInvocationHandler cacheInvocationHandler = new CacheInvocationHandler();

        DataQuery dataQuery  = (DataQuery) Proxy.newProxyInstance(contextClassLoader, classes, cacheInvocationHandler);


        // 事实上调用query方法的使用，他是调用了invoke
        String result = dataQuery.query("key1");
        System.out.println(result);
        System.out.println("--------------------");
        result = dataQuery.query("key1");
        System.out.println(result);
        System.out.println("--------------------");
        result = dataQuery.query("key2");
        System.out.println(result);
        System.out.println("++++++++++++++++++++++++++++++++++++");

        // 事实上调用queryAll方法的使用，他是调用了invoke
        result = dataQuery.queryAll("key1");
        System.out.println(result);
        System.out.println("--------------------");
        result = dataQuery.queryAll("key1");
        System.out.println(result);
        System.out.println("--------------------");
        result = dataQuery.queryAll("key2");
        System.out.println(result);
        System.out.println("--------------------");
    }
}
