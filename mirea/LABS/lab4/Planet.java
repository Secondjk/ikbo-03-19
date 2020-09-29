package ru.mirea.labs.lab4;

public class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Planet's name: " + this.getName();
    }
}
