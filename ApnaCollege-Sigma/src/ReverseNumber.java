import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int rev = 0;

        while (number>0){
            int lastDigit = number%10;
            rev = (rev*10) + lastDigit;
            number /= 10;
        }

        System.out.println(rev);

    }
}
