package ru.mirea.practices.pr10.task2;

public class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("Автомат по жабе получен!");
    };

    @Override
    public void done() {
        doMagic();
    }
}
