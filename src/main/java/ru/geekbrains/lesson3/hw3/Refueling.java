package ru.geekbrains.lesson3.hw3;

/**
 * Заправочная станция
 */
interface Refueling {

    /**
     * Заправка
     */
    default void fuel(Fueling fueling){
        String name = fueling.getClass().getSimpleName();
        switch (fueling.fuel()){
            case Diesel -> System.out.println("Заправка дизельным топливом: " + name);
            case Gasoline -> System.out.println("Заправка бензином: " + name);
        }
    }

}
