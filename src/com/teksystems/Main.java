package com.teksystems;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        controlFLowExercisesOne();
        controlFLowExercisesTwo();
//        slide52();
//        slide56();
//        slide15();
    }

    public static void slide52 () {
        int time = 86399;
        int hours = time / 3600;
        int secondsLeft = 86399 - ( hours * 3600 );
        int minutes = secondsLeft / 60;
        int finalSeconds = 3599 - (minutes * 60);
        System.out.println(hours+ ":" + minutes + ":" + finalSeconds);
    }

    public static void slide56() {

    }


    public static void slide15() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a year");
//
//        String yearEntered = input.nextLine();
    }

    public static void controlFLowExercisesOne() {
        int x = 15;

        if (x<10) {
            System.out.println("Less than 10.");
        }
    }

    public static void controlFLowExercisesTwo() {

    }

}
