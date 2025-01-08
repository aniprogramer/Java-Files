import java.util.Scanner;

public class Decimal_to_Binary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Decimal number to convert it into Binary: ");
        int decimalNumber = input.nextInt();
        String binaryNumber = "";
        int remainder = 0;

        while (decimalNumber != 0) {
            remainder = decimalNumber % 2;
            binaryNumber = remainder + binaryNumber;
            decimalNumber /= 2;
        }

        System.out.println("Binary Number: " + binaryNumber);
    }
}
