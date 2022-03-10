package com.teksystems.Cafe;

import java.util.Scanner;

public class Espresso extends Product {

    boolean extraShot = false;
    boolean macchiato = false;

    public Espresso(String name, double price, String description, boolean extraShot, boolean macchiato) {
        super(name, price, description);
        this.extraShot = false;
        this.macchiato= false;
    }

    public Espresso() {
        super("Espresso", 3.75, "Guaranteed to wake you up!");
        this.extraShot = false;
        this.macchiato = false;
    }

    public boolean isExtraShot() {
        return extraShot;
    }

    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }

    public boolean isMacchiato() {
        return macchiato;
    }

    public void setMacchiato(boolean macchiato) {
        this.macchiato = macchiato;
    }

    @Override
    public double calculateProductTotal() {
        double addShot = (this.extraShot ? 2.00 : 0);
        double addMacchiato = (this.macchiato ? 1.00 : 0);
        double subTotal = this.getPrice()*this.getQuantity() + addShot + addMacchiato;

        return subTotal;
    }

    @Override
    public void addOptions(Scanner input) {
        System.out.print("Would you like an extra shot?\n Yes:1\n No:2\n");
        int userExtraShot = input.nextInt();
        setExtraShot(userExtraShot == 1);

        System.out.println("Would you like whipped cream?\n Yes:1\n No:2\n");
        int userMacchiato = input.nextInt();
        setMacchiato(userMacchiato == 1);

        System.out.printf("Item: %s    Price: %.2f   Quantity: %x   Subtotal: %.2f\n", this.getName(), this.getPrice(), this.getQuantity(), this.calculateProductTotal());
    }

    @Override
    public void printOptions() {

    }


}
