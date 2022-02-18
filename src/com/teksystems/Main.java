package com.teksystems;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        slide52();
    }

    public static void slide52 () {
        int time = 86399;
        int hours = time / 3600;
        int secondsLeft = 86399 - ( hours * 3600 );
        int minutes = secondsLeft / 60;
        int finalSeconds = 3599 - (minutes * 60);
        System.out.println(hours+ ":" + minutes + ":" + finalSeconds);
    }

}
