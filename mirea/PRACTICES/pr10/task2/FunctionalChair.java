package ru.mirea.practices.pr10.task2;

public class FunctionalChair implements Chair {
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void done() {
        System.out.println("done");
    }
}
