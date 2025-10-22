//Thread with Priority
class ii extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class jj extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("&");
            }
            System.out.println();
        }
    }
}
class kk extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
public class Multithreading4 {
    public static void main(String[] args) {
        ii ob1 = new ii();
        jj ob2 = new jj();
        kk ob3 = new kk();
        ob1.setPriority(2);
        ob2.setPriority(10);
        ob3.setPriority(5);
        ob1.start();
        ob2.start();
        ob3.start();
    }
}
