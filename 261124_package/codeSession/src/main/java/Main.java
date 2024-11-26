import de.neuefische.Library.Book;
import de.neuefische.Library.Library;
import de.neuefische.car.Car;

public class Main {
	public static void main(String[] args) {

		// CODE SESSION

//		Car bmw = new Car("BMW", "M3", 431, 1);
//		Car bmw2 = new Car("BMW", "M3", 431, 1);
//		System.out.println(bmw.equals(bmw2));
//		System.out.println(bmw == bmw2);
//		System.out.println(bmw.getId());
//		System.out.println(bmw.getBrand());
//		bmw.setHorsePower(10);
//		bmw.setBrand("VW");
//		System.out.println(bmw.getBrand());
//		System.out.println(bmw);

		// CHALLENGES
		// 1st coding challenge

		Book circe = new Book("Circe", "Madeline Miller", "978-0-316-42388-5");
		Book adulthoodRites = new Book("Adulthood Rites", "Octavia E. Butler", "978-0-316-42388-5");
		Book theFifthSeason = new Book("The Fifth Season", "MN. K. Jemisin", "978-0-356-50819-1");

		Book[] torbensBooks = {circe, adulthoodRites, theFifthSeason};
		Library torbensFaves = new Library(torbensBooks);
//		System.out.println("approach 1" + torbensFaves);
//
//		System.out.println("approach 2: ");
//		for (Book book: torbensFaves.getBooks()){
//			System.out.println(book.getAuthor());
//			System.out.println(book.getTitle());
//			System.out.println(book.getIsbn());
//		}

		// bonus coding challenge

		Book[] initialBooks = {circe, adulthoodRites};
		Library library = new Library(initialBooks);

		System.out.println("Initial Library:");
		System.out.println(library);

		// Add a new book
		library.addBook(theFifthSeason);

		System.out.println("After Adding a Book:");
		System.out.println(library);

		// Try adding a duplicate book
		library.addBook(circe);

		// Remove a book
		library.deleteBook(adulthoodRites);

		System.out.println("After Removing a Book:");
		System.out.println(library);

		// Try removing a book that doesn't exist
		library.deleteBook(adulthoodRites);


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


