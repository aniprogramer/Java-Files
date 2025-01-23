public class isAliveJoinThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread started");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread Finished");
            }
        });

        thread.start();

        System.out.println("Is thread alive? " + thread.isAlive());

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Is thread alive after join? " + thread.isAlive());
    }
}
