package ru.mirea.practices.pr8;

import java.util.Collection;

public interface IWaitList<E> {
    public void add(E e);
    public E remove();
    public boolean contains(E e);
    public boolean containsAll(Collection<E> e);
    public boolean isEmpty();
}
