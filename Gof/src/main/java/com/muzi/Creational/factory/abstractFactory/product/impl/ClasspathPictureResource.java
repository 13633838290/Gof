package com.muzi.Creational.factory.abstractFactory.product.impl;


import com.muzi.Creational.factory.abstractFactory.product.AbstractPictureResource;

import java.io.InputStream;

public class ClasspathPictureResource extends AbstractPictureResource {

    public ClasspathPictureResource() {
    }

    public ClasspathPictureResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
