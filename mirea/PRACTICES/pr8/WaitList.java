package ru.mirea.practices.pr8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedDeque;

public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedDeque<E> content;

    public WaitList(Collection<E> coll) {
        content = new ConcurrentLinkedDeque<>();
        content.addAll(coll);
    }

    public WaitList() {
        content = new ConcurrentLinkedDeque<>();
    }

    @Override
    public void add(E e) {
        content.add(e);
    }

    @Override
    public E remove() {
        return content.remove();
    }

    @Override
    public boolean contains(E e) {
        return content.contains(e);
    }

    @Override
    public boolean containsAll(Collection<E> e) {
        return content.containsAll(e);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}
