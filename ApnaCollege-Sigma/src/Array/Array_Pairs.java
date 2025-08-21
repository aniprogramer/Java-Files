package Array;

public class Array_Pairs {
    public static void arrayPairs(int[] number) {
        int totalPairs = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + number[i] + "," + number[j] + ") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + totalPairs);
    }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        arrayPairs(numbers);
    }
}
