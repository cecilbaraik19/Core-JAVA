//Joining in thread
class mm extends Thread{
    public void run(){
        System.out.println(getName()+" has start");
        for(int i=1;i<=5;i++){
            System.out.println(getName()+" "+i);
            try{
                sleep(500);
            }
            catch(InterruptedException e1){
                System.out.println(e1);
            }
        }
    }
}
class nn extends Thread{
    public void run(){
        System.out.println(getName()+" has start");
        for(int i=1;i<=5;i++){
            System.out.println(getName()+" "+i);
            try{
                sleep(500);
            }
            catch (InterruptedException e1){
                System.out.println(e1);
            }
        }
    }
}
class check{
    void show(Thread t){
        if(t.isAlive()){
            System.out.println(t.getName()+" is working");
        }
        else{
            System.out.println(t.getName()+" has stop");
        }
    }
}
public class Multithreading5 {
    public static void main(String[] args) {
        Thread ob1 = new mm();
        Thread ob2 = new nn();
        check ob = new check();
        ob1.setName(" Ranchi ");
        ob2.setName(" Bokaro ");
        ob1.start();
        ob2.start();
        ob.show(ob1);
        ob.show(ob2);
        System.out.println("Main Thread Wait Here");
        try{
            ob1.join();
            ob2.join();
        }
        catch(InterruptedException e1){
            System.out.println(e1);
        }
        ob.show(ob1);
        ob.show(ob2);
        System.out.println("Main Thread End Here");
    }
}
