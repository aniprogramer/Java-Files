package Pattern_Programs;

public class FloydsTriangle {

    /*
    function to print the following pattern

    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
     */
    public static void floyds_triangle (int lines) {
        int number = 1; // counter
        //outer-loop
        for (int i=1; i<=lines; i++) {
            //inner-loop
            for (int j=1; j<=i; j++) {
                System.out.print((number++) + " ");
            }
            //next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floyds_triangle(5);
    }
}
