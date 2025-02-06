package Functions;

public class PrimeNumber {

    // function to check if the number is prime or not
//    public static void isPrime(int n) {
//        if(n<0)
//            System.out.println("Can't find prime of negative number.");
//        else if (n == 0 || n == 1)
//            System.out.println(n + " is not a prime number");
//        else if (n == 2)
//            System.out.println("2 is a prime number.");
//        else {
//            for(int i=2; i<n; i++) {
//                if (n % i == 0) {
//                    System.out.println(n + " is not a prime number.");
//                    return;
//                }
//            }
//            System.out.println(n + " is a prime number.");
//        }
//    }

    // function to check whether the given number is prime or not
    public static boolean isPrime(int n) {
        if (n == 0 || n == 1)
            return false;
        for(int i = 2; i<=Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // function to print all the prime numbers in range
    public static void primeInRange(int n) {
        int count = 0;
        for(int i=2; i<=n; i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n"+count);
    }
    public static void main(String[] args) {
        primeInRange(100);
    }
}
