package com.muzi.Creational.factory.factoryMethod2.product.impl;


import com.muzi.Creational.factory.factoryMethod2.product.AbstractResource;

import java.io.InputStream;


public class FileResource extends AbstractResource {

    public FileResource() {
    }

    public FileResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
