package ru.geekbrains.lesson3.hw3;

import java.awt.*;

public class Program {
    public static void main(String[] args) {

        Harvester harvester = new Harvester("A", "B", Color.BLACK);

        RefuelingStation refuelingStation = new RefuelingStation();


        refuelingStation.fuel(harvester);

        CarWashing carWashing = new CarWashing();

        SportCar sportCar = new SportCar("A", "B",FuelType.Gasoline, Color.BLACK);

        carWashing.clean(harvester);
        carWashing.clean(sportCar);

        RefuelingAndCleaning refuelingAndCleaning = new RefuelingAndCleaning();

        refuelingAndCleaning.fuel(harvester);
        refuelingAndCleaning.clean(harvester);
        refuelingAndCleaning.fuel(sportCar);

    }
}
