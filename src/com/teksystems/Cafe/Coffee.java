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

    @Override
    public void addOptions() {
        Scanner input = new Scanner(System.in);

        // Do you want sugar?
        System.out.print("Would you like sugar your coffee?\n Yes:1\n No:2");
        // Set sugar
        int userSugar = input.nextInt();

        setSugar(userSugar == 1);

//        if (userSugar == 1) {
//            setSugar(true);
//        } else if (userSugar == 2) {
//            setSugar(false);
//        }

        // Do you want milk?
        System.out.println("Would you like milk coffee?\n Yes:1\n No:2");
        // Set milk?
        int userMilk = input.nextInt();
        setMilk(userMilk == 1);
    }

    @Override
    public void printOptions() {
//        System.out.println(this.getName() + " " + coffeeSubTotal + " ");

    }
}
