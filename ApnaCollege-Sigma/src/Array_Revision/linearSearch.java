package Array_Revision;

public class linearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 1;
        int index = linearSearch(numbers, key);
        if (index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + index);
    }
}
