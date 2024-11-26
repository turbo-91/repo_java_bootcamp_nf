package de.neuefische.car;

public class Main {
	public static void main(String[] args) {
		Car bmw = new Car("BMW", "M3", 431, 1);
		Car bmw2 = new Car("BMW", "M3", 431, 1);
		System.out.println(bmw.equals(bmw2));
		System.out.println(bmw == bmw2);
		System.out.println(bmw.getId());
		System.out.println(bmw.getBrand());
		bmw.setHorsePower(10);
		bmw.setBrand("VW");
		System.out.println(bmw.getBrand());
		System.out.println(bmw);
	}
}
