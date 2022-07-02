package com.bridgelabz;

public class EmployeeWageComputation {
    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;


    private String companyName;
    private int wagePerHour;
    private int maxWorkingDays;
    private int maxWorkingHrs;
    private int totalWage;

    public EmployeeWageComputation(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHrs) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingHrs = maxWorkingHrs;
        this.maxWorkingDays = maxWorkingDays;
    }

    public static void main(String args[]) {
        EmployeeWageComputation bmw = new EmployeeWageComputation("bmw",20,20,10);
        EmployeeWageComputation apple = new EmployeeWageComputation("apple",12,4,15);
        bmw.calculateTotalWage();
        System.out.println(bmw);
        apple.calculateTotalWage();
        System.out.println(apple);

    }

    private void calculateTotalWage() {

        int workingHours =0;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;
        while (totalWorkingHours <= maxWorkingHrs && totalWorkingDays < maxWorkingDays) {
            totalWorkingDays++;

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
            totalWorkingHours += workingHours;
            System.out.println("Days " +totalWorkingDays +" working hour is : " +workingHours );
        }
         totalWage = totalWorkingHours * wagePerHour;
    }
    public String toString(){
        return "Total wage is of "+companyName +" is "+totalWage;
    }
}
