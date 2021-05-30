package org.example;
import java.util.Scanner;

public class DrivingAge {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What is your age? ");
        int ageInput = input.nextInt();
        int legalAge = 16;

        String condition = (ageInput>legalAge)?"":"not ";
        System.out.println("You are " + condition + "old enough to legally drive");



    }
}
