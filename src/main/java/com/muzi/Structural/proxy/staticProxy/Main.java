package com.muzi.Structural.proxy.staticProxy;

public class Main {
    public static void main(String[] args) {
        DataQuery dataQuery = new DatabaseDataQueryProxy();

        String value = dataQuery.query("key1");
        System.out.println(value);

        value = dataQuery.query("key1");
        System.out.println(value);

        value = dataQuery.query("key2");
        System.out.println(value);

    }
}
