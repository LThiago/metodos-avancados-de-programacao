package FactoryMethod.cars;

import FactoryMethod.models.Car;

public class Gol implements Car {
    @Override
    public void showInfo() {
        System.out.println("Model: Gol\nManufacturer: Volkswagen");
    }
}
