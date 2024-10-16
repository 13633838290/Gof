package com.muzi.Creational.factory.factoryMethod2.resourceFactory;


import com.muzi.Creational.factory.factoryMethod2.product.AbstractResource;
import com.muzi.Creational.factory.simpleFatory.Resource;

/**
 * IResourceFactory
 * @author it楠老师
 * @createTime 2023-05-09
 */
public interface IResourceLoader {
    AbstractResource load(String url);
}
