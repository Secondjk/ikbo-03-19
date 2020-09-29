package ru.mirea.lab3;

public class DishTest {
    public static void main(String[] args) {
        Cup cup = new Cup("ceramics", 30);
        System.out.println(cup.getState());
        cup.use();
        System.out.println(cup.getState());
        cup.makeDirt();
        System.out.println(cup.getState());

        Spoon spoon = new Spoon("iron", 10);
        System.out.println(spoon.getState());
        spoon.destroy();
        System.out.println(spoon.getState());
    }
}
