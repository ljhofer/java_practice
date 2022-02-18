package com.teksystems;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double radius = 0;
        double area = 0;

        Scanner input = new Scanner(System.in);
            System.out.println("enter a radius: ");
        radius = input.nextDouble();

        // Assign a radius
        radius = 20;

        // Compute area
        area = radius * radius * 3.14159;

        System.out.println("The area for the circle of radius " + radius + " is " + area);

    }
}
