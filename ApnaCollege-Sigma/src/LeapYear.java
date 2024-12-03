import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Year: ");
        int year = scanner.nextInt();

        boolean x = (year%4) == 0;
        boolean y = (year%100) != 0;
        boolean z = (year%400) == 0;

        if ((x && y) || z)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year");

        scanner.close();
    }
}