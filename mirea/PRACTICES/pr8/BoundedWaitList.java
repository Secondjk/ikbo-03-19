package ru.mirea.practices.pr8;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    public BoundedWaitList(int c) {
        capacity = c;
    }

    @Override
    public void add(E e) {
        super.add(e);
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }
}
