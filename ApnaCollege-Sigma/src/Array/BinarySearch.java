package Array;

public class BinarySearch {
    public static int binarySearch(int[] num, int key) {
        int start = 0, end = (num.length-1);

        while (start <= end) {
            int mid = (start + end) / 2;

            //comparison
            if(num[mid] == key)
                return mid+1;
            else if (num[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int key = 4;

        System.out.println("Index for key is: " + binarySearch(numbers, key));
    }
}
