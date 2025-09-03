package Array_Revision;
import java.util.*;

public class largest_Smallest_Number {
    public static int getLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE; // -infinity

        for (int i=0; i< numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int getSmallest(int[] numbers) {
        int smallest = Integer.MAX_VALUE; // +infinity

        for (int i=0; i< numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 6, 5, 3};
        System.out.println("Smallest number: " + getSmallest(numbers));
        System.out.println("Largest number: " + getLargest(numbers));
    }
}
