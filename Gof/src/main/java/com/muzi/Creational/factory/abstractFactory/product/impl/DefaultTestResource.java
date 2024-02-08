package com.muzi.Creational.factory.abstractFactory.product.impl;


import com.muzi.Creational.factory.abstractFactory.product.AbstractTextResource;

import java.io.InputStream;

public class DefaultTestResource extends AbstractTextResource {

    public DefaultTestResource() {
    }

    public DefaultTestResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
