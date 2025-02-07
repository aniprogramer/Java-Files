package Pattern_Programs;

public class SolidRhombus {

    /*
    function the print the following pattern

            * * * * *
          * * * * *
        * * * * *
      * * * * *
    * * * * *

     */

    public static void solid_rhombus (int line) {
        //outer-loop
        for (int i=1; i<=line; i++) {
            //loop for printing space
            for(int space=1; space<=(line-i); space++) {
                System.out.print("  ");
            }
            //loop for printing star
            for (int j=1; j<=line; j++) {
                System.out.print("* ");
            }
            //next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solid_rhombus(5);
    }
}
