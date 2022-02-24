package com.teksystems;

import java.util.Arrays;

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


}
