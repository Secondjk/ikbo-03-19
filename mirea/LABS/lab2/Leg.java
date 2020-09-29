package ru.mirea.lab2;

public class Leg {
    private final int length;

    public Leg(int length) {
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }
    @Override
    public String toString() {
        return "Radius: " + this.length;
    }
}
