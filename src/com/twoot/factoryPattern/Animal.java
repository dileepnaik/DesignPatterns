package com.twoot.factoryPattern;

abstract class Animal {

    public abstract String getName();

    @Override
    public String toString() {
        return this.getName();
    }
}
