package Pattern_Programs;

public class Butterfly {

    /*
    function to print the following pattern

    *             *
    * *         * *
    * * *     * * *
    * * * * * * * *
    * * * * * * * *
    * * *     * * *
    * *         * *
    *             *

     */

    public static void butterfly (int line) {
        //outer-loop
        for (int i=1; i<=line; i++) {
            //first-star
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            //for-space-in-between
            for (int space=1; space<=(2*(line-i)); space++) {
                System.out.print("  ");
            }
            //last-star
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            //next line
            System.out.println();
        }
        //for other half
        for (int i=line; i>=1; i--) {
            //first-star
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            //for-space-in-between
            for (int space=1; space<=(2*(line-i)); space++) {
                System.out.print("  ");
            }
            //last-star
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            //next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly(5);
    }
}
