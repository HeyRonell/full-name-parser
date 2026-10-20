package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Welcome to Name Parser");
        System.out.println("What is your first and last name? Add middle name if you have one!");
//        This will read the user's input and trim any leading spaces.
        String fullName = read.nextLine().trim();

//        This is saving the names in an array and uses the reg expression of removing spaces in between the names.
        String[] partsOfName = fullName.split("\\s+");

//        We are saving this in the system for now.
        String firstName = "";
        String middleName = "";
        String lastName = "";

//        If the user only has a first and last name, we use this one.
        if (partsOfName.length == 2) {
            firstName = partsOfName[0];
            middleName = "(none)";
            lastName = partsOfName[1];

        }
//      This is if the user fills in all fields.
        if (partsOfName.length == 3) {
            firstName = partsOfName[0];
            middleName = partsOfName[1];
            lastName = partsOfName[2];

        }

//        Prints out the name in segments.
        System.out.printf("First name is: %s\n", firstName);
        System.out.printf("Middle name is: %s\n", middleName);
        System.out.printf("Last name is: %s", lastName);


    }

}
