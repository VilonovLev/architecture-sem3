package ru.geekbrains.lesson3.hw3;



public class CarWashing implements Cleaning{
    @Override
    public void clean(Dirty dirty) {
        System.out.println("Профессиональная мойка отмыла: " + dirty.getClass().getSimpleName());
    }
}
