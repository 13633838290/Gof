package com.muzi.Creational.factory.abstractFactory.product.impl;

import com.muzi.Creational.factory.abstractFactory.product.AbstractPictureResource;

import java.io.InputStream;

public class DefaultPictureResource extends AbstractPictureResource {

    public DefaultPictureResource() {
    }

    public DefaultPictureResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
