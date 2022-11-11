package com.core;

public class PersonTest extends Person{
    public PersonTest(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "抽象方法";
    }
}
