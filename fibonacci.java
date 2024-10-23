import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        // Displaying the numbers before swapping
        System.out.println("Before swapping: a="+a+", b="+b);

        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        // Displaying the numbers after swapping
        System.out.println("After swapping: a="+a+", b="+b);
    }
}