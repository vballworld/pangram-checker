package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //declare boolean to display whether string is a pangram or not
        boolean isPangram = false;

        //store string into "userInput"
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        //remove spaces, non-alphabets, and convert upper to lowercase
        userInput = userInput.replaceAll("\\s+","");
        userInput = userInput.replaceAll("[^A-Za-z0-9]", "");
        userInput = userInput.toLowerCase();

        //store non-duplicate letters in string to "lettersInString"
        String lettersInString = new String();
        for (int i=0; i < userInput.length(); i++) {
            if (!lettersInString.contains(userInput.charAt(i) + "")) {
                lettersInString += (userInput.charAt(i) + "");
            }
        }

        //update boolean "isPangram" & display results
        if (lettersInString.length() == 26) {
            System.out.println("We have a pangram!");
            isPangram = true;
        }
        else {
            System.out.println("Not a pangram.");
            isPangram = false;
        }
    }
}
