package ru.mirea.lab2;

public class Hand {
    private final int length;

    public Hand(int length) {
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
