package ru.mirea.labs.lab7;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>(10);

        if (ListTests(list1)) {
            System.out.println("test for list1 has failed");
            return;
        }

        if (ListTests(list2)) {
            System.out.println("test for list2 has failed");
            return;
        }

        System.out.println("tests passed!");
    }

    public static boolean ListTests(ArrayList<Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);

        if (list.size() != 3) {
            return false;
        }

        if (list.indexOf(1) != 0) {
            return false;
        }

        if (list.lastIndexOf(3) == 2) {
            return false;
        }

        return true;
    }
}