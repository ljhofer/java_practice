package com.teksystems;

import java.lang.reflect.Array;
import java.util.Arrays;

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

    public static void exerciseFive () {
        for (int i = 1; i<=100; i++) {
            if (i>50) {
                break;
            } else if (i % 5 == 0) {
                System.out.println(i);
            }
        } //for loop

    } // exerciseFive

    public static void exerciseSix () {

        for (int i = 1; i < 3; i++) {
            System.out.println("Week " + i + ":");
            for(int y = 1; y<6; y++) {
                System.out.println("Day " + y);
            } //inner loop
        } // outer loop

    } // exerciseSix

    public static void exerciseSeven () {
//
//        int num = 1;
//        int reversedNum=0;
//        int remainder;
//
//        int originalNum = num;
//
//        while (num <= 200) {
//            remainder = num % 10;
//            reversedNum = reversedNum * 10 + remainder;
//            num /= 10;
//        } // while loop
//
//        if (originalNum == reversedNum) {
//            System.out.println(originalNum);
//        }

        for(int i = 10; i < 200; i++){
            String s = String.valueOf(i);
            int l = s.length();
            char first = s.charAt(0);
            char last = s.charAt(l-1);
            if(first == last){
                System.out.println(i);
            }
        } // for loop

    } // exerciseSeven


    public static void exerciseEight () {
        int num1 = 0, num2 = 1;
        int N = 10;
        int counter = 0;

        while (counter < N) {

            System.out.println(num1 + " ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter++;
        }
    } // exerciseEight

    public static void exerciseNine () {


    } // exerciseNine


} // LoopExercise class
