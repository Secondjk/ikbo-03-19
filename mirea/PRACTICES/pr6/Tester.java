package ru.mirea.practices.pr6;

import java.util.Arrays;
import java.util.Random;

public class Tester {
    private IdNumber IDNumbers;

    public static Student generateStudent() {
        return new Student(new Random().nextInt(100));
    }

    public static Student[] mergeSort(Student[] a1, Student[] a2) {
        Student[] a3 = new Student[a1.length + a2.length];

        int i = 0, j = 0;
        for (int k = 0; k < a3.length; k++) {
            if (i > a1.length - 1) {
                Student a = a2[j];
                a3[k] = a;
                j++;
            } else if (j > a2.length - 1) {
                Student a = a1[i];
                a3[k] = a;
                i++;
            } else if (a1[i].getScore() > a2[j].getScore()) {
                Student a = a1[i];
                a3[k] = a;
                i++;
            } else {
                Student b = a2[j];
                a3[k] = b;
                j++;
            }
        }

        return a3;
    }

    public static void main(String[] args) {
        System.out.println("1 test");
        IdNumber students1 = new IdNumber(20);
        for (int i = 0; i < 20; ++i) {
            Student student = generateStudent();
            students1.addStudent(student);
        }
        System.out.println(students1);
        students1.sortByScore();
        System.out.println(students1);

        System.out.println("2 test");
        Student[] students2 = new Student[20];
        for (int i = 0; i < 20; ++i) {
            students2[i] = generateStudent();
        }
        System.out.println(Arrays.toString(students2));
        Arrays.sort(students2, new SortingStudentsByGPA());
        System.out.println(Arrays.toString(students2));

        System.out.println("3 test");
        Student[] students3 = new Student[10];
        Student[] students4 = new Student[10];
        for (int i = 0; i < 10; ++i) {
            students3[i] = generateStudent();
            students4[i] = generateStudent();
        }
        System.out.println(Arrays.toString(students3));
        System.out.println(Arrays.toString(students4));
        System.out.println(Arrays.toString(mergeSort(students3, students4)));
    }

}
