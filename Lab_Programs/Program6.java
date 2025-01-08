 package Lab_Programs;

/*
 * Implement a Java Program to demonstrate of Bounded buffer problems using Java
 * Multi-Threading concepts.
 *                              [OR]
 * Implement a Java Program to demonstrate of producer-consumer problems
 */

 public class Program6 {
    public static void main(String[] args) {
        Shop c = new Shop();
        Producer p1 = new Producer(c, 1);
        MyConsumer c1 = new MyConsumer(c, 1);
        p1.start();
        c1.start();
    }
 }

 class Shop {
    private int materials;
    private boolean available = false;

    public synchronized int get() {
        while (available == false) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        available = false;
        notifyAll();
        return materials;
    }

    public synchronized void put(int value) {
        while (available == true) {
            try {
                wait();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        materials = value;
        available = true;
        notifyAll();
    }
 }

 class MyConsumer extends Thread {
    private Shop shop;
    private int number;

    public MyConsumer(Shop c, int number) {
        shop = c;
        this.number = number;
    }

    public void run() {
        int value = 0;
        for (int i=0; i<10; i++) {
            value = shop.get();
            System.out.println("Consumed value " +this.number+ " got: " +value);
        }
    }
 }

class Producer extends Thread {
    private Shop shop;
    private int number;

    public Producer(Shop c, int number) {
        shop = c;
        this.number = number;
    }

    public void run() {
        for (int i=0; i<10; i++) {
            shop.put(i);
            System.out.println("Produced value " +this.number+ " put: " +i);
            try {
                sleep((int)Math.random() * 100);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}