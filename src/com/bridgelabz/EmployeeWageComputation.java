package com.bridgelabz;

public class EmployeeWageComputation {
    public static void main(String[] args){
        final int FULL_TIME = 1;
        final int WAGE_PER_HOUR=20;
        int workingHour=0;
        int empType = (int) (Math.random() * 100) % 2;
        if (empType == FULL_TIME) {
            System.out.println("Employee is Present");
            workingHour = 8;

        } else {
            System.out.println("Employee is Absent");
        }
        int wage = workingHour * WAGE_PER_HOUR;
        System.out.println("Employee Daily wage is "+wage);
    }
}
