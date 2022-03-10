package com.teksystems.Cafe;

import java.util.Scanner;

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

    public boolean isPeppermint() {
        return peppermint;
    }

    public void setPeppermint(boolean peppermint) {
        this.peppermint = peppermint;
    }

    public boolean isWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(boolean whippedCream) {
        this.whippedCream = whippedCream;
    }

    @Override
    public void addOptions(Scanner input) {
        System.out.print("Would you like peppermint your cappuccino?\n Yes:1\n No:2\n");
        int userPeppermint = input.nextInt();
        setPeppermint(userPeppermint == 1);

        System.out.println("Would you like whipped cream?\n Yes:1\n No:2\n");
        int userWhip = input.nextInt();
        setWhippedCream(userWhip == 1);

        System.out.printf("Item: %s    Price: %.2f   Quantity: %x   Subtotal: %.2f\n", this.getName(), this.getPrice(), this.getQuantity(), this.calculateProductTotal());
    }

    @Override
    public void printOptions() {

    }

    @Override
    public double calculateProductTotal() {
        double addPeppermint = (this.peppermint ? 1.00 : 0);
        double addWhippedCream = (this.whippedCream ? 1.00 : 0);
        double subTotal = this.getPrice()*this.getQuantity() + addPeppermint + addWhippedCream;

        return subTotal;
    }
}
