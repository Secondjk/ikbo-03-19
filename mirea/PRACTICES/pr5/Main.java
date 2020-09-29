package ru.mirea.practices.pr5;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        switch(new Scanner(System.in).nextInt()) {
            case 1: {
                System.out.print("Палиндром. Введите строку для проверки: ");
                String input = (new Scanner(System.in)).nextLine();
                System.out.println(isPalindrome(input) ? "YES" : "NO");
                break;
            }
            case 2: {
                System.out.print("Без двух нулей. Введите a и b: ");
                Scanner input = new Scanner(System.in);
                int aNumber = input.nextInt();
                int bNumber = input.nextInt();
                System.out.println(withoutZeros(aNumber, bNumber));
                break;
            }
            case 3: {
                System.out.print("Разворот числа. Введите число: ");
                int input = (new Scanner(System.in)).nextInt();
                System.out.println(reverse(input, 0));
                break;
            }
        }
    }

    private static boolean isPalindrome(String line) {
        int lineLength = line.length();

        if (lineLength == 0) {
            return true;
        }

        if (line.charAt(0) != line.charAt(lineLength - 1)) {
            return false;
        }

        return isPalindrome(line.substring(1, lineLength - 1));
    }

    private static int withoutZeros(int aNumber, int bNumber) {
        if (aNumber == 0) {
            return 1;
        }

        if (aNumber == 1) {
            return bNumber + 1;
        }

        if (aNumber > 1 && bNumber == 0) {
            return 0;
        }

        return withoutZeros(aNumber - 1, bNumber - 1) +
                withoutZeros(aNumber, bNumber - 1);
    }

    public static int reverse(int num, int temp) {
        return num == 0 ? temp : reverse(num / 10, temp * 10 + num % 10);
    }
}
