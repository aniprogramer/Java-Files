package Pattern_Programs;
import java.util.Scanner;

public class NumberIncreasingPyramid {
    public static void printPattern(int n) {
        for (int line=1; line<=n; line++) {
            for (int number=1; number<=line; number++) {
                System.out.print(number+"\t");
            }
            System.out.println();
        }
    }
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(GREEN+"Program to print \"Number Increasing Pyramid\"\n"+RESET);
        System.out.print("Enter the number of lines: ");
        int lines = input.nextInt();
        printPattern(lines);
    }
}
