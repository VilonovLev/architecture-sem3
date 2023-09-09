package ru.geekbrains.lesson3.hw3;

import java.awt.*;

public class Harvester extends Car implements Fueling, Wiping {

    public Harvester(String make, String model, Color color) {
        super(make, model, FuelType.Diesel , color);
        setWheelsCount(6);
    }

    @Override
    public FuelType fuel() {
        return fuelType;
    }

    /**
     * Заправить автомобиль
     */
//    @Override
//    public void fuel() {
//        if (refueling != null){
//            refueling.fuel(fuelType);
//        }
//    }



    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    public void sweeping() {
        System.out.println("Автомобиль метет улицу.");
    }



    @Override
    public void wipMirrors() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }


}
