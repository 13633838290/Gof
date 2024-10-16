package com.muzi.Structural.proxy.dynamicProxy.jdk;


public class DatabaseDataQuery implements com.muzi.Structural.proxy.dynamicProxy.jdk.DataQuery {
    @Override
    public String query(String queryKey) {
        // 他会使用数据源从数据库查询数据很慢
        System.out.println("正在从数据库查询数据");
        return "result";
    }

    @Override
    public String queryAll(String queryKey) {
        // 他会使用数据源从数据库查询数据很慢
        System.out.println("正在从数据库查询数据");
        return "all result";
    }
}
