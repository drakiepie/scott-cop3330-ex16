package org.example;
import java.util.Scanner;

public class DrivingAge {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What is your age? ");
        int ageInput = input.nextInt();
        int legalAge = 16;

        if(ageInput < legalAge){
            System.out.println("You are not old enough to legally drive");
        } else{
            System.out.println("You are old enough to legally drive.");
        }

    }
}
