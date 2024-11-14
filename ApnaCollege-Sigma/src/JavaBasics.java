import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float pencil, pen, eraser, total=0;
        System.out.println("Enter the Prices of the following items.");
        System.out.print("Pencil: ");
        pencil = input.nextFloat();
        System.out.print("Pen: ");
        pen = input.nextFloat();
        System.out.print("Eraser: ");
        eraser = input.nextFloat();

        total = pencil + pen + eraser;
        System.out.println("Total bill: Rs." + total);

//        Add-on with 18% gst
        System.out.println("Total bill with 18% gst: Rs." + (total+(total*0.18)));
        input.close();
    }
}
