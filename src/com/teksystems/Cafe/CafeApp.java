package com.teksystems.Cafe;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeApp {

    public static void CafeApp(){

        ArrayList<Object> shoppingCart = new ArrayList<>();
        Scanner input = new Scanner(System.in);

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
                    checkout();
                    break;
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


    private static void checkout() {



    }

}
