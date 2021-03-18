package FactoryMethod.factories;

import FactoryMethod.models.CarFactory;
import FactoryMethod.models.Car;
import FactoryMethod.cars.Gol;

public class VolkswagenFactory implements CarFactory {
    
    @Override
	public Car createCar() {
		return new Gol();
	}
}