package com.teksystems.LibraryUsers;

public class LibraryInterfaceDemo {

    public static void LibraryInterface() {

        KidUser k1 = new KidUser(10, "Kids");
        KidUser k2 = new KidUser(18, "Fiction");

        k1.registerAccount();
        k2.registerAccount();

        k1.requestBook();
        k2.requestBook();

        AdultUser a1 = new AdultUser(5, "Kids");
        AdultUser a2 = new AdultUser(23, "Fiction");

        a1.registerAccount();
        a2.registerAccount();

        a1.requestBook();
        a2.requestBook();

    }

}
