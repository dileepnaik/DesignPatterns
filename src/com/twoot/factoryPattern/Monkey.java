package com.twoot.factoryPattern;

public class Monkey extends Animal {

    String name;

    public Monkey(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
