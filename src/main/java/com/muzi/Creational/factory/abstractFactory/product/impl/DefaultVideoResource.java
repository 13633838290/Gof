package com.muzi.Creational.factory.abstractFactory.product.impl;


import com.muzi.Creational.factory.abstractFactory.product.AbstractVideoResource;

import java.io.InputStream;

public class DefaultVideoResource extends AbstractVideoResource {

    public DefaultVideoResource() {
    }

    public DefaultVideoResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
