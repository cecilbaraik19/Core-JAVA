// Thread with Modern Methods
class pp extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("From pp class i=" + i);
            if (i == 3) {
                // yield() gives a chance to other threads to execute
                Thread.yield();
            }
        }
    }
}

class qq extends Thread {
    private boolean running = true; // flag to safely stop the thread

    public void stopThread() { // method to safely stop the thread
        running = false;
    }

    public void run() {
        for (int j = 1; j <= 5 && running; j++) {
            System.out.println("From qq class j=" + j);
            if (j == 3) {
                System.out.println("qq thread stopping safely...");
                stopThread(); // safe stop instead of stop()
            }
        }
    }
}

class rr extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("From rr class k=" + k);
            if (k == 3) {
                try {
                    // sleep for 2 seconds (not 2000000 ms)
                    Thread.sleep(2000);
                } catch (InterruptedException e1) {
                    System.out.println("rr thread interrupted: " + e1);
                }
            }
        }
    }
}

public class Multithreading3 {
    public static void main(String[] args) {
        pp t1 = new pp();
        qq t2 = new qq();
        rr t3 = new rr();

        t1.start();
        t2.start();
        t3.start();
    }
}
