class ImplementThread implements Runnable {
    ImplementThread() {
        Thread t = new Thread(this, "Runnable Thread");
        System.out.println("Thread Running: " + t);
        t.start();
    }
    public void run() {
        for(int i=1; i<6; i++) {
            System.out.println("Runnable Thread: " + i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                System.out.println("Runnable Thread Interrupted: " + e.getMessage());
            }
        }
        System.out.println("Runnable Thread Finished..!!");
    }
}

public class ImplementingRunnable {
    public static void main(String[] args) {
        new ImplementThread();
        Thread t = new Thread("Main Thread");
        System.out.println("Thread Running: " + t);
        for(int i=0; i<5; i++) {
            System.out.println("Main Thread: " + (i+1));
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                System.out.println("Main Thread Interrupted: " + e.getMessage());
            }
        }
        System.out.println("Exiting Main Thread..!!");
    }
}
