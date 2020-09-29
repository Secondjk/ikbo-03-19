package ru.mirea.labs.lab4;

public class Tester {
    public static void main(String[] args) {
        Person person = new Person("Alexey");
        Planet planet = new Planet("Pluton");

        System.out.println(person.toString());
        System.out.println(planet.toString());
    }
}
