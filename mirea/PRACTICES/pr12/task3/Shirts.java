package ru.mirea.practices.pr12.task3;

import java.util.ArrayList;

public class Shirts {
    String[] shirts = new String[11];
    public Shirts() {
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (String shirt : shirts) {
            stringBuilder.append(shirt + ' ');
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Shirts shirts = new Shirts();
        System.out.println(shirts.toString());
    }
}
