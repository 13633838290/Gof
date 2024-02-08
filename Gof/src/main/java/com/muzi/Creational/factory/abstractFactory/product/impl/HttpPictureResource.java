package com.muzi.Creational.factory.abstractFactory.product.impl;


import com.muzi.Creational.factory.abstractFactory.product.AbstractPictureResource;

import java.io.InputStream;

public class HttpPictureResource extends AbstractPictureResource {

    public HttpPictureResource() {
    }

    public HttpPictureResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
