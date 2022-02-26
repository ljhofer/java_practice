package com.teksystems;

public class LoopsExercise {

    public static void exerciseOne() {

        for (int i = 0; i <10; i++) {
            System.out.println(i);

        }
    } // exerciseOne

    public static void exerciseTwo () {
        int count = 0;

        while (count <= 100) {
            System.out.println(count);
            count+=10;
        }

    } // exerciseTwo


    public static void exerciseThree () {
        int count = 1;

        do {
            System.out.println(count);
            count ++;
        } while (count<=10);

    } // exerciseThree


    public static void exerciseFour () {
        for (int i = 1; i<=100; i++) {
            if (i>=25 && i<=75) {
                continue;
            } else if (i % 5 == 0) {
                System.out.println(i);
            }
        } // for loop

    } // exerciseFour

    public static void exerciseNumber () {


    } // exerciseNumber

} // LoopExercise class
