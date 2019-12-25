package com.twoot.factoryPattern;

public class Donkey extends Animal {

    String name;

    public Donkey(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
