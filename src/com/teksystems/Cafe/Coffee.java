package com.teksystems.Cafe;

public class Coffee extends Product {

    boolean sugar = false;
    boolean milk = false;

    public Coffee(String name, double price, String description, boolean sugar, boolean milk) {
        super(name, price, description);
        this.sugar = sugar;
        this.milk= milk;
    }

    public Coffee() {
        super("Coffee", 2.95, "Freshly brewed");
        this.sugar = false;
        this.milk= false;
    }


    @Override
    public double calculateProductTotal(Integer userQuantity) {
        double subTotal = getPrice()*userQuantity;

        return subTotal;
    }
}
