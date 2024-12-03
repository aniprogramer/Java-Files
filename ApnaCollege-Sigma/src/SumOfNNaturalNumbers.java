import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int naturalNumber = 1;

        System.out.print("Enter the range: ");
        int range = scanner.nextInt();

        while (naturalNumber <= range) {
            sum+=naturalNumber;
            naturalNumber++;
        }

        System.out.print("\nThe Sum of First ");
        System.out.print(range);
        System.out.print(" Natural Numbers is " + sum);

        scanner.close();
    }
}