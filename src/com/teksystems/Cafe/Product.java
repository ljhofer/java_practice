package com.teksystems.Cafe;

public abstract class Product {

    // fields
    private String name;
    private double price;
    private static String description;
    private int quantity;

    // constructors
    public Product() {
//
    };

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;

    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    // methods
    public abstract double calculateProductTotal();

    public abstract void addOptions();

    public abstract void printOptions();
//
}
