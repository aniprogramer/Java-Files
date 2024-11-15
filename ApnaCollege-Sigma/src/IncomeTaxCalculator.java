import java.util.Scanner;

class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tax;

        System.out.print("Enter your income: Rs.");
        int income = scanner.nextInt();

        if (income < 100000)
            tax = 0;
        else if (income > 100000 && income < 500000)
            tax = (int)(income * 0.2);
        else
            tax = (int)(income * 0.3);

        System.out.println("Tax = Rs." + tax);

        scanner.close();
    }
}