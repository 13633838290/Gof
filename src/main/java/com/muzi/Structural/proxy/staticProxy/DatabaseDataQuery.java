package com.muzi.Structural.proxy.staticProxy;

public class DatabaseDataQuery implements DataQuery{
    @Override
    public String query(String queryKey) {
        //通过数据库查询
        System.out.println("数据库查询中。。。。");
        return "DataBaseQuery result";
    }
}
