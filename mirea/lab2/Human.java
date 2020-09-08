package ru.mirea.lab2;

public class Human {
    private final Head head;
    private final Hand hand;
    private final Leg leg;

    public Human(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public Head getHead() {
        return head;
    }

    @Override
    public String toString() {
        return "Head radius: " + this.getHead().getRadius() +
                "\nHand length: " + this.getHand().getLength() +
                "\nLeg length: " + this.getLeg().getLength()
        ;
    }
}
