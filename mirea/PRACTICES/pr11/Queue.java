package ru.mirea.practices.pr11;

public interface Queue<T> {
    T pop() throws Exception;
    T peek();
    boolean add(T element);
}
