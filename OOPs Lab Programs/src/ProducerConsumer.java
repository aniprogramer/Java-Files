class Shop {
    private boolean available = false;
    private int materials;
    public synchronized int get() {
        while (available == false) {
            try {
                wait();
            } catch(InterruptedException e) {
                System.out.println("Consumer Thread Interrupted");
            }
        }
        available = false;
        notify();
        return materials;

    }
    public synchronized void put(int i) {
        while (available == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Producer Thread Interrupted");
            }
        }
        available = true;
        materials = i;
        notify();
    }
}

class Consumer extends Thread {
    private Shop shop;
    private int consumerId;
    public Consumer(Shop shop, int consumerId) {
        this.shop = shop;
        this.consumerId = consumerId;
    }
    public void run() {
        for (int i=1; i<11; i++) {
            int value = shop.get();
            System.out.println("Consumer " + this.consumerId + " got: " + value);
        }
    }
}

class Producer extends Thread {
    private Shop shop;
    private int producerId;
    public Producer(Shop shop, int producerId) {
        this.shop=shop;
        this.producerId=producerId;
    }
    public void run() {
        for(int i=1; i<11; i++) {
            shop.put(i);
            System.out.println("Producer " + this.producerId + " put: " + i);
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Producer producer = new Producer(shop, 1);
        Consumer consumer = new Consumer(shop, 1);
        producer.start();
        consumer.start();
    }
}
