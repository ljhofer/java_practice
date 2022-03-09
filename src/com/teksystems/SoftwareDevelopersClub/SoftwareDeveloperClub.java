package com.teksystems.SoftwareDevelopersClub;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SoftwareDeveloperClub {

    static File textFile = new File("members.txt");
    static Scanner input;
    static String[] data;

    public static void readFile()
        {
            try {
                input = new Scanner(textFile);
                while (input.hasNext()) {
                    String line = input.nextLine();
                    data = line.split("[*]+");
                    System.out.println(Arrays.toString(data));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            List<String> memberList = new ArrayList<>();
            System.out.println(memberList);

//            for ( String member : members) {
//                System.out.println(member);
////                System.out.printf("Member Name: " + %s + "Location: " + %s + "Favorite Language: " + %s\n, member);
//            }

        }

}
