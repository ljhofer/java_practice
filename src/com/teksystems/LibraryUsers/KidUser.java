package com.teksystems.LibraryUsers;

public class KidUser implements LibraryUser{

    // fields
    public int age;
    public String bookType;

    // constructor
    public KidUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }


    // methods
    @Override
    public void registerAccount() {
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids account");
        } else if (age >= 12) {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook() {
        if (bookType == "Kids") {
            System.out.println("Book issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }

    }




}
