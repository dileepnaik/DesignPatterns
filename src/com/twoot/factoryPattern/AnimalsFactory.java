package com.twoot.factoryPattern;

public class AnimalsFactory {

    public static Animal getInstance(String animal, String name) {

        if (animal.equals("Donkey")) {
            return new Donkey(name);
        } else if (animal.equals("Monkey")) {
            return new Monkey(name);
        } else {
            return null;
        }
    }
}
