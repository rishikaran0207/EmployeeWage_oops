package com.Bridgelabz;
public class Employeewage {
    public static int punch=(int)(Math.random()*2);
    public static int WAGE_PER_HOUR = 20;

    public static void empPresentorNot()
    {
        if(punch== 1)
            System.out.println("\n  employee is present today");
        else
            System.out.println("\n  employee is absent today");
    }

    public void empWage(int hour,int present)
    {
        System.out.println("\n\ncheck the employee daily wage:");
        int fullpresent = WAGE_PER_HOUR * hour;
        System.out.println("\n  if employee worker is present for full hour, the salary is " + fullpresent);
        if (punch == 1) {
            int hoursbased = present * WAGE_PER_HOUR;
            System.out.println("\n  employee's salary based on hours, employee present for " + present + " hours so his salary is " + hoursbased);
        } else
            System.out.println("\n  the employee's salary is 0, because employee is absent");
    }

    public static void main(String[] args) {
        System.out.println("\nWelcome to Employee Wage using OOPS");
    }
}

