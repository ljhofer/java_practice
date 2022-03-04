package com.teksystems.Cafe;

public class Coffee extends Product {

    boolean sugar = false;
    boolean milk = false;

    public Coffee(String name, double price, String description, boolean sugar, boolean milk) {
        super(name, price, description);
        this.sugar = sugar;
        this.milk = milk;
    }

    public Coffee() {
        super("Coffee", 2.95, "Freshly brewed");
        this.sugar = false;
        this.milk= false;
    }

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    @Override
    public double calculateProductTotal() {
        double subTotal = this.getPrice()*this.getQuantity();

        return subTotal;
    }
}
