package Functions;

public class FunctionOverloading {

    // function to add two integer numbers
    public static int sum(int a, int b) {
        return a + b;
    }
    // function to add two floating-point numbers
    public static float sum(float a, float b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(sum(5, 9));
        System.out.println(sum(15.98f, 90.23f));
    }
}
