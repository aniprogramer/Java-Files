package Functions;

public class Product {
    public static int product(int a, int b) {
        return a*b;
    }
    public static void main(String[] args) {
        int m=7, n=4;
        int mul = product(m, n);
        System.out.println(m+" x "+n+" = "+mul);
    }
}
