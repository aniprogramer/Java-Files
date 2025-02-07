package Pattern_Programs;

public class HollowRhombus {

    /*
    function to print the following pattern

            * * * * *
          *       *
        *       *
      *       *
    * * * * *

    */

    public static void hollow_rhombus (int line) {
        //outer-loop
        for (int i=1; i<=line; i++) {
            //loop for space
            for (int space=1; space<=(line-i); space++) {
                System.out.print("  ");
            }
            //loop for printing star and space
            for (int j=1; j<=line; j++) {
                if (i == 1 || i == line || j == 1 || j == line) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            // next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rhombus(5);
    }
}
