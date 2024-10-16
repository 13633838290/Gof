package com.muzi.Creational.factory.abstractFactory.product.impl;


import com.muzi.Creational.factory.abstractFactory.product.AbstractVideoResource;

import java.io.InputStream;

public class FtpVideoResource extends AbstractVideoResource {

    public FtpVideoResource() {
    }

    public FtpVideoResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
