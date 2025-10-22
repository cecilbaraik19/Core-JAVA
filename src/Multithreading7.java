// Thread Deadlocking
public class Multithreading7 {
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }

    // ---------- Thread 1 ----------
    private static class Thread1 extends Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread-1 acquired lock1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread-1 Interrupted");
                }

                System.out.println("Thread-1 waiting for lock2");
                synchronized (lock2) {
                    System.out.println("Thread-1 acquired lock2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread-1 Interrupted");
                    }
                }
                System.out.println("Thread-1 released lock2");
            }
            System.out.println("Thread-1 released lock1");
        }
    }

    // ---------- Thread 2 ----------
    private static class Thread2 extends Thread {
        public void run() {
            synchronized (lock2) {
                System.out.println("Thread-2 acquired lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread-2 Interrupted");
                }

                System.out.println("Thread-2 waiting for lock1");
                synchronized (lock1) {
                    System.out.println("Thread-2 acquired lock1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread-2 Interrupted");
                    }
                }
                System.out.println("Thread-2 released lock1");
            }
            System.out.println("Thread-2 released lock2");
        }
    }
}
