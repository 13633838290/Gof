package com.muzi.Creational.factory.abstractFactory.product.impl;


import com.muzi.Creational.factory.abstractFactory.product.AbstractTextResource;

import java.io.InputStream;

public class HttpTestResource extends AbstractTextResource {

    public HttpTestResource() {
    }

    public HttpTestResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
