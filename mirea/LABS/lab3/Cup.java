package ru.mirea.lab3;

public class Cup extends Dish {
    public Cup(String material, double volume) {
        super(material, volume);
    }

    @Override
    public void destroy() {
        this.state = "destroyed";
    }

    @Override
    public void use() {
        this.state = "filled with water";
    }

    public void makeDirt() {
        System.out.println("Cup is now dirty!");
        this.state = "dirty";
    }
}
