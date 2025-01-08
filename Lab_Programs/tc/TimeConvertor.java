package Lab_Programs.tc;
import java.util.Scanner;

public class TimeConvertor {

    int hours, minutes, seconds;
    Scanner input = new Scanner(System.in);

    //Method to convert hours to minutes
    public void Hours_To_Minutes() {
        System.out.print("Enter hours to convert into minutes: ");
        hours = input.nextInt();
        minutes = hours * 60;
        System.out.println(hours + " hours is equal to " + minutes + " minutes.");
        System.out.println("\n");
    }

    //Method to convert minutes to hours
    public void Minutes_To_Hours() {
        System.out.print("Enter minutes to convert into hours: ");
        minutes = input.nextInt();
        hours = minutes / 60;
        System.out.println(minutes + " minutes is equal to " + hours + " hours.");
        System.out.println("\n");
    }

    //Method to convert Hours to Seconds
    public void Hours_To_Seconds() {
        System.out.print("Enter hours to convert into seconds: ");
        hours = input.nextInt();
        seconds = hours * 3600;
        System.out.println(hours + " hours is equal to " + seconds + " seconds.");
        System.out.println("\n");
    }

    //Method to convert Seconds to Hours
    public void Seconds_To_Hours() {
        System.out.print("Enter seconds to convert into hours: ");
        seconds = input.nextInt();
        hours = seconds / 3600;
        System.out.println(seconds + " seconds is equal to " + hours + " hours.");
        System.out.println("\n");
    }
}
