package com.muzi.Creational.factory.abstractFactory.product.impl;


import com.muzi.Creational.factory.abstractFactory.product.AbstractTextResource;

import java.io.InputStream;

public class FtpTestResource extends AbstractTextResource {

    public FtpTestResource() {
    }

    public FtpTestResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
