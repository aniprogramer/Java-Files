package Pattern_Programs;

import java.util.Scanner;

public class CapitalSmallLettersRightHalfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for number of lines
        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();
        input.close(); // Close scanner to prevent resource leak

        // Initialize capital and small letter counters
        char capitalLetter = 'A';
        char smallLetter = 'a';

        // Outer loop to control number of rows
        for (int i = 1; i <= numberOfLines; i++) {
            // Determine if row starts with capital or small letter
            boolean isEvenRow = (i % 2 == 0);

            // Inner loop to print characters in each row
            for (int j = 1; j <= i; j++) {
                // Print alternating capital and small letters
                if ((j % 2 == 0) == isEvenRow) {
                    System.out.print(capitalLetter + " ");
                } else {
                    System.out.print(smallLetter + " ");
                }

                // Increment both letter variables
                capitalLetter++;
                smallLetter++;
            }
            System.out.println(); // Move to next line
        }
//        int rows = 4; // Number of rows in the pattern
//        char ch = 'A'; // Starting character
//
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(ch + " ");
//                // Toggle between uppercase and lowercase
//                if (Character.isUpperCase(ch)) {
//                    ch = Character.toLowerCase(ch);
//                } else {
//                    ch = Character.toUpperCase(ch);
//                }
//                ch++; // Move to the next character
//            }
//            System.out.println(); // Move to the next row
//        }
    }
}

