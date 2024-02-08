package com.muzi.Creational.factory.abstractFactory.product;

import java.io.InputStream;

public abstract class AbstractTextResource implements Resource {

    // 图片的一些公用的成员变量，方法都可以定义在这个类中
    private String url;


    public AbstractTextResource() {
    }

    public AbstractTextResource(String url) {
        this.url = url;
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
