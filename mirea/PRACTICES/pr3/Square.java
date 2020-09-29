package ru.mirea.practices.pr3;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, 0);
    }

    public Square(double side, String color, boolean filled) {
        super(side, 0, color, filled);
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        this.width = side;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.height = length;
    }

    @Override
    public String toString() {
        return "Shape: square, side: "+ this.getSide() +", length: " + this.height +
                ", color: " + this.getColor()
        ;
    }
}
