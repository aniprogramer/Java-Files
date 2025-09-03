package Array_Revision;

public class reverseArray {
    public static void revArray(int[] arr) {
        int first = 0, last = arr.length - 1;

        while (first < last) {
            // swap
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};

        // before reversing the array
        System.out.println("Array Before Reversing");
        for (int i =0; i<numbers.length; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();

        // reversing the array
        revArray(numbers);

        // after reversing the array
        System.out.println("Array After Reversing");
        for (int i =0; i<numbers.length; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
    }
}
