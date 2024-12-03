import java.util.Scanner;

public class Numbers1ToN {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = 1;
            System.out.print("Enter the Range: ");
            int range = scanner.nextInt();
            
            while (number <= range) {
                System.out.print(number + " ");
                number++;
            }
        }
    }
}