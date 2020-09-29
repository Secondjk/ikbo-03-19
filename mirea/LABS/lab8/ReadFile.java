package ru.mirea.labs.lab8;

import java.io.FileReader;

public class ReadFile {
    public static void readFile(String filepath) {
        try {
            FileReader reader = new FileReader(filepath);
            int c;

            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFile(args.length != 0 ? args[0] : "src/ru/mirea/labs/lab8/file1.txt");
    }
}
