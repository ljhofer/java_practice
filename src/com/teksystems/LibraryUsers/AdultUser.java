package com.teksystems.LibraryUsers;

public class AdultUser implements LibraryUser {

    // fields
    public int age;
    public String bookType;

    @Override
    public void registerAccount() {
        if (age >= 12) {
            System.out.println("You have successfully registered under an adult account");
        } else if (age < 12) {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    @Override
    public void requestBook() {
        if (bookType == "Fiction") {
            System.out.println("Book issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}
