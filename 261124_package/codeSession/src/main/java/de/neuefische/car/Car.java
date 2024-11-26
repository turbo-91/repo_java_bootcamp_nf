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

// CHALLENGES

// RESEARCH

// I - You are given the task to write a class 'User' for a login. Which fields should be present in the class for a user and what visibilities should be chosen for these fields?
// The User class should include fields like username (private), password (private), email (private), and role (private).
// These fields should have private visibility to enforce encapsulation. Public getter and setter methods should be provided to access or modify these fields securely.
// Additional fields like lastLoginTime or isActive can also be included based on requirements. Sensitive fields like password should be encrypted and handled carefully.

// II - Why do we create multiple packages instead of simply putting all classes in a single package?
// Multiple packages organize classes logically, making the codebase easier to maintain and understand.
// They help segregate functionalities, reduce coupling, and avoid naming conflicts. Packages also enhance modularity and reusability of the code.
// For large projects, this structure improves collaboration among teams and prevents file management issues.
// It aligns with best practices in object-oriented design.

//You work for a company called 'SuperWash' and use 'superwash.de' as the domain name for the website and email addresses.
// You are part of the IT department in the marketing area. What would be a logical Java package name?
// de.superwash.marketing.it

//How can you convert an array of objects into a string?
//For arrays of primitive types or built-in objects, Arrays.toString works directly.
//For custom objects, the toString method in the class must be overridden to provide meaningful output. Otherwise, it will return the default object hash codes (e.g., User@15db9742).

}
