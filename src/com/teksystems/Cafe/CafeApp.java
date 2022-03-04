package com.teksystems.Cafe;

import java.util.Scanner;

public class CafeApp {

    public static void CafeApp(){

//        Product coffee = new Product("coffee", 3.45, "Our finest roast");
//        Product espresso = new Product("espresso", 4.89, "Bold and energizing");
//        Product cappuccino = new Product("cappuccino", 4.89, "Creamy and delicious");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter quantity of coffees: ");
        Integer userQuantity = scanner.nextInt();
//        double coffeeSubTotal = coffee.calculateProductTotal(userQuantity);
//        System.out.println(coffee.getName() + " " + coffee.getDescription() + " " + coffeeSubTotal + " ");

        System.out.println("Enter quantity of espressos: ");
        userQuantity = scanner.nextInt();
//        double espressoSubTotal = espresso.calculateProductTotal(userQuantity);
//        System.out.println(espresso.getName() + " " + espresso.getDescription() + " " + espressoSubTotal + " ");

        System.out.println("Enter quantity of cappuccinos: ");
        userQuantity = scanner.nextInt();
//        double cappuccinoSubTotal = cappuccino.calculateProductTotal(userQuantity);
//        System.out.println(cappuccino.getName() + " " + cappuccino.getDescription() + " " + cappuccinoSubTotal + " ");

        double salesTax = 0.685;
//        double orderSubTotal = coffeeSubTotal + espressoSubTotal + cappuccinoSubTotal;
//        double salesTotal = (coffeeSubTotal + espressoSubTotal + cappuccinoSubTotal) * (1+salesTax);

//        System.out.printf("Total: %.2f ", salesTotal);
    }

}
