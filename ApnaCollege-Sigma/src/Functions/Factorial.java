package Functions;

public class Factorial {
    public static int factorial(int number) {
        int fact = 1;
        for (int i=1; i<=number; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String args[]) {
        int num = 10;
        System.out.println("Factorial of "+num+" is: "+factorial(num));
    }
}
