package day05;

import java.util.Scanner;

public class Task_4_hourly_wage {                          // Create an interactive program to ask user for hourly wage
                                                           // and generate yearly salary
                                                          // assume that he works 2080 hours for year
    public static void main(String[] args) {


        Scanner year =  new Scanner(System.in) ;
        System.out.println("What is your hourly wage? ");
        int hourlyWage = year.nextInt();
        int salary = hourlyWage * 2080;
        System.out.println("Your yearly salary based on hourly wage rate of " + hourlyWage);











    }
}
