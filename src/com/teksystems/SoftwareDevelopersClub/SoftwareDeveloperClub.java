package com.teksystems.SoftwareDevelopersClub;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SoftwareDeveloperClub {

    File textFile = new File("members.txt");
    String[] data;
    ArrayList<ClubMember> memberList = new ArrayList<>();

    public void readFile()
        {
            try {
                Scanner input = new Scanner(textFile);
                String dummyLine = input.nextLine();
                while (input.hasNext()) {
                    String line = input.nextLine();
                    data = line.split("[*]+");
                    memberList.add(new ClubMember(data[0], data[1] + ", " + data[2], data[3]));
                    System.out.printf("Member Name: %s\n Location: %s, %s\n Favorite Language: %s\n", data[0], data[1], data[2], data[3]);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }

    public void removeMember(Scanner input) {
//        try {
//            Scanner input = new Scanner(System.in);
//            int userChoice = input.nextInt();
//
//        } catch {
//
//        }
    }


    public void addMember() {



    }


    public void quit() {

    }




}
