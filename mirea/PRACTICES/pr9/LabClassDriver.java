package ru.mirea.practices.pr9;

public class LabClassDriver {
    public static void main(String[] args) {
        LabClass lClass = new LabClass();

        lClass.add(new Student("Алексей", 80));
        lClass.add(new Student("Андрей", 79));
        lClass.add(new Student("Валерий", 60));
        lClass.add(new Student("Роберт", 91));
        lClass.add(new Student("Константин", 101));

        LabClassUI ui = new LabClassUI(lClass);
    }
}
