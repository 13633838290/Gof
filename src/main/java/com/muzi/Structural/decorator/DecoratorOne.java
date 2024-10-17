package com.muzi.Structural.decorator;

public class DecoratorOne extends Decorator {
    public DecoratorOne(Compoent compoent) {
        super(compoent);
    }

    @Override
    public void doSth() {
        super.doSth();
        System.out.println("装饰1.。。。");
    }
}
