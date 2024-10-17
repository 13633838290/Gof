package com.muzi.Structural.decorator;

public abstract class Decorator implements Compoent {

    Compoent compoent;

    public Decorator(Compoent compoent) {
        this.compoent = compoent;
    }

    @Override
    public void doSth() {
        compoent.doSth();
    }
}
