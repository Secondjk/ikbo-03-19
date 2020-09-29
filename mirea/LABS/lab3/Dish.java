package ru.mirea.lab3;

public abstract class Dish {
    protected String state;
    protected String material;
    protected double volume;

    public Dish(String material, double volume) {
        this.state = "clean";
        this.material = material;
        this.volume = volume;
    }

    public void setState(String newState) {
        this.state = newState;
    }

    public String getState() {
        return state;
    }

    public String getMaterial() {
        return material;
    }

    public double getVolume() {
        return volume;
    }

    public abstract void destroy();
    public abstract void use();
}
