package Pattern_Programs;
import java.util.Scanner;

public class CharacterPattern {
    public static void printPattern(int n) {
        char letter = 'A';
        for (int line=1; line<=n; line++) {
            for(int character=1; character<=line; character++) {
                System.out.print(letter+"\t");
                letter++;
            }
            System.out.println();
        }
    }
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println(GREEN+"Program to print \"Character Pattern\"\n"+RESET);
        System.out.print("Enter the line you need? ");
        int line = input.nextInt();
        printPattern(line);
    }
}
