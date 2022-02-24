package com.teksystems;

import java.util.Arrays;

public class ArraysExercises {

    public static void exerciseOne () {
        Integer [] arr = new Integer[3];

        arr[0]=1;
        arr[1]=2;
        arr[2]=3;

        System.out.println(Arrays.toString(arr));
    }

    public static void exerciseTwo () {

        Integer [] arr = {13, 5, 7, 68, 2};

        int mid = arr.length / 2;

        System.out.println(arr[mid]);
    }


}
