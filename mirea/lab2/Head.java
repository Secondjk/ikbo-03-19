package ru.mirea.lab2;

public class Head {
    private final int radius;

    public Head(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }
    @Override
    public String toString() {
        return "Radius: " + this.radius;
    }

}
