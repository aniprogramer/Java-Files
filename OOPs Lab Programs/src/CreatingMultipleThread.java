class ThreadOne extends Thread {
    ThreadOne() {
        super("Thread One");
        System.out.println("Thread Running: " + this);
        start();
    }
    public void run() {
        for (int i=1; i<=5; i++) {
            System.out.println("Thread One: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread One Interrupted" + e.getMessage());
            }
        }
        System.out.println("Thread One Finished..!!!");
    }
}

class ThreadTwo extends Thread {
    ThreadTwo() {
        super("Thread Two");
        System.out.println("Thread Running: " + this);
        start();
    }
    public void run() {
        for (int i=1; i<=5; i++) {
            System.out.println("Thread Two: " + i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println("Thread Two Interrupted " + e.getMessage());
            }
        }
        System.out.println("Thread Two Finished.!!!");
    }
}

public class CreatingMultipleThread {
    public static void main(String[] args) {
        new ThreadOne();
        new ThreadTwo();
        Thread t = new Thread();
        t.setName("Main Thread");
        System.out.println("Main Thread: " + t);
        for (int i=0; i<5; i++) {
            System.out.println("Thread: " + (i+1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.println("Exiting Main Thread..!!");
    }
}
