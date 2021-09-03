package com.company;

public class WageTest{

    public static final int Full_Time_Emp = 1;
    public static final int Part_Time =2;
    public static final int Emp_Rate_per_hour = 20;
    public static final int Num_Of_Working_days = 20;

    public static void main(String[] args){


        int empHrs = 0;
        int total_Wage = 0;

        for (int day = 1; day <= Num_Of_Working_days; day++) {
            double empcheck = Math.floor(Math.random() * 10) % 3;

            switch ((int) empcheck) {
                case Full_Time_Emp:
                    empHrs = 8;
                    break;
                case Part_Time:
                    empHrs = 4;
                    break;

                default:
                    empHrs = 0;
            }
            int empwage;
            empwage = empHrs * Emp_Rate_per_hour;
            total_Wage = total_Wage + empwage;
            System.out.println("day" + day);
            System.out.println("Employee Wage Is " + empwage);
        }
        System.out.println("Total Wage:"+total_Wage);
    }
}
