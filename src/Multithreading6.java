//Synchronization of thread
class Table{
    synchronized void print(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+ " x " +i+ " = "+n*i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e1){
                System.out.println(e1);
            }
        }
    }
}
class ee extends Thread{
    Table obj;
    ee(Table ob){
        obj=ob;
    }
    public void run(){
        obj.print(10);
    }
}
class ff extends Thread{
    Table obj;
    ff(Table ob){
        obj=ob;
    }
    public void run(){
        obj.print(15);
    }
}
public class Multithreading6 {
    public static void main(String[] args) {
        Table ob = new Table();
        ee ob1 = new ee(ob);
        ff ob2 = new ff(ob);
        ob1.start();
        ob2.start();
    }
}
