package FactoryMethod.factories;

import FactoryMethod.models.CarFactory;
import FactoryMethod.models.Car;
import FactoryMethod.cars.Celta;

public class ChevroletFactory implements CarFactory {
    
    @Override
	public Car createCar() {
		return new Celta();
	}
}