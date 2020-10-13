package ru.mirea.practices.pr9;

public class Student implements Comparable<Student> {
    private final String name;
    private final int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student s) {
        return Integer.compare(getScore(), s.getScore());
    }

    @Override
    public String toString() {
        return "Student{ name: " + name + ", score: " + score + "}";
    }
}
