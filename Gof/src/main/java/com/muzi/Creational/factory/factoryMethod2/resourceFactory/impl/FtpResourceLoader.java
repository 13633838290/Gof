package com.muzi.Creational.factory.factoryMethod2.resourceFactory.impl;


import com.muzi.Creational.factory.factoryMethod2.resourceFactory.IResourceLoader;
import com.muzi.Creational.factory.simpleFatory.Resource;


public class FtpResourceLoader implements IResourceLoader {
    @Override
    public Resource load(String url) {
        // 中间省略复杂的创建过程
        return new Resource(url);
    }
}
