package com.hillel.java.database;

/**
 * Created by ITyan on 29.06.2015.
 */
public class Product {
    private String name;
    private String category;
    private Integer price;
    private byte[] image;

    public Product(String name, String category, Integer price, byte[] image) {
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

    public Integer getPrice() {
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
