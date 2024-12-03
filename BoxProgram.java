import java.util.Scanner;

class Box {
    double length, width, height;

    // Parameterized constructor
    Box (double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double volume() {
        return length * width * height;
    }
}

class BoxWeight extends Box {
    double weight;

    // Parameterized constructor
    BoxWeight(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }

    void display(){
        System.out.println("Dimensions: " +length+ " x " +width+ " x " +height);
        System.out.println("Weight: " +weight);
        System.out.println("Volume: " +volume());
    }
}

public class BoxProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BoxWeight box;
        System.out.println("Enter dimensions and weight of the box:");
        System.out.print("Length: ");
        double l = input.nextDouble();
        System.out.print("Width: ");
        double w = input.nextDouble();
        System.out.print("Height: ");
        double h = input.nextDouble();
        System.out.print("Weight: ");
        double weight = input.nextDouble();

        box = new BoxWeight(l, w, h, weight);
        box.display();

        input.close();
    }
}