package Pattern_Programs;

public class InvertedRotatedHalfPyramid {

    /*
    function to print Inverted and Rotated Half Pyramid

           *
         * *
       * * *
     * * * *

     */
    public static void inverted_rotated_half_pyramid (int lines) {
        //outer-loop
        for (int i=1; i<=lines; i++) {
            //loop for spaces
            for (int space=1; space<=lines-i; space++) {
                System.out.print("  ");
            }
            //loop for printing star
            for (int star=1; star<=i; star++) {
                System.out.print("* ");
            }
            //next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_rotated_half_pyramid(7);
    }
}
