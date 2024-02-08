package com.muzi.Creational.factory.factoryMethod.resourceFactory;


import com.muzi.Creational.factory.simpleFatory.Resource;

/**
 * IResourceFactory
 * @author it楠老师
 * @createTime 2023-05-09
 */
public interface IResourceLoader {
    Resource load(String url);
}
