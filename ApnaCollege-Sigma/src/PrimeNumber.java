import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int count = 0;

        for (int i=2; i<=(number/2); i++) {
            if (number%i == 0)
                count++;
        }

//        System.out.println(count);

        if (count > 2)
            System.out.println("Non-Prime Number");
        else
            System.out.println("Prime Number");

    }
}
