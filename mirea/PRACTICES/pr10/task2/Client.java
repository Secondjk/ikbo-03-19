package ru.mirea.practices.pr10.task2;

public class Client {
    public Chair chair;
    public void sit() {
        chair.done();
    }
    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
