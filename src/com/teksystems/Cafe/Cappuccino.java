package com.teksystems.Cafe;

public class Cappuccino extends Product {

    boolean peppermint = false;
    boolean whippedCream = false;

    public Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream) {
        super(name, price, description);
        this.peppermint = peppermint;
        this.whippedCream = whippedCream;
    }

    public Cappuccino() {
        super("Cappuccino", 4.95, "Creamy and delicious");
        this.peppermint = false;
        this.whippedCream = false;
    }

    @Override
    public double calculateProductTotal() {
        double addPeppermint = (this.peppermint ? 2.00 : 0);
        double addWhippedCream = (this.whippedCream ? 1.00 : 0);
        double subTotal = this.getPrice()*this.getQuantity() + addPeppermint + addWhippedCream;

        return subTotal;
    }
}
