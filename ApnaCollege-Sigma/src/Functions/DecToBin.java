package Functions;

public class DecToBin {

    // function to convert decimal number into binary number
    public static void decToBin(int decNum) {
        int myNum = decNum;
        int binaryNumber = 0, pow = 0;

         while (decNum > 0) {
             int remainder = decNum % 2;
             binaryNumber = binaryNumber + (remainder * (int)Math.pow(10, pow));
             pow++;
             decNum /= 2;
         }

        System.out.println("Binary of " + myNum + " is: " + binaryNumber);
    }

    // function to convert decimal number to binary number using String datatype
    public static void decToBinUsingString(long decNum) {
        long myNum = decNum;
        String binaryNumber = "";

        while(decNum > 0) {
            int remainder = (int)decNum % 2;
            binaryNumber = remainder + binaryNumber;
            decNum /= 2;
        }

        System.out.println("Binary of " +myNum+ " is: " + binaryNumber);
    }

    public static void main(String[] args) {
        decToBin(7);
        decToBinUsingString(10);
    }
}
