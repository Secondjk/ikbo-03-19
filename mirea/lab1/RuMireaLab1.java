package ru.mirea.lab1;
import java.util.Random;

public class RuMireaLab1 {
    public static void main(String[] args) {
        firstAndFourth();
        secondTask(args);
        thirdTask();
        fifthTask(10);
    }
    
    private static void printForSum(int[] arr, int length) {
        int sum = 0;
        
        for (int i = 0; i < length; ++i) {
            sum += arr[i];
        }
        
        System.out.printf("\nfor sum: %d", sum);
    }
    
    private static void printWhileSum(int[] arr, int length) {
        int sum = 0, i = 0;
        
        while (i < length) {
            sum += arr[i];
            i += 1;
        }
        
        System.out.printf("\nwhile sum: %d", sum);
    }
    
    private static void printDoWhileSum(int[] arr, int length) {
        int sum = 0, i = 0;
        
        do {
            sum += arr[i];
            i += 1;
        } while (i < length);
        
        System.out.printf("\ndowhile sum: %d", sum);
    }
    
    private static void printSortedArray(int[] arr, int length) {
        int[] sortedArray = arr;
        
        for (int i = 0; i < length; ++i) {
            for (int j = 0; j < length - 1 - i; ++j) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }
        
        System.out.printf("\nsorted array: ");
        for (int i = 0; i < length; ++i) {
            System.out.printf("%d ", sortedArray[i]);
        }
    }   
            
    private static void firstAndFourth() {
        final Random random = new Random();
        
        System.out.print("arr: ");
        int arrLength = random.nextInt(40);
        int[] arr = new int[arrLength];
        
        for (int i = 0; i < arrLength; ++i) {
            arr[i] = random.nextInt(100);
            System.out.printf("%d ", arr[i]);
        }
        
        printForSum(arr, arrLength);
        printWhileSum(arr, arrLength);
        printDoWhileSum(arr, arrLength);
        printSortedArray(arr, arrLength);
    }
    
    private static void secondTask(String[] args) {
        for (String arg : args) {
            System.out.print(arg);
        }
    }
    
    
    private static void thirdTask() {
        System.out.print("\nHarmonious row: ");
        for (int i = 1; i <= 10; ++i) {
            double el = 1.0 / i;
            System.out.printf("%.3f ", el);
        }
    }
    
    private static void fifthTask(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        
        System.out.printf("\nFactorial (%d): %d", number, result);
    }
}
