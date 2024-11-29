package org.example;

public class ShoppingItem {
    private String name;
    private int price;

    public ShoppingItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ShoppingItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
