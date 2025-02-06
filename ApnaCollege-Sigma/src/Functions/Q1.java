package Functions;

/*
Write a java method to compute the average of three numbers.
 */

public class Q1 {

    // function to calculate the average of 3 numbers
    public static double avg3Numbers(double a, double b, double c) {
        return (a + b + c)/3;
    }

    public static void main(String[] args) {
        System.out.println(avg3Numbers(5, 6, 8));
    }
}
