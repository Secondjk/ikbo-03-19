package ru.mirea.practices.pr3;

public class Rectangle extends Shape{
    protected double width;
    protected double height;

    public Rectangle() {
        super();
        width = 1;
        height = 1;
    }

    public Rectangle(double width, double height) {
        super();
        width = 1;
        height = 1;
    }

    public Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        width = 1;
        height = 1;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return width + height;
    }

    @Override
    public String toString() {
        return "Shape: circle, width: "+ this.width +", height: " + this.height +
                ", color: " + this.getColor()
        ;
    }
}