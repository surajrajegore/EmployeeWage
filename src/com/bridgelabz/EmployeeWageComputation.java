package com.bridgelabz;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        final int FULL_TIME = 1;
        final int PART_TIME = 2;
        final int WAGE_PER_HOUR = 20;
        final int WORKING_DAYS = 20;
        int workingHour = 0;
        int totalWage = 0;
        for (int day = 1; day <= WORKING_DAYS; day++) {
            int empType = (int) (Math.random() * 100) % 3;
            switch (empType) {
                case FULL_TIME:
                    System.out.println("Employee is Present Full time");
                    workingHour = 8;
                    break;
                case PART_TIME:
                    System.out.println("Employee is Present Part time");
                    workingHour = 4;
                    break;
                default:
                    System.out.println("Employee is Absent");
            }
            int wage = workingHour * WAGE_PER_HOUR;
            System.out.println("Day " + day + " wage is:" + wage);
            totalWage =totalWage + wage;
        }
        System.out.println("Total wage for a month is " + totalWage);
    }
}
