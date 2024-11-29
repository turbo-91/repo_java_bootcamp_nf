package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

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
    }
}