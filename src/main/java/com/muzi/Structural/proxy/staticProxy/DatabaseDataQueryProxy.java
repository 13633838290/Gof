package com.muzi.Structural.proxy.staticProxy;

import java.util.HashMap;
import java.util.Map;

public class DatabaseDataQueryProxy implements DataQuery {
    //实现缓存，使用HashMap
    Map<String,String> cacheMap =new HashMap<>();
    //创建持有代理对象
    private DatabaseDataQuery dataQuery;
    //1屏蔽代理对象
    public DatabaseDataQueryProxy( ) {
        this.dataQuery = new DatabaseDataQuery();
    }

    @Override
    //2 对代理对象的方法做增强
    public String query(String queryKey) {
        String s = cacheMap.get(queryKey);
        //查询缓存，命中则返回
        if (s!=null){
            System.out.println("命中缓存，返回结果");
            return s;
        }
        //查询数据库
        s=dataQuery.query(queryKey);
        //查到结果返回并放入缓存
        if (s!=null){
            cacheMap.put(queryKey,s);
        }
        System.out.println("未命中，查询数据库");
        return s;
    }
}
