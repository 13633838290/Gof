package com.muzi.Creational.factory.abstractFactory.product.impl;


import com.muzi.Creational.factory.abstractFactory.product.AbstractVideoResource;

import java.io.InputStream;

public class FileVideoResource extends AbstractVideoResource {

    public FileVideoResource() {
    }

    public FileVideoResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
