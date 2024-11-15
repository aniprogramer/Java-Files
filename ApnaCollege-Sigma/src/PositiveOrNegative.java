import java.util.Scanner;

class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0)
            System.out.println("It is a Positive Number.");
        else if (number < 0)
            System.out.println("It is a Negative Number.");
        else
            System.out.println("You have entered a Zero.");

        scanner.close();
    }
}