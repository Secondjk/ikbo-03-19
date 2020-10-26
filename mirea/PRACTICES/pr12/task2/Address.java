package ru.mirea.practices.pr12.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Address {
    private final List<String> result = new ArrayList<>();

    public Address(String address) {
        StringTokenizer split = new StringTokenizer(address, ",.;");

        while (split.hasMoreElements()) {
            result.add(split.nextToken());
        }
    }

    public void printAddress() {
        System.out.println("Результат: ");
        result.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Address address = new Address("Россия, Москва, Красная, мкр Зеленый, дом 11. корпус 2. кв 01");
        address.printAddress();
    }
}
