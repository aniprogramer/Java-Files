class Shape {
    protected String name;
    public Shape(String name) {
        this.name = name;
    }
    public double calculateArea() {
        System.out.println("Area calculation of a Generic Shape.");
        return 0;
    }
    public void displayName() {
        System.out.println("This is a shape: " + name);
    }
}

class Square extends Shape {
    private double side;
    public Square(double side) {
        super("Square");
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return side * side;
    }
    public void displayInfo() {
        super.displayName();
        System.out.println("Square's side: " + side);
    }
}

class Triangle extends Shape {
    private double base;
    private double height;
    public Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }
    public double calculateArea() {
        return 0.5 * base * height;
    }
    public void displayInfo() {
        super.displayName();
        System.out.println("Triangle dimensions (base x height): " + base + " x " + height);
    }
}

public class InheritancePolymorphismExample {
    public static void main(String[] args) {
        Square square = new Square(4);
        Triangle triangle = new Triangle(5, 9);
        square.displayInfo();
        System.out.println("Area of the Square: " + square.calculateArea());
        triangle.displayInfo();
        System.out.println("Area of the Triangle: " + triangle.calculateArea());
    }
}
