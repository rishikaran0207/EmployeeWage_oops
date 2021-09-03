package com.Bridgelabz;
public class Employeewage {
    public static int punch=(int)(Math.random()*2);
    public static void empPresentorNot()
    {
        if(punch== 1)
            System.out.println("\n  employee is present today");
        else
            System.out.println("\n  employee is absent today");
    }

    public static void main(String[] args) {
        System.out.println("\nWelcome to Employee Wage using OOPS");
        empPresentorNot();
    }
}

