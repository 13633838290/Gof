package com.muzi.Creational.factory.abstractFactory.resourceFactory;


import com.muzi.Creational.factory.abstractFactory.product.AbstractPictureResource;
import com.muzi.Creational.factory.abstractFactory.product.AbstractTextResource;
import com.muzi.Creational.factory.abstractFactory.product.AbstractVideoResource;


public interface IResourceLoader {

    /**
     * 加载图片资源的工厂方法
     * @param url 给定的资源url
     * @return 图片资源
     */
    AbstractPictureResource loadPictureResource(String url);

    /**
     * 加载视频资源的工厂方法
     * @param url 给定的资源url
     * @return 视频资源
     */
    AbstractVideoResource loadVideoResource(String url);

    /**
     * 加载文本资源的工厂方法
     * @param url 给定的资源url
     * @return 文本资源
     */
    AbstractTextResource loadTestResource(String url);
}
