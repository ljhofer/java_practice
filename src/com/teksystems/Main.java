package com.teksystems;

import com.teksystems.CreatingAMonster.CreatingAMonster;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        controlFLowExercisesOne();
//        controlFLowExercisesTwo();
//        controlFLowExercisesThree();
//        controlFLowExercisesFour();
//        controlFLowExercisesFive();
//        controlFLowExercisesSix();
//        slide52();
//        slide56();
//        slide15();
//        ArraysExercises.exerciseOne();
//        ArraysExercises.exerciseTwo();
//        ArraysExercises.exerciseThree();
//        ArraysExercises.exerciseFour();
//        ArraysExercises.exerciseFive();
//        ArraysExercises.exerciseSix();
//        ArraysExercises.exerciseSeven();
//        ArraysExercises.exerciseEight();
//        ArraysExercises.exerciseNine();
//        ArraysExercises.exerciseTen();
//        InClassPractice.practice();
//        CreatingAMonster.CreateMonster();
//        LoopsExercise.exerciseOne();
//        LoopsExercise.exerciseTwo();
//        LoopsExercise.exerciseThree();
//        LoopsExercise.exerciseFour();
//        LoopsExercise.exerciseFive();
        LoopsExercise.exerciseSix();


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
        int x = 15;

        if (x<10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }
    }

    public static void controlFLowExercisesThree() {
        int x = 15;

        if (x<10) {
            System.out.println("Less than 10");
        } else if (10<x && x<20) {
            System.out.println("Between 10 and 20");
        } else if (x>20) {
            System.out.println("Greater than 20");
        }
    }


    public static void controlFLowExercisesFour(){
        int x = 15;

        if (10>x && x>20) {
            System.out.println("Out of range");
        }
    }


    public static void controlFLowExercisesFive() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a score:");
        int x = input.nextInt();
        if (90<=x && x<=100) {
            System.out.println("A");
        } else if (80<=x && x<90) {
            System.out.println("B");
        } else if (70<=x && x<80) {
            System.out.println("C");
        } else if (60<=x && x<70) {
            System.out.println("D");
        } else if (x<60) {
            System.out.println("F");
        } else if (0>x || x>100){
            System.out.println("Score out of range");
        }

    }

    public static void controlFLowExercisesSix() {
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 7.");
        int y = input2.nextInt();

        switch (y) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");
        }

    }



}
