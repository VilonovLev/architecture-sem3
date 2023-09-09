package ru.geekbrains.lesson3.hw3;

/**
 * Мойка
 */
public interface Cleaning {

    /**
     * Метод очистки принимает объект имплементирующий
     * маркеркерный интерфейс Dirty.
     * @param dirty
     */
    void clean(Dirty dirty);
}
