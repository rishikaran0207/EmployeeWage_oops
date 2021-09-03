package com.Bridgelabz;
public class Employeewage {
    public static int punch=(int)(Math.random()*2);
    int Is_fulltime = (int) (Math.floor(Math.random() * 8 % 9) + 1);
    int Is_partime = (int) (Math.floor(Math.random() * 4 % 5) + 1);
    public static int Per_Hrs_Pay = 20,Full_Day = 8,Partime_Hrs=4;


    public void fulltime_emp_PresentorAbesnt()
    {
        System.out.println("\n\n Fulltime employee present or absent:");
        empPresentorNot();
        employeewage(Full_Day,Is_fulltime);
    }

    public void parttime_employeewage()
    {
        System.out.println("\n\n Parttime employee present or absent:");
        empPresentorNot();
        employeewage(Partime_Hrs,Is_partime);

    }

    public void empPresentorNot()
    {
        if(punch == 1)
            System.out.println("\n  employee is present today");
        else
            System.out.println("\n  employee is absent today");
    }


    public void employeewage(int hrs,int present)
    {
        //System.out.println("\n\n the employee wage is:");
        int fullpresent = Per_Hrs_Pay * hrs;
        System.out.println("\n The salary is " + fullpresent);
        if (punch == 1) {
            int hoursbased = present * Per_Hrs_Pay;
            System.out.println("\n  Employee present for " + present + " hrs. Salary: " + hoursbased);
        } else
            System.out.println("\n  Employee is absent");
    }

    public static void main(String[] args) {
        System.out.println("\nWelcome to Employee Wage using OOPS");
        Employeewage emp=new Employeewage();
        emp.fulltime_emp_PresentorAbesnt();
        emp.parttime_employeewage();
    }
}

