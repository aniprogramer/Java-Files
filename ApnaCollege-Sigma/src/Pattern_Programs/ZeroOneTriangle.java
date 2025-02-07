package Pattern_Programs;

public class ZeroOneTriangle {

    /*
    function to print the below pattern

    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
     */

    public static void zero_one_triangle (int lines) {
        //outer-loop
        for (int i=1; i<=lines; i++) {
            //inner-loop
            for (int j=1; j<=i; j++) {
                if ((i + j) % 2 == 0)  // even location then print 1
                    System.out.print(1 + " ");
                else  // else print 0
                    System.out.print(0 + " ");
            }
            // next-line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        zero_one_triangle(5);
    }
}
