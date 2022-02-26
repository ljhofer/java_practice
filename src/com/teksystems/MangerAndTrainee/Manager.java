package com.teksystems.MangerAndTrainee;

public class Manager extends Employee {

    public Manager(long employeeId, String employeeName, String employeeAddress, Long employeePhone, double basicSalary) {
        super( employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
    }

    @Override
    public double calculateTransportAllowance(){
        double transportAllowance=0.15*basicSalary;
        return transportAllowance;
    }


}
