package FactoryMethod.factories;

import FactoryMethod.models.CarFactory;
import FactoryMethod.models.Car;
import FactoryMethod.cars.Palio;

public class FiatFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Palio();
	}
}