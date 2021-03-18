package FactoryMethod.cars;

import FactoryMethod.models.Car;

public class Celta implements Car {
    @Override
    public void showInfo() {
        System.out.println("Model: Celta\nManufacturer: Chevrolet");
    }
}
