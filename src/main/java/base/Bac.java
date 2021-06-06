package base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name

* Exercise 17 - Blood Alcohol Calculator
Sometimes you have to perform a more complex calculation based on some provided inputs and then use that result to make a determination.

Create a program that prompts for your weight, gender, total alcohol consumed (in ounces), and the amount of time since your last drink. Calculate your blood alcohol content (BAC) using this formula

BAC = (A × 5.14 / W × r) − .015 × H
where

A is total alcohol consumed, in ounces (oz).
W is body weight in pounds.
r is the alcohol distribution ratio:
0.73 for men
0.66 for women
H is number of hours since the last drink.
Display whether or not it’s legal to drive by comparing the blood alcohol content to 0.08.

* Example Output
Your BAC is 0.08
It is not legal for you to drive.

* Constraint
Prevent the user from entering non-numeric values.

* Challenges
Handle metric units.
Look up the legal BAC limit by state and prompt for the state. Display a message that states whether or not it’s legal to drive based on the computed BAC.
Develop this as a mobile application that makes it easy to record each drink, updating the BAC each time a drink is entered.

*/

public class Bac {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("What is your weight? ");
        double W = scan.nextDouble();

        scan.nextLine();

        System.out.print("What is your gender? Enter (M/F) ");
        String gender = scan.nextLine();

        System.out.print("What is your total alcohol consumed(in ounces)? ");
        double A = scan.nextDouble();

        System.out.print("What is the amount of time since your last drink? ");
        int H = scan.nextInt();

        if(gender.equals("M")){
            double BAC = ((A * 5.14) / (W * 0.73)) - .015 * H;
            System.out.println("Your BAC is " + (double)Math.round(BAC*100)/100);

            if(BAC >= 0.08){
                System.out.println("It is not legal for you to drive.");
            }
            else{
                System.out.println("It is legal for you to drive.");
            }
        }
        else{
            double BAC = (A * 5.14 / W * 0.66)- (.015 * H);
            System.out.print("Your BAC is " + BAC);

            if(BAC >= 0.08){
                System.out.println("It is not legal for you to drive.");
            }
            else{
                System.out.println("It is legal for you to drive.");
            }
        }

    }
}
