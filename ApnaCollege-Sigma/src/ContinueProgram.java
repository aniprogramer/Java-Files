import java.util.Scanner;

public class ContinueProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (number%10 == 0)
                continue;

            System.out.println("Number entered is: " + number);

        } while(true);
    }
}
