package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // CODE SESSION
        // SET

        String apfel = "Apfel";
        String bread = "Bread";
        String milk = "Milk";

        Set<String> shoppingList = new HashSet<String>();
        shoppingList.add(apfel);
        shoppingList.add(bread);
        shoppingList.add(milk);
        shoppingList.add(apfel);
        shoppingList.add(bread);
        shoppingList.add(milk);

        for (String shopping : shoppingList) {
            System.out.println("Muss noch kaufen: " + shopping);
        }

        System.out.println("kaufen wir apfel?" );
        System.out.println(shoppingList.contains(apfel));
        System.out.println("Kaufen wir Coke?");
        System.out.println(shoppingList.contains("coke"));

        // HASHMAP
        Map<String, String> detailedShoppingList = new HashMap<>();
        detailedShoppingList.put(apfel, "Pink Lady");
        detailedShoppingList.put(bread, "Schwarzbrot");
        detailedShoppingList.put(milk, "low-fat Milk");

        String appleToBuy = detailedShoppingList.get(apfel);
        System.out.println("Was fürn Apfel?");
        System.out.println(appleToBuy);

        for (String shoppingItem : shoppingList) {
            System.out.println("Ich will noch kaufen: " + detailedShoppingList.get(shoppingItem));
        }

        ShoppingItem apple = new ShoppingItem("Apfel", 2);
        ShoppingItem brot= new ShoppingItem("Brot", 4);
        ShoppingItem milch = new ShoppingItem("Milch", 7);

        Set<ShoppingItem> shoppingList2 = new HashSet<>();

        for (ShoppingItem shoppingItem : shoppingList2) {
            System.out.println("das ganze in grün: " + shoppingItem);
        }

    }
}