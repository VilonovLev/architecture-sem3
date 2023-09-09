package ru.geekbrains.lesson3.hw3;

public class RefuelingAndCleaning extends RefuelingStation implements Cleaning{
    @Override
    public void clean(Dirty dirty) {
        System.out.println("Мойка на заправке отмыла: " + dirty.getClass().getSimpleName());
    }
}
