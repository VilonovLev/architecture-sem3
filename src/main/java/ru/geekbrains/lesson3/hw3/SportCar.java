package ru.geekbrains.lesson3.hw3;

import java.awt.*;

public class SportCar extends Car {
    public SportCar(String make, String model,FuelType fuelType, Color color) {
        super(make, model,fuelType, color);
        setWheelsCount(3);
    }

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

    @Override
    public FuelType fuel() {
        return fuelType;
    }
}
