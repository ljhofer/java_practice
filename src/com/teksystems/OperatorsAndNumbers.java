package com.teksystems;

public class OperatorsAndNumbers {

    // exercise 1
        // 1
        // 1000
        // 0010 0001
        // 0100 1110
        // 0011 0001 0011
        // 1000 0100 1100 0011

    // exercise 2
        // 2
        // 9
        // 52
        // 114
        // 543
        // 11367

    public static void exerciseThree(){
        Integer x = 2;
        System.out.println(Integer.toBinaryString(x));
        x = x << 1; // 0100, 4
        System.out.println(x);


        System.out.println("-----------");

        Integer y = 9;
        System.out.println(Integer.toBinaryString(y));
        y = y << 1; // 1 0010, 18
        System.out.println(y);


        System.out.println("-----------");

        Integer z = 17;
        System.out.println(Integer.toBinaryString(z));
        z = z << 1; // 0010 0010, 34
        System.out.println(z);

        System.out.println("-----------");

        Integer a = 88;
        System.out.println(Integer.toBinaryString(a));
        a = a << 1; // 1011 0000, 176
        System.out.println(a);

    } // exerciseThree


    public static void exerciseFour(){
        Integer x = 150;
        System.out.println(Integer.toBinaryString(x));
        x = x >> 2; // 0010 0101, 37
        System.out.println(x);

        System.out.println("-----------");

        Integer y = 225;
        System.out.println(Integer.toBinaryString(y));
        y = y >> 2; //0011 1000, 56
        System.out.println(y);

        System.out.println("-----------");

        Integer z = 1555;
        System.out.println(Integer.toBinaryString(z));
        z = z >> 2; // 0001 1000 0100, 388
        System.out.println(z);

        System.out.println("-----------");

        Integer a = 32456;
        System.out.println(Integer.toBinaryString(a));
        a = a >> 2; // 0001 1111 1011 0010, 8114
        System.out.println(a);

    } // exerciseFour


    public static void exerciseFive(){
        int x = 7;
        int y = 17;
        int z = x & y;

        // 0001, 1

        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));

        System.out.println("-----------");

        int a = x | y;

        // 0001 0111, 23
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));

    } // exerciseFive


    public static void exerciseSix(){

        int x = 22;
        System.out.println(x);

        x++;
        System.out.println(x);

    } // exerciseSix


    public static void exerciseSeven(){


    } // exerciseSeven


    public static void exerciseEight(){


    } // exerciseEight

}
