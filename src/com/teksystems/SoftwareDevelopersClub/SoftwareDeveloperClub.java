package com.teksystems.SoftwareDevelopersClub;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SoftwareDeveloperClub {

    public SoftwareDeveloperClub() {
        readFile();
    }
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
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }

    public void displayMembers() {
        memberList.forEach(member ->{
            System.out.printf("Member Name: %s\n Location: %s\n Favorite Language: %s\n", member.getName(), member.getLocation(), member.getFavoriteLanguage());
        });
    }

    public void removeMember() {

        System.out.println("Which member would you like to remove?");
        for (int i = 0; i < memberList.size(); i++ ) {
            System.out.printf("%d. %s\n", i+1, memberList.get(i));
        }
        Scanner removeScanner = new Scanner(System.in);
        int removeMember = removeScanner.nextInt();
        memberList.remove(removeMember);
    }

    public void addMember() {

        Scanner addMember = new Scanner(System.in);
        System.out.println("What is the member's first name?");
        String newMemberName = addMember.nextLine();

        System.out.println("What is the member's location? Example: Minneapolis, MN");
        String newMemberLocation= addMember.nextLine();

        System.out.println("What is the member's favorite programming language?");
        String newMemberLanguage= addMember.nextLine();

        memberList.add(new ClubMember(newMemberName, newMemberLocation, newMemberLanguage));

    }

}
