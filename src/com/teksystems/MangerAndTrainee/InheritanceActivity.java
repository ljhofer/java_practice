package com.teksystems.MangerAndTrainee;

public class InheritanceActivity {

    public static void InheritanceActivity() {

        Manager manager = new Manager(126534L, "Peter", "Chennai India", 237844L, 65000);
        System.out.println(manager.calculateSalary());

        Trainee trainee = new Trainee(29846L, "Jack", "Mumbai, India", 442085L, 45000);
        System.out.println(trainee.calculateSalary());

        System.out.println(manager.calculateTransportAllowance());
        System.out.println(trainee.calculateTransportAllowance());
    }
}
