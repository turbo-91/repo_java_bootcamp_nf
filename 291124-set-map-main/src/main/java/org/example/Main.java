package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // CODE SESSION

        ShoppingItem apple = new ShoppingItem("Apfel", 2, 123);
        ShoppingItem bread = new ShoppingItem("Brot", 4, 456);
        ShoppingItem milk = new ShoppingItem("Milch", 7, 789);
        ShoppingItem milk2 = new ShoppingItem("Milch", 7, 789);

        Set<ShoppingItem> shoppingList = new HashSet<>();

        shoppingList.add(apple);
        shoppingList.add(bread);
        shoppingList.add(milk);
        shoppingList.add(milk2);

        for(ShoppingItem shoppingItem : shoppingList) {
            System.out.println("Ich will noch einkaufen: " + shoppingItem);
        }

        System.out.println(shoppingList.contains("cat food"));

        Map<ShoppingItem, String>detailedShoppingList = new HashMap<>();

        detailedShoppingList.put(apple, "Pink Lady");
        detailedShoppingList.put(bread, "Schwarzbrot");
        detailedShoppingList.put(milk, "1.5 fettarme Milch");

        String appleToBuy = detailedShoppingList.get(apple);
        System.out.println(appleToBuy);

        for(ShoppingItem shoppingItem : shoppingList) {
            System.out.println("Ich will noch einkaufen: " + detailedShoppingList.get(shoppingItem));
        }

        System.out.println(detailedShoppingList.get(apple));

        // CHALLENGES
    }
}


// RESEARCH

// Give an example of a situation where using a Set would be more appropriate than using an ArrayList. Explain your decision.
//
// A Set is more appropriate when you need to store a collection of unique values, such as ensuring no duplicate usernames in a user registration system.
// Using an ArrayList would require manually checking for duplicates before adding each element, which is inefficient. A Set automatically prevents duplicates,
// simplifying the code and improving performance. For example, adding usernames to a HashSet ensures each is stored only once without additional logic.


// Give an example of a situation where using a Map would be more appropriate than using an ArrayList or a Set. Explain your decision.
//
// A Map is more appropriate when you need to associate keys with values, such as storing user IDs (keys) and their corresponding names (values). Neither ArrayList
// nor Set provides a way to directly associate pairs of data, making retrieval or modification inefficient. A Map allows you to quickly look up a value based on
// its key, such as retrieving a user’s name by their ID. For example, using a HashMap<Integer, String> can map user IDs to names, ensuring fast lookups.


// Name another class in the Java Collections Framework, besides ArrayList, HashSet, and HashMap. 
//
// Another class in the Java Collections Framework is the LinkedList. It is a doubly-linked list implementation that allows efficient insertion and deletion
// of elements at both ends, making it suitable for use cases like implementing queues or stacks.