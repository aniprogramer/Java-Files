import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt and read the number from keyboard
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Checking if the number is odd or even
        if ((number%2) == 0)
            System.out.println("\n"+ number + " is even.");
        else
            System.out.println("\n"+ number + " is odd.");

        scanner.close();
    }
}