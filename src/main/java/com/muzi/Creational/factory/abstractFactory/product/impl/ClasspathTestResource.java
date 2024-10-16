package com.muzi.Creational.factory.abstractFactory.product.impl;


import com.muzi.Creational.factory.abstractFactory.product.AbstractTextResource;

import java.io.InputStream;

public class ClasspathTestResource extends AbstractTextResource {

    public ClasspathTestResource() {
    }

    public ClasspathTestResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
