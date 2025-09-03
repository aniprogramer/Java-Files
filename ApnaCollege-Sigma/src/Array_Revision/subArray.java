package Array_Revision;

public class subArray {
    public static void printSubArray(int[] array) {
        int ts = 0, minSum = Integer.MAX_VALUE, maxSum = Integer.MIN_VALUE;
        for(int start = 0; start < array.length; start++) {
            for(int end = start; end < array.length; end++) {
                System.out.print("{ ");
                int sum = 0;
                for(int sub = start; sub <= end; sub++) {
                    System.out.print(array[sub] + " ");
                    sum += array[sub];
                }
                System.out.print("}, Total sum = " + sum);
                System.out.println();
                ts++;
                if (minSum > sum) {
                    minSum = sum;
                }
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Total subarray length: " + ts);
        System.out.println("Minimum Sum: " + minSum);
        System.out.println("Maximum Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        printSubArray(numbers);
    }
}
