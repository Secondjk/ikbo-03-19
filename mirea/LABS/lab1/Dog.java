package ru.mirea.lab1;

public class Dog {
    private final String name;
    private final int age;
    
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return this.name + ' ' + this.age;
    }
}
