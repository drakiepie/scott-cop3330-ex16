package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Exercise 18 Solution
 *  Copyright 2021 Drake Scott
 */

public class DrivingAge {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What is your age? ");
        int ageInput = input.nextInt();

        //while loop in case user enters an invalid age.
        while(ageInput <= 0){
            System.out.print("Invalid age entered, please try again: ");
            ageInput = input.nextInt();
        }

        int legalAge = 16;

        String condition = (ageInput >= legalAge)?"":"not ";
        System.out.println("You are " + condition + "old enough to legally drive");



    }
}
