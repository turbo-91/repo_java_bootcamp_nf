package de.neuefische;

import java.util.Objects;

public class Car {
	private String brand;
	private static int carCounter = 0;

	public Car(String brand) {
		this.brand = brand;
		carCounter++;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public static int getCarCounter() {
		return carCounter;
	}

	public static int calculateSum(int a, int b){
		return a + b;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Car car = (Car) o;
		return Objects.equals(brand, car.brand);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(brand);
	}

	@Override
	public String toString() {
		return "Car{" +
				"brand='" + brand + '\'' +
				'}';
	}
}
