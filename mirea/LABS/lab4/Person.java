package ru.mirea.labs.lab4;

public class Person implements Nameable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person's name: " + this.getName();
    }
}
