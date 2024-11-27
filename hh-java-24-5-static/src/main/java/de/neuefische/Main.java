package de.neuefische;

public class Main {
	public static void main(String[] args) {
		Car car1 = new Car("bmw");
		Car car2 = new Car("vw");
		Car car3 = new Car("ford");
		Car car4 = new Car("skoda");

		System.out.println(Car.getCarCounter());
		System.out.println(Utility.PI);
		System.out.println(Car.calculateSum(10, 10));
	}
}
