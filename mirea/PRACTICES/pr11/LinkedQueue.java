package ru.mirea.practices.pr11;

import java.util.LinkedList;

public class LinkedQueue<T> extends AbstractQueue<T> {
    private final LinkedList<T> queue;

    public LinkedQueue(LinkedList<T> queue) {
        this.queue = new LinkedList<>();
    }

    @Override
    public T pop() {
        T tmp = queue.get(0);
        queue.remove(0);
        return tmp;
    }

    @Override
    public boolean add(T element) {
        return queue.add(element);
    }

    @Override
    public int length() {
        return queue.size();
    }
}
