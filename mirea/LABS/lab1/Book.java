package ru.mirea.lab1;

public class Book {
    private final String name;
    
    public Book(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
