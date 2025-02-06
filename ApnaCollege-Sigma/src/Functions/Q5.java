package Functions;

/*
Write a Java method to compute the sum of digits of a number.
 */

public class Q5 {

    // function to calculate the sum of digits of a number
    protected static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
    }
}
