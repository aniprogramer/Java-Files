package Array;

public class Print_SubArrays {
    public static void subArray(int[] array) {
        int total_SubArrays = 0;
        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = i; j < array.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(array[k] + " ");
                }
                total_SubArrays++;
                System.out.print("\t\t");
            }
            System.out.println();
        }
        System.out.println("\nTotal SubArrays: " + total_SubArrays);
    }
    public static void main(String[] args) {
        int[] num = {1, -2, 6, -1, 3};
        subArray(num);
    }
}
