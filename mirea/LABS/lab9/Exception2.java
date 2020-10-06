package ru.mirea.labs.lab9;

import java.util.Scanner;

public class Exception2 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = Integer.parseInt(myScanner.next());
        try {
            System.out.println( 2 / number );
        } catch (Exception ex){
            System.out.println(ex);
        } finally {
            System.out.println("Work done");
        }

    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
