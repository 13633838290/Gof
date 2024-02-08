package com.muzi.Creational.factory.abstractFactory.product.impl;


import com.muzi.Creational.factory.abstractFactory.product.AbstractVideoResource;

import java.io.InputStream;

public class HttpVideoResource extends AbstractVideoResource {

    public HttpVideoResource() {
    }

    public HttpVideoResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
