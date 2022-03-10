package com.teksystems.Cafe;

import java.util.Scanner;

public class Coffee extends Product {

    boolean sugar = false;
    boolean milk = false;

    public Coffee(String name, double price, String description, boolean sugar, boolean milk) {
        super(name, price, description);
        this.sugar = sugar;
        this.milk = milk;
    }

    public Coffee() {
        super("Coffee", 2.95D, "Freshly brewed");
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

    @Override
    public void addOptions(Scanner input) {

        System.out.print("Would you like sugar in the coffee?\n Yes:1\n No:2\n");
        int userSugar = input.nextInt();
        setSugar(userSugar == 1);

        System.out.println("Would you like milk in the coffee?\n Yes:1\n No:2\n");
        int userMilk = input.nextInt();
        setMilk(userMilk == 1);

        System.out.printf("Item: %s    Price: %.2f   Quantity: %x   Subtotal: %.2f\n", this.getName(), this.getPrice(), this.getQuantity(), this.calculateProductTotal());
    }

    @Override
    public void printOptions() {
//        System.out.println(this.getName() + " " + coffeeSubTotal + " ");

    }
}
