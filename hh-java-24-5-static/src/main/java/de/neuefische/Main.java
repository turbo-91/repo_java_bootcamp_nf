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

// RESEARCH

//Can you call an instance method in a static method and vice versa? Why / why not?
// No, you cannot directly call an instance method from a static method. To call an instance method from a static method,
// you must first create an object of the class and use that object to call the instance method.


// If you have the choice, is it better to make the method static or non-static? Why?
// The choice between making a method static or non-static depends on its purpose: If a method doesn’t rely on instance-specific data
// or behavior, make it static, as it belongs to the class and is ideal for utility functions.
// Use non-static methods when the behavior depends on an instance’s fields or methods, allowing object-specific functionality.
// Static methods are globally accessible and slightly faster, while non-static methods are tied to an object’s state
// and enable dynamic behavior through inheritance.