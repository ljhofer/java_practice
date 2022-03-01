package com.teksystems;

public class Variables {

    public static void ExerciseOne() {
        Integer a = 3;
        Integer b = 4;
        Integer sum = a + b;

        System.out.println(sum);

    } // ExerciseOne


    public static void ExerciseTwo() {
        double a = 19.99D;
        double b = 20.25D;

        double sum = a + b;

        System.out.println(sum);

    } // ExerciseTwo


    public static void ExerciseThree() {
        int a = 3;
        double b = 4.36;

        double sum = a + b;

        System.out.println(sum);

    } // ExerciseThree


    public static void ExerciseFour() {
        int a = 5;
        double b = 10.2;

        double quotient = b/a;

        System.out.println(quotient);

    } // ExerciseFour


    public static void ExerciseFive() {
        double a = 19.99D;
        double b = 20.25D;

        double quotient = b/a;

        System.out.println(quotient);

    } // ExerciseFive


    public static void ExerciseSix() {
        int x = 5;
        int y = 6;

        double q = y/x;

        System.out.println(q);

        double y2 = (double)y;
        double q2 = y2/x;

        System.out.println(q2);

    } // ExerciseSix


    public static void ExerciseSeven() {
        final int a = 22;

        System.out.println(a + 21);

    } // ExerciseSeven


    public static void ExerciseEight() {
        double mocha = 3.99D;
        double latte = 3.79D;
        double chai = 4.09;

        double subtotal;
        double totalSale;

        subtotal = mocha*3 + latte*2 + chai*2;

        double SALES_TAX = 0.0685*subtotal;
        totalSale = subtotal + SALES_TAX;

        System.out.printf("%.2f", totalSale);


    } // ExerciseEight
}
