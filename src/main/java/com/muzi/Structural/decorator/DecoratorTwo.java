package com.muzi.Structural.decorator;

public class DecoratorTwo extends Decorator{
    public DecoratorTwo(Compoent compoent) {
        super(compoent);
    }

    @Override
    public void doSth() {
        super.doSth();
        System.out.println("装饰2.。。。。。");
    }
}
