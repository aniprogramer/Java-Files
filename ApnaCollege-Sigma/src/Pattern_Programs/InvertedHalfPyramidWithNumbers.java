package Pattern_Programs;

public class InvertedHalfPyramidWithNumbers {

    /*
    function to print the following pattern

    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1

     */
    public static void inverted_half_pyramid_number (int lines) {
        //outer-loop
        for(int i=1; i<=lines; i++) {
            // loop-to-print-the-numbers
            for (int number=1; number<=(lines-i+1); number++) {
                System.out.print(number + " ");
            }
            // next-line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_half_pyramid_number(5);
    }
}
