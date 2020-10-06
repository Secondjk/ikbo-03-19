package ru.mirea.practices.pr6;

public class IdNumber {
    private Student[] students;
    private int idsCount = 0;

    public IdNumber(int size) {
        students = new Student[size];
    }

    public void sortByScore() {
        for (int left = 0; left < students.length; left++) {
            Student value = students[left];
            int i = left - 1;

            while (i >= 0) {
                if (value.getScore() < students[i].getScore()) {
                    students[i + 1] = students[i];
                } else {
                    break;
                }

                i -= 1;
            }

            students[i + 1] = value;
        }
    }

    public void addStudent(Student student) {
        students[idsCount++] = student;
    }

    public Student getStudent(int index) {
        return students[index];
    }

    @Override
    public String toString() {
        String result = students[0].toString();
        for (int i = 0; i < idsCount; ++i) {
            result = result + ' ' + students[i];
        }
        return result;
    }
}
