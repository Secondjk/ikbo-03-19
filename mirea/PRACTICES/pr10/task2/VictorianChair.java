package ru.mirea.practices.pr10.task2;

public class VictorianChair implements Chair {
    private int age;

    VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void done() {
        System.out.println("Спустя " + this.getAge() + " лет, я получил автомат по жабе...");
    }
}
