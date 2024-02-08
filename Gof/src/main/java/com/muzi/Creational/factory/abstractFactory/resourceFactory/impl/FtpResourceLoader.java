package com.muzi.Creational.factory.abstractFactory.resourceFactory.impl;


import com.muzi.Creational.factory.abstractFactory.product.AbstractPictureResource;
import com.muzi.Creational.factory.abstractFactory.product.AbstractTextResource;
import com.muzi.Creational.factory.abstractFactory.product.AbstractVideoResource;
import com.muzi.Creational.factory.abstractFactory.resourceFactory.IResourceLoader;
import com.muzi.Creational.factory.simpleFatory.Resource;


public class FtpResourceLoader implements IResourceLoader {

    @Override
    public AbstractPictureResource loadPictureResource(String url) {
        return null;
    }

    @Override
    public AbstractVideoResource loadVideoResource(String url) {
        return null;
    }

    @Override
    public AbstractTextResource loadTestResource(String url) {
        return null;
    }
}
