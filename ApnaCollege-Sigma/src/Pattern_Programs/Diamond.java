package Pattern_Programs;

public class Diamond {

    /*
    function to print the following pattern

          *
        * * *
      * * * * *
    * * * * * * *
    * * * * * * *
      * * * * *
        * * *
          *
     */

    public static void diamond (int n) {
        //1st Half
        //total number of lines to print
        for (int line = 1; line <= n; line++) {
            // loop tp print the space
            for (int space = 1; space <= (n - line); space++) {
                System.out.print("  ");
            }
            // loop to print the stars
            for (int star = 1; star <= (2 * line - 1); star++) {
                System.out.print("* ");
            }
            //next line
            System.out.println();
        }
        // 2nd Half
        //total number of lines to print
        for (int line = n; line >= 1; line--) {
            // loop tp print the space
            for (int space = 1; space <= (n - line); space++) {
                System.out.print("  ");
            }
            // loop to print the stars
            for (int star = 1; star <= (2 * line - 1); star++) {
                System.out.print("* ");
            }
            //next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamond(4);
    }
}
