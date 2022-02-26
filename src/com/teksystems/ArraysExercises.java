package com.teksystems;

import java.util.Arrays;

import java.util.Collections;

public class ArraysExercises {

    public static void exerciseOne () {
        Integer [] arr = new Integer[3];

        arr[0]=1;
        arr[1]=2;
        arr[2]=3;

        System.out.println(Arrays.toString(arr));

    } // exerciseOne

    public static void exerciseTwo () {

        Integer [] arr = {13, 5, 7, 68, 2};

        int mid = arr.length / 2;

        System.out.println(arr[mid]);

    } // exerciseTwo

    public static void exerciseThree () {
        String arr [] = {"red", "green", "blue", "yellow"};
        System.out.println(arr.length);

        String [] copy = arr.clone();

        System.out.println(Arrays.toString(copy));

    } // exerciseThree


    public static void exerciseFour () {
        Integer [] arr = {3, 6, 9, 5, 7, 1};
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
        System.out.println(arr[arr.length]);

        arr[5] = 15;

    } // exerciseFour

    public static void exerciseFive () {
        Integer [] arr = new Integer[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }

        System.out.println(Arrays.toString(arr));

    } // exerciseFive

    public static void exerciseSix () {
        Integer [] arr = new Integer[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=i*2;
        }

        System.out.println(Arrays.toString(arr));

    } // exerciseSix

    public static void exerciseSeven () {
        Integer [] arr = {3, 6, 9, 5, 7};

        for (int i = 0; i < arr.length; i++) {
            if (i != 2){
                System.out.println(arr[i]);
            };
        }

    } // exerciseSeven

    public static void exerciseEight() {
        Integer [] arr = {3, 6, 9, 5, 7};

        int temp = arr[0];
        arr[0] = arr[arr.length/2];
        arr[arr.length/2] = temp;

        System.out.println(Arrays.toString(arr));

    } // exerciseEight

    public static void exerciseNine() {
        Integer [] arr = {4, 2, 9, 13, 1, 0};
//        Integer minValue = arr.MIN_VALUE;
//        Integer maxValue = arr.MAX_VALUE;
        int min = Collections.min(Arrays.asList(arr));
        int max = Collections.max(Arrays.asList(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println("The minimum value is " + min + ".");
        System.out.println("The maximum value is " + max + ".");

    } // exerciseNine

}
