package ru.mirea.practices.pr12.task1;

public class Student {
    private final String firstname;
    private final String surname;
    private final String patronymiс;

    public Student(String firstname, String surname, String patronymiс) {
        this.firstname = firstname;
        this.surname = surname;
        this.patronymiс = patronymiс;
    }

    @Override
    public String toString() {
        return surname + ' ' + firstname + ' ' + patronymiс;
    }
}
