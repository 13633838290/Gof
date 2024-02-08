package com.muzi.Creational.factory.factoryMethod2.resourceFactory.impl;


import com.muzi.Creational.factory.factoryMethod2.product.AbstractResource;
import com.muzi.Creational.factory.factoryMethod2.product.impl.HttpResource;
import com.muzi.Creational.factory.factoryMethod2.resourceFactory.IResourceLoader;

public class HttpResourceLoader implements IResourceLoader {
    @Override
    public AbstractResource load(String url) {
        // 中间省略复杂的创建过程
        return new HttpResource(url);
    }
}
