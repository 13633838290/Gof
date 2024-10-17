package com.muzi.Structural.decorator;

public class Main  {
    public static void main(String[] args) {
        Compoent compoent = new ConcreteComponent();

         compoent = new DecoratorOne(compoent);

         compoent = new DecoratorTwo(compoent);

         compoent.doSth();


    }
}
