package FactoryMethod.factories;

import FactoryMethod.models.CarFactory;
import FactoryMethod.models.Car;
import FactoryMethod.cars.Fiesta;

public class FordFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Fiesta();
	}
}