package com.teksystems.Cafe;

import java.util.Scanner;

public class CafeApp {

    public static void CafeApp(){

        Product coffee = new Product("coffee", 3.45, "Our finest roast");
        Product espresso = new Product("espresso", 4.89, "Bold and energizing");
        Product cappuccino = new Product("cappuccino", 4.89, "Creamy and delicious");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter quantity of coffees: ");
        Integer userQuantity = scanner.nextInt();
        double coffeeSubTotal = coffee.calculateProductTotal(userQuantity);
        System.out.println(coffee.getName() + " " + coffee.getDescription() + " " + coffeeSubTotal + " ");

    }

}
