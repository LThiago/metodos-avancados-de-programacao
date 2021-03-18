package FactoryMethod.cars;

import FactoryMethod.models.Car;

public class Fiesta implements Car {
    @Override
    public void showInfo() {
        System.out.println("Model: Fiesta\nManufacturer: Ford");
    }
}
