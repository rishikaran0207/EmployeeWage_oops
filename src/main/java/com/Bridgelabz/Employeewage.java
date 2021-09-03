package com.Bridgelabz;
import java.util.Scanner;

public class Employeewage {
    public static int punch = (int) (Math.random() * 2);
    int Is_fullhours = (int) (Math.floor(Math.random() * 8 % 9) + 1);
    int Is_fullmonth =(int) (Math.floor(Math.random() * 100 % 101) + 1);
    int Is_parthours = (int) (Math.floor(Math.random() * 4 % 5) + 1);
    int Is_partmonth =(int) (Math.floor(Math.random() * 50 % 51) + 1);
    public static int Per_Hrs_Pay = 20, Full_Day = 8, Partime_Hrs = 4,Full_Month_Hrs=100,Part_Month_Hrs=50;;


    public void fulltime_emp_PresentorAbesnt() {
        System.out.println("\n\n Fulltime employee present or absent:");
        empPresentorNot();
        employeewage(Full_Day, Is_fullhours);
        monthlyWage(Full_Month_Hrs,Per_Hrs_Pay);
        hourlypay(Per_Hrs_Pay,Is_fullhours);
    }

    public void parttime_employeewage() {
        System.out.println("\n\n Parttime employee present or absent:");
        empPresentorNot();
        employeewage(Partime_Hrs, Is_parthours);
        monthlyWage(Part_Month_Hrs,Per_Hrs_Pay);
        hourlypay(Per_Hrs_Pay,Is_partmonth);
    }

    public void empPresentorNot() {
        if (punch == 1)
            System.out.println("\n Employee is present today");
        else
            System.out.println("\n Employee is absent today");
    }

    public void employeewage(int hrs, int present) {
        int fullpresent = Per_Hrs_Pay * hrs;
        System.out.println("\n The salary is " + fullpresent);
        if (punch == 1) {
            int hoursbased = present * Per_Hrs_Pay;
            System.out.println("\n Employee present for " + present + " hrs. Salary: " + hoursbased);
        } else
            System.out.println("\n Employee is absent");
    }

    public void monthlyWage(int hours,int wage)
    {
        int monthlysalary=hours*wage;
        System.out.println("\n Employee's monthly salary is "+monthlysalary);
    }

    public void hourlypay(int wage,int hours)
    {
        int monthlywage=wage*hours;
        System.out.println("\n The employee worked for " + hours + " hours ");
    }

    public static void main(String[] args) {
        System.out.println("\n Welcome to Employee Wage using OOPS");
        Scanner sc= new Scanner(System.in);

        Employeewage emp=new Employeewage();

        System.out.println("\n Select an Employee :");
        System.out.println("\n 1. FullTime Employee\n 2. PartTime Employee");

        int option= sc.nextInt();
        switch (option)
        {
            case 1:
            {
                emp.fulltime_emp_PresentorAbesnt();
            }
            break;
            case 2:
            {
                emp.parttime_employeewage();
            }break;
        }
    }
}

