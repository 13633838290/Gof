package com.muzi.Creational.factory.abstractFactory.product.impl;


import com.muzi.Creational.factory.abstractFactory.product.AbstractTextResource;

import java.io.InputStream;

public class FileTestResource extends AbstractTextResource {

    public FileTestResource() {
    }

    public FileTestResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
