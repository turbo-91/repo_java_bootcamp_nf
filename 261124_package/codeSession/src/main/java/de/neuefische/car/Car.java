package de.neuefische.car;

import java.util.Objects;

// public <- Alles kann drauf zugreifen
// private <- Nur die Klasse kann selber drauf zugreifen
// protected <- Alle Klassen aus dem selben Package können darauf zugreifen

// Wenn kein Sichtbarkeitsmodifikator vor einer Methode oder Klasse -> dann immer protected
class Car {
	private final int id;
	private String brand;
	private String model;
	private int horsePower;

	public Car(String brand, String model, int horsePower, int id) {
		this.brand = brand;
		this.model = model;
		this.horsePower = horsePower;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getBrand(){
		return brand;
	}
	/*protected String getGetBrand(){
		return getBrand();
	}*/
	public void setBrand(String brand){
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		if(horsePower > 0){
			this.horsePower = horsePower;
		} else {
			throw new IllegalArgumentException("horsepower must be greater than 0");
		}
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Car car = (Car) o;
		return id == car.id && horsePower == car.horsePower && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, brand, model, horsePower);
	}

	@Override
	public String toString() {
		return "Car{" +
				"id=" + id +
				", brand='" + brand + '\'' +
				", model='" + model + '\'' +
				", horsePower=" + horsePower +
				'}';
	}
}
