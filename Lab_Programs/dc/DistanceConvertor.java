package Lab_Programs.dc;
import java.util.Scanner;

public class DistanceConvertor {

    //Declaring variables for storing the different types of distances
    double km, m, miles;
    Scanner input = new Scanner(System.in);

    //Method to convert meters to kilometers
    public void Meter_To_Kilometer() {
        System.out.print("Enter distance in meters: ");
        m = input.nextDouble();
        km = m / 1000;
        System.out.println(m + " meters is equal to " + km + " kilometers");
        System.out.println("\n");
    }

    //Method to convert kilometers to meters
    public void Kilometer_To_Meter() {
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();
        m = km * 1000;
        System.out.println(km + " kilometers is equal to " + m + " meters");
        System.out.println("\n");
    }

    //Method to convert Miles to Kilometer
    public void Miles_To_Kilometer() {
        System.out.print("Enter distance in miles: ");
        miles = input.nextDouble();
        km = miles * 1.60934;
        System.out.println(miles + " miles is equal to " + km + " kilometers");
        System.out.println("\n");
    }

    //Method to convert Kilometers to Miles
    public void Kilometer_To_Miles() {
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();
        miles = km / 1.60934;
        System.out.println(km + " kilometers is equal to " + miles + " miles");
        System.out.println("\n");
    }
}
