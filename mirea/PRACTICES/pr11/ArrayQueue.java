package ru.mirea.practices.pr11;

import java.util.ArrayList;

public class ArrayQueue<T> extends AbstractQueue<T> {
    private final ArrayList<T> queue;

    public ArrayQueue() {
        this.queue = new ArrayList<T>();
    }

    @Override
    public T pop() throws Exception {
        T element = queue.get(0);
        queue.remove(0);
        return element;
    }

    @Override
    public boolean add(T element) {
        return queue.add(element);
    }
}
