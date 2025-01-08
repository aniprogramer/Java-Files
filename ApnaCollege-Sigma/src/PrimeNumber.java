import java.util.*;

/*public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean isPrime = true;

        if (number==2)
            System.out.println("2 is a prime number.");
        else if (number==1 || number==0)
            System.out.println(number + " is not a prime number.");
        else {
            for (int i = 2; i<=number-1; i++){
                if (number%i == 0)
                    isPrime = false;
            }
            if (isPrime)
                System.out.println(number + " is a prime number.");
            else
                System.out.println(number + " is not a prime number.");
        }

        input.close();

    }
}*/

// Optimized way of finding prime numbers
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean isPrime = true;

        if (number==2)
            System.out.println("2 is a prime number.");
        else if (number==1 || number==0)
            System.out.println(number + " is not a prime number.");
        else {
            for (int i = 2; i<=Math.sqrt(number); i++){
                if (number%i == 0)
                    isPrime = false;
            }
            if (isPrime)
                System.out.println(number + " is a prime number.");
            else
                System.out.println(number + " is not a prime number.");
        }

        input.close();
    }
}
