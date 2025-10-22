// Multithreading with Runnable Interface
class values {
    int i, j, k;
}

class xx extends values implements Runnable {
    public void run() {
        for (i = 1; i <= 5; i++) {
            System.out.println("From aa class i=" + i);
        }
    }
}

class yy extends values implements Runnable {
    public void run() {
        for (j = 1; j <= 5; j++) {
            System.out.println("From bb class j=" + j);
        }
    }
}

class zz extends values implements Runnable {
    public void run() {
        for (k = 1; k <= 5; k++) {
            System.out.println("From cc class k=" + k);
        }
    }
}

public class Multithreading2 {
    public static void main(String[] args) {
        xx ob1 = new xx();
        yy ob2 = new yy();
        zz ob3 = new zz();

        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);
        Thread t3 = new Thread(ob3);

        t1.start();
        t2.start();
        t3.start();
    }
}
