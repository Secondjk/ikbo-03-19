package ru.mirea.lab2;

public class TestHuman {
    public static void main(String[] args) {
        Leg humanLeg = new Leg(10);
        Hand humanHand = new Hand(30);
        Head humanHead = new Head(123);

        Human human = new Human(humanHead, humanHand, humanLeg);
        System.out.println(human);
    }
}
