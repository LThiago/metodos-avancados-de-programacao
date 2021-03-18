package FactoryMethod;

import FactoryMethod.models.Car;
import FactoryMethod.models.CarFactory;
import FactoryMethod.factories.*;

public class App {
    public static void main(String[] args) {
        CarFactory factory = new ChevroletFactory();
        Car car = factory.createCar();
        car.showInfo();
        System.out.println();
        
        factory = new FiatFactory();
        car = factory.createCar();
        car.showInfo();
        System.out.println();

        factory = new FordFactory();
        car = factory.createCar();
        car.showInfo();
        System.out.println();

        factory = new VolkswagenFactory();
        car = factory.createCar();
        car.showInfo();
        System.out.println();
    }
}
