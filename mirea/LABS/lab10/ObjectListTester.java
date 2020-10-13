package ru.mirea.labs.lab10;

public class ObjectListTester {
    public static void main(String[] args) {
        ObjectList<String> list1 = new ObjectList<>();
        ObjectList<Integer> list2 = new ObjectList<>();

        list1.add("1");
        list1.add("string");
        list1.add("this string will be removed");
        list1.print();
        list1.remove(2);
        list1.print();
        System.out.println("Type of list1: " + list1.get(1));

        list2.add(1);
        list2.add(3);
        list2.add(42);
        list2.print();
        list2.remove(42);
        list2.print();
        System.out.println("list2[0] = " + list2.get(0));
    }
}
