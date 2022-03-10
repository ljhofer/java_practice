package com.teksystems.Cafe;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeApp {

    public static void CafeApp(){

        ArrayList<Product> shoppingCart = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        loop:
        while(true) {
            System.out.println("Please select from the following menu:\n1. Coffee\n2. Cappuccino\n3. Espresso\n4. Check out");
            switch(input.nextInt()) {
                case 1:
                    Coffee coffee = new Coffee();
                    coffee.setQuantity(1);
                    coffee.addOptions(input);
                    shoppingCart.add(coffee);
                    break;
                case 2:
                    Cappuccino cappuccino = new Cappuccino();
                    cappuccino.setQuantity(1);
                    cappuccino.addOptions(input);
                    shoppingCart.add(cappuccino);
                    break;
                case 3:
                    Espresso espresso = new Espresso();
                    espresso.setQuantity(1);
                    espresso.addOptions(input);
                    shoppingCart.add(espresso);
                    break;
                case 4:
                    double runningTotal = 0;
                    double salesTaxRate = 0.0685;

                    for(Product item: shoppingCart){
                        System.out.printf("Item: %s    Price: %.2f   Quantity: %x   Subtotal: %.2f\n", item.getName(), item.getPrice(), item.getQuantity(), item.calculateProductTotal());
                        runningTotal += item.calculateProductTotal();
                    };
                    double salesTax = salesTaxRate*runningTotal;
                    double grandTotal = runningTotal + salesTax;
                    System.out.printf("Subtotal: %.2f\n", runningTotal);
                    System.out.printf("Sales tax: %.2f\n", salesTax);
                    System.out.printf("Total: %.2f\n", grandTotal);

                    break loop;
                default:
                    System.out.println("Please choose a number between 1 and 4.");

            }
        }

//
//        double salesTax = 0.685;
//        double orderSubTotal = coffeeSubTotal + espressoSubTotal + cappuccinoSubTotal;
//        double salesTotal = (coffeeSubTotal + espressoSubTotal + cappuccinoSubTotal) * (1+salesTax);
//
//        System.out.printf("Total: %.2f ", salesTotal);
    }


  

}
