package Functions;

public class BinomialCoefficient {
    public static int factorial(int number) {
        int fact = 1;
        for (int i=1; i<=number; i++) {
            fact *= i;
        }
        return fact;
    }
    public static int binomialCoefficient(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int diff_nr_fact = factorial(n-r);
        int coefficient = n_fact/(r_fact * diff_nr_fact);
        return coefficient;
    }

    public static void main(String[] args) {
        System.out.println("Binomial Coefficient is: "+binomialCoefficient(5, 2));
    }
}
