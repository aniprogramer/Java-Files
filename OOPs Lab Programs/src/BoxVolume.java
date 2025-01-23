class Box {
    private int width;
    private int height;
    private int depth;
    Box(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }
    public int Volume() {
        return width * height * depth;
    }
}

public class BoxVolume {
    public static void main(String[] args) {
        Box box1 = new Box(4, 7, 5);
        Box box2 = new Box(12, 18, 16);
        System.out.println("Volume of Box 1: " + box1.Volume());
        System.out.println("Volume of Box 2: " + box2.Volume());
    }
}
