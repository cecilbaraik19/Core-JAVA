//Deadlock Thread
public class Multithreading8 {
    public static Object l1 = new Object();
    public static Object l2 = new Object();

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }

    // ---------- Thread 1 ----------
    static class Thread1 extends Thread {
        public void run() {
            synchronized (l1) {
                System.out.println("Thread-1: Holding lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }

                System.out.println("Thread-1 waiting for lock2");
                synchronized (l2) {
                    System.out.println("Thread2:Holding lock 1 & 2....");
                }
            }
        }
    }

    // ---------- Thread 2 ----------
    static class Thread2 extends Thread {
        public void run() {
            synchronized (l2) {
                System.out.println("Thread-2: Holding lock 2.....");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println("Thread-2 waiting for lock1...");
                synchronized (l1) {
                    System.out.println("Thread-2: Holding lock 1 & 2....");
                }
            }
        }
    }
}
