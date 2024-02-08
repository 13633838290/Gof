package com.muzi.Creational.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;


@Getter
@ToString
@Builder
public class Person {
    private String name;
    private int age;
    private String address;

    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder();
        com.muzi.Creational.builder.Person person = builder.age(12).name("lily").address("xxx").build();
    }
}
