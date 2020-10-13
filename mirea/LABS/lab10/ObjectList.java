package ru.mirea.labs.lab10;

import java.util.Arrays;

public class ObjectList<T> {
    private final int size = 10;
    private Object[] coll = new Object[size];
    private int currentSize = 0;

    public void add(T item) {
        if (currentSize >= coll.length - 1) {
            scale(currentSize + 1);
        }

        coll[currentSize++] = item;
    }

    public void remove(int i) {
        int newSize = currentSize - i;

        if (newSize >= 0) {
            System.arraycopy(coll, i + 1, coll, i, newSize);
        }

        coll[currentSize--] = null;
    }

    public T get(int i) {
        return (T)coll[i];
    }

    public void print() {
        System.out.println(toString());
    }

    private void scale(int newCollSize) {
        Object[] newColl = new Object[newCollSize];
        System.arraycopy(coll, 0, newColl, 0, currentSize);
        coll = newColl;
    }

    @Override
    public String toString() {
        return "List{" + Arrays.toString(coll) + "}";
    }
}
