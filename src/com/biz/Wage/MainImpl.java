package com.biz.Wage;

public class MainImpl extends Main {
    public class Main {

        static int payforhour = 20;

        public static void main(String[] args) {

            double empcheck = Math.floor(Math.random() * 10 % 2);
            System.out.println(empcheck);
            if (empcheck == 1) {
                System.out.println("The Emp is Present");
            } else {
                System.out.println("The Emp is Absent");
            }

        }

    }
}
