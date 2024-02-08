package com.muzi.Creational.factory.abstractFactory.product.impl;


import com.muzi.Creational.factory.abstractFactory.product.AbstractPictureResource;

import java.io.InputStream;

public class FtpPictureResource extends AbstractPictureResource {

    public FtpPictureResource() {
    }

    public FtpPictureResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
