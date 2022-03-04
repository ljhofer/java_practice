package com.teksystems.Cafe;

import java.util.Scanner;

public class CafeApp {

    public static void CafeApp(){
        Coffee coffee = new Coffee();
        Espresso espresso = new Espresso();
        Cappuccino cappuccino = new Cappuccino();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter quantity of coffees: ");
        Integer coffeeQuantity = scanner.nextInt();
        coffee.setQuantity(coffeeQuantity);
        double coffeeSubTotal = coffee.calculateProductTotal();
        System.out.println(coffee.getName() + " " + coffee.getDescription() + " " + coffeeSubTotal + " ");

        System.out.println("Enter quantity of espressos: ");
        Integer espressoQuantity = scanner.nextInt();
        espresso.setQuantity(espressoQuantity);
        double espressoSubTotal = espresso.calculateProductTotal();
        System.out.println(espresso.getName() + " " + espresso.getDescription() + " " + espressoSubTotal + " ");

        System.out.println("Enter quantity of cappuccinos: ");
        Integer cappuccinoQuantity = scanner.nextInt();
        espresso.setQuantity(cappuccinoQuantity);
        double cappuccinoSubTotal = cappuccino.calculateProductTotal();
        System.out.println(cappuccino.getName() + " " + cappuccino.getDescription() + " " + cappuccinoSubTotal + " ");

        double salesTax = 0.685;
        double orderSubTotal = coffeeSubTotal + espressoSubTotal + cappuccinoSubTotal;
        double salesTotal = (coffeeSubTotal + espressoSubTotal + cappuccinoSubTotal) * (1+salesTax);

        System.out.printf("Total: %.2f ", salesTotal);
    }

}
