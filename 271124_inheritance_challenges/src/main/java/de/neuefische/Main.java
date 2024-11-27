package de.neuefische;

public class Main {
	public static void main(String[] args) {
		System.out.println("konichiwa");
	}
}


// RESEARCH

//Each of you should name an object from their desk (e.g. eraser, wooden pencil, ballpoint pen).
// If you wanted to store the properties of these objects in Java, what inheritance hierarchy would you use?
// (e.g. class Stationery | class Pen extends Stationery | class WoodenPen extends Pen | class BallpointPen extends Pen | class Eraser extends Stationery)

//  DeskObject (= Baseclass)
//  │
//  │
//  ├── Stationery (= Subclass extends Desk Object)
//  │   │
//  │   │
//  │   ├── Pen (= Subclass of Stationary -> extends stationary)
//  │   │   │
//  │   │   ├── BallpointPen (= Subclass of Pen -> extends Pen)
//  │   │
//  │   ├── Pencil (= Subclass of Stationary -> extends stationary)
//  │   │   │
//  │   │   └── WoodenPencil (= Subclass of Pencil -> extends Pencil)
//  │   │
//  │   └── Eraser (= Subclass of Stationary -> extends stationary)


//Many developers argue for 'Composition over Inheritance' - that is, avoiding inheritance. Give one or two arguments for this.

//Composition is often favored over inheritance because it provides greater flexibility and reusability.
//   Inheritance tightly couples child and parent classes, making changes in the parent class risky as they can propagate unexpectedly.
//   With composition, smaller, focused components can be combined to build objects, allowing easier modification and replacement without affecting unrelated parts of the system.
//   It also avoids deep inheritance hierarchies, which can be complex and prone to issues like the fragile base class or diamond problem, making systems harder to maintain.

//Why was 'inheritance' chosen specifically for deriving Java classes? Do you see parallels to inheritances in human DNA? Give one or two arguments.

//Inheritance was chosen for deriving Java classes because it naturally models "is-a" relationships, enabling shared properties and behaviors to be efficiently
//   reused while reducing code duplication. This mirrors the way humans inherit traits through DNA, where offspring derive characteristics from their parents, such as
//   eye color or height, while still being unique individuals. In programming, subclasses inherit methods and fields from parent classes, much like DNA inheritance provides
//   a genetic blueprint, allowing predictable behavior while enabling specialization. Both systems emphasize the transfer of foundational traits with the flexibility
//   to introduce mutations (overrides or new methods) to adapt to specific needs or contexts.
