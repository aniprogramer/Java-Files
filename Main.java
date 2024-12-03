class Box {
    double length, width, height;

    // Parameterized constructor for Box
    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
        System.out.println("Box constructor called..");
    }

    // Method to calculate volume
    double volume() {
        return length * width * height;
    }
}

class BoxWeight extends Box {
    double weight;

    // Parameterized constructor for BoxWeight
    BoxWeight(double l, double w, double h, double weight) {
        super(l, h, w); // Call the constructor of Base Class
        this.weight = weight;
        System.out.println("BoxWeight constructor called...");
    }

    // Method to display details
    void display() {
        System.out.println("Dimensions: " +length+ " x " +width+ " x " +height);
        System.out.println("Weight: " + weight);
        System.out.println("Volume: " +volume());
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of BoxWeight
        BoxWeight box = new BoxWeight(10.5, 5.5, 3.0, 15.0);
        box.display();
    }
}