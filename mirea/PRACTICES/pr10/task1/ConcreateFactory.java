package ru.mirea.practices.pr10.task1;

public class ConcreateFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex CreateComplex(int real, int image) {
        return new Complex();
    }
}
