package Pattern_Programs;
import java.util.Scanner;

public class RightHalfPyramidPattern {
    public static void printPattern(int n) {
        int num = 0;
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print(num + "\t");
                num++;
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines you want? ");
        int line = input.nextInt();
        printPattern(line);
    }
}
