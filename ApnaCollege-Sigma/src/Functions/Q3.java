package Functions;

/*
Write a Java program to check if a number is a palindrome in Java? ( 121 is a palindrome, 321 is not).
A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is palindrome because
the reverse of 121 is 121 itself. on the other hand, 321 is not a palindrome because the reverse of 321 is 123, which
is not equal to 321.
 */

public class Q3 {

    // function to check if the number is palindrome or not
    public static boolean isPalindrome(int number) {
        if (number < 0) return false; // Negative numbers cannot be palindromes

        int temp = number, reverseNumber = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reverseNumber = reverseNumber * 10 + digit; // Build reversed number
            temp /= 10;
        }

        return number == reverseNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123));  // false
        System.out.println(isPalindrome(121));  // true
        System.out.println(isPalindrome(1001)); // true
        System.out.println(isPalindrome(-121)); // false
    }
}
