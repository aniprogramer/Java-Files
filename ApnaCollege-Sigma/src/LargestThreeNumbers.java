import java.util.Scanner;

public class LargestThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt and read the numbers from keyboard
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int thirdNumber = scanner.nextInt();

        // comparing the numbers for largest
        if (secondNumber > firstNumber)
            firstNumber = secondNumber;
        if (thirdNumber > firstNumber)
            firstNumber = thirdNumber;

        // Displaying the result
        System.out.printf("%nThe Largest number is: %d",firstNumber);
    }
}