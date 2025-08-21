package Array;

public class Max_SubArray_Sum_Brute_Force {

    // function to find the max of a sub array
    public static void maxSubArraySum(int[] array) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = i; j < array.length; j++) {
                int end = j;
                currentSum = 0;
                for (int k = start; k <= end; k++) {
                    // sub array sum
                    currentSum += array[k];
                }
                System.out.println(currentSum);
                if (maxSum < currentSum)
                    maxSum = currentSum;
            }
        }
        System.out.println("\nMax SubArray Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int[] number = {2, 4, 6, 8, 10};
        maxSubArraySum(number);
    }
}
