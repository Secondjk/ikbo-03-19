package ru.mirea.lab3;

public class Spoon extends Dish {
    public Spoon(String material, double volume) {
        super(material, volume);
    }

    @Override
    public void use() {
        this.state = "dirty";
    }

    @Override
    public void destroy() {
        this.state = "destroyed";
    }

    public void toggleState() {
        if (this.getState() == "clean") {
            this.state = "dirty";
        } else {
            this.state = "disappeared";
        }
    }

}
