package Lab_Programs.cc; // Package declaration
import java.util.Scanner; // Import Scanner class for user input

public class CurrencyConvertor {

    double inr, usd, euro, yen; // Variables to store currency values
    Scanner input = new Scanner(System.in); // Scanner object for taking user input

    // Method to convert USD to INR
    public void USD_To_Rupee() {
        System.out.print("Enter USD to convert into INR: ");
        usd = input.nextDouble(); // Read USD value from user
        inr = usd * 81.83; // Conversion logic
        System.out.println("Dollar = " + usd + " is equal to Rupees = " + inr);
        System.out.println("\n");
    }

    // Method to convert INR to USD
    public void Rupee_To_USD() {
        System.out.print("Enter Rupees to convert into USD: ");
        inr = input.nextDouble(); // Read INR value from user
        usd = (inr / 81.83); // Conversion logic
        System.out.println("Rupees = " + inr + " is equal to Dollars = " + usd);
        System.out.println("\n");
    }

    // Method to convert Euro to INR
    public void Euro_To_Rupee() {
        System.out.print("Enter Euro to convert into Rupee: ");
        euro = input.nextDouble(); // Read Euro value from user
        inr = euro * 79.06; // Conversion logic
        System.out.println("Euro = " + euro + " is equal to Rupee = " + inr);
        System.out.println("\n");
    }

    // Method to convert INR to Euro
    public void Rupee_To_Euro() {
        System.out.print("Enter Rupees to convert into Euro: ");
        inr = input.nextDouble(); // Read INR value from user
        euro = inr / 79.06; // Conversion logic
        System.out.println("Rupees = " + inr + " is equal to Euro = " + euro);
        System.out.println("\n");
    }

    // Method to convert Yen to INR
    public void Yen_To_Rupee() {
        System.out.print("Enter Yen to convert into Rupees: ");
        yen = input.nextDouble(); // Read Yen value from user
        inr = yen * 0.57; // Conversion logic
        System.out.println("Yen = " + yen + " is equal to Rupees = " + inr);
        System.out.println("\n");
    }

    // Method to convert INR to Yen
    public void Rupee_To_Yen() {
        System.out.print("Enter Rupees to convert into Yen: ");
        inr = input.nextDouble(); // Read INR value from user
        yen = inr / 0.57; // Conversion logic
        System.out.println("Rupees = " + inr + " is equal to Yen = " + yen);
        System.out.println("\n");
    }
}
