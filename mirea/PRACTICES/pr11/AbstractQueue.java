package ru.mirea.practices.pr11;

import java.util.List;

public abstract class AbstractQueue<T> implements Queue<T> {
    protected List<T> queue;

    @Override
    public T peek() {
        return queue == null ? null : queue.get(0);
    }

    public boolean addElement(T element) throws Exception {
        if (add(element)) {
            return true;
        }

        throw new Exception();
    }

    public int length() {
        return queue.size();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
