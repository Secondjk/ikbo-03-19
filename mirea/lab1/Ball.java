package ru.mirea.lab1;

public class Ball {
    private final String material;
    
    public Ball(String material) {
        this.material = material;
    }
    
    @Override
    public String toString() {
        return this.material;
    }
}
