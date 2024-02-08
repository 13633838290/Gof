package com.muzi.Creational.factory.abstractFactory.product.impl;


import com.muzi.Creational.factory.abstractFactory.product.AbstractPictureResource;

import java.io.InputStream;

public class FilePictureResource extends AbstractPictureResource {

    public FilePictureResource() {
    }

    public FilePictureResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
