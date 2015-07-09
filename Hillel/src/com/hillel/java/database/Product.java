package com.hillel.java.database;

/**
 * Created by ITyan on 29.06.2015.
 */
public class Product {
    private String name;
    private String category;
    private int price;
    private byte[] image;

    public Product(String name, String category, int price, byte[] image) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public byte[] getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
