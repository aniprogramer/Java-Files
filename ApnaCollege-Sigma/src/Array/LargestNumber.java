package Array;

public class LargestNumber {
    public static int getLargest(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++) {
            if(largest < nums[i])
                largest = nums[i];
            if(smallest > nums[i])
                smallest = nums[i];;
        }
        System.out.println("Smallest value is: " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int[] number = {1, 2, 10, 19, 9};
        System.out.println("Largest value is: " + getLargest(number));
    }
}
