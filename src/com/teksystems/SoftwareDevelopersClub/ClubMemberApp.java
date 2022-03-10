package com.teksystems.SoftwareDevelopersClub;

import java.util.Scanner;

public class ClubMemberApp {

    public static void ClubMemberApp() {

        SoftwareDeveloperClub club = new SoftwareDeveloperClub();
        Scanner input = new Scanner(System.in);
        loop:
        while(true) {
            System.out.print("What would you like to do?\n 1. Display members\n 2. Remove member\n 3. Add member\n 4. Quit\n");
            switch(input.nextInt()){
                case 1:
                    club.displayMembers();
                    break;
                case 2:
                    club.removeMember();
                    break;
                case 3:
//                    club.addMember();
                    break;
                case 4:
                    break loop;
                default:
                    System.out.println("Please choose a number between 1 and 4.");
            }
        }













    }

}
