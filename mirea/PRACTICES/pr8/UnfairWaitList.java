package ru.mirea.practices.pr8;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {}

    public void remove(E e) {
        content.remove(e);
    }

    public void moveToBack() {
        E c = content.poll();
        content.add(c);
    }
}
