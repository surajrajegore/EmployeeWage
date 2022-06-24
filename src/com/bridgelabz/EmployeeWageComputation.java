package com.bridgelabz;

public class EmployeeWageComputation {
    public static void main(String args[])
    {
        calculateTotalWage();
    }
    public static void calculateTotalWage() {
        final int PART_TIME = 1;
        final int FULL_TIME = 2;
        final int WAGE_PER_HR = 20;
        final int MAX_WORKING_DAYS = 20;
        final int MAX_WORKING_HOURS = 100;

        int totalWage = 0;
        int workingHours = 0;
        for (int days = 1, totalWorkingHours = 0; days <= MAX_WORKING_DAYS
                && totalWorkingHours < MAX_WORKING_HOURS; days++, totalWorkingHours += workingHours) {

            int empType = (int) (Math.random() * 100) % 3;
            switch (empType) {
                case FULL_TIME:
                    workingHours = 8;
                    break;
                case PART_TIME:
                    workingHours = 4;
                    break;
                default:
                    workingHours = 0;
                    break;
            }
            int wage = workingHours * WAGE_PER_HR;
            totalWage += wage;
            System.out.println("days " + days+" workingHours " + workingHours + " wage " + wage + " totalWorkingHours " + totalWorkingHours + " workingHours " + workingHours);

        }
        System.out.println("Total wage for a month is " + totalWage);
    }
}

