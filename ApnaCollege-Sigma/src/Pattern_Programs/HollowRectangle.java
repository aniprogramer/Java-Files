package Pattern_Programs;

public class HollowRectangle {

    // function to print a hollow rectangle
//    * * * * *
//    *       *
//    *       *
//    * * * * *
    public static void hollow_rectangle (int totalRows, int totalColumns) {
        // outer-loop
        for (int i=1; i<=totalRows; i++) {
            //inner-loop (for columns)
            for (int j=1; j<=totalColumns; j++) {
                // boundary condition
                if ( i == 1 || i == totalRows || j == 1 || j == totalColumns ) {
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
        hollow_rectangle(4, 5);
    }
}
