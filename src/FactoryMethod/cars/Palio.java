package FactoryMethod.cars;

import FactoryMethod.models.Car;

public class Palio implements Car {
    @Override
    public void showInfo() {
        System.out.println("Model: Palio\nManufacturer: Fiat");
    }
}
