import java.util.Scanner;

class FeverChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();

        if (temperature > 100.0)
            System.out.println("You have Fever.\nGet Well Soon.");
        else
            System.out.println("You don't have Fever.\nEnjoy !!");

        scanner.close();
    }
}