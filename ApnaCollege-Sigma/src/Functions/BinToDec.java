package Functions;

public class BinToDec {

    // function to convert binary number to decimal number
//    public static void binToDec(long binNum) {
//
//        long myNum = binNum;
//        int pow = 0, decNum = 0;
//
//        // Validate if the number is a binary number
//        long temp = binNum;
//        while (temp > 0) {
//            int digit = (int)(temp % 10);
//            if (digit != 0 || digit != 1) {
//                System.out.println("Error: " + myNum + " is not a valid binary number.");
//                return;
//            }
//            temp /= 10;
//        }
//
//        while (binNum > 0) {
//            int lastDigit = (int)(binNum % 10);
//            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
//            binNum /= 10;
//            pow++;
//        }
//        System.out.println("Decimal of " + myNum + " is: " + decNum);
//    }

    // function to convert bin numbers to decimal using String data type
    public static void binToDec(String binNum) {
        int pow = binNum.length();
        long decimalNumber = 0l;

        // check if the binary number is valid or not
        String temp = binNum;
        for(int i=0; i < binNum.length(); i++) {
            int digit = (temp.charAt(i) - '0');
            if (digit != 0 && digit != 1) {
                System.out.println("\nError:");
                System.out.println("'" + binNum + "' is not a Binary Number!");
                return;
            }
        }

        // converting binary to decimal (if the above check is passed)
        System.out.println();
        for(int i=0; i < binNum.length(); i++) {
            int Digit = (binNum.charAt(i) - '0');
            decimalNumber = decimalNumber + (Digit * (long)Math.pow(2, pow-1));
            pow--;
        }

        System.out.println("Decimal of '" + binNum + "' is: " + decimalNumber);
    }

    public static void main(String[] args) {
        binToDec("11111011");
    }
}
