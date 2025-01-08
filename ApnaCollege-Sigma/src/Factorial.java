import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        long factorial = 1;

        if (number==0 || number==1)
            System.out.println("Factorial of " + number + " is: 1");
        else {
            for (int i = 1; i <= number; i++)
                    factorial *= i;

            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
}
