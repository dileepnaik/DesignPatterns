package com.twoot.factoryPattern;

public class FactoryPatternTest {
    public static void main(String[] args) {

        Animal monkey = AnimalsFactory.getInstance("Monkey", "I am Monkey");
        System.out.println(monkey + "\n" + monkey.getClass());

        Animal donkey = AnimalsFactory.getInstance("Donkey", "I am Donkey");
        System.out.println(donkey + "\n" + donkey.getClass());

    }
}
