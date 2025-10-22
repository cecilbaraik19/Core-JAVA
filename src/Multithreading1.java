//Multithreading using Thread
class aa extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("From aa class i="+i);
        }
    }
}
class bb extends Thread{
    public void run(){
        for(int j=1;j<=5;j++){
            System.out.println("From bb class j="+j);
        }
    }
}
class cc extends Thread{
    public void run(){
        for(int k=1;k<=5;k++){
            System.out.println("From cc class k="+k);
        }
    }
}
public class Multithreading1 {
    public static void main(String[] args) {
        aa ob1 = new aa();
        bb ob2 = new bb();
        cc ob3 = new cc();
        ob1.start();
        ob2.start();
        ob3.start();
    }
}
