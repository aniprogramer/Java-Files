package Array;

public class ArrayCC {

    public static int linearSearch(String[] menu, String key) {
        for (int i=0; i<menu.length; i++) {
            if (menu[i].equals(key))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] marks = {2, 4, 6, 8, 10, 12, 14, 16};
        String[] menu = {"dosa","chiku","ice cream"};
        int key = 10;
        String key1 = "chiku";

        int index = linearSearch(menu, key1);
        if (index == -1) {
            System.out.println("Key Not Found");
        } else {
            System.out.println("Key Found at: " + (index+1));
        }
    }
}