package com.muzi.Creational.factory.abstractFactory.product.impl;


import com.muzi.Creational.factory.abstractFactory.product.AbstractVideoResource;

import java.io.InputStream;

public class ClasspathVideoResource extends AbstractVideoResource {

    public ClasspathVideoResource() {
    }

    public ClasspathVideoResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
