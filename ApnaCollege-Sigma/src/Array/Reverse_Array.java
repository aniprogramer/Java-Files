package Array;

public class Reverse_Array {

    public static void reverseArray(int[] number) {
        int first = 0, last = number.length-1;

        while (first < last) {
            // Swap
            int temp = number[first];
            number[first] = number[last];
            number[last] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        reverseArray(num);

        for (int i = 0; i < num.length; i++)
            System.out.print(num[i] + " ");
    }
}
