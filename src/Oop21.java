//Object Oriented Programming: Java Interface with Inheritance (Interface + Class Extension).
interface sport{
    public int score(int s);
}
class exam{
    int marks(int m){
        return m;
    }
}
class result extends exam implements sport{
    int t,m,s;
    public int score(int s){
        return s;
    }
    void get(){
        s=score(15);
        m=marks(96);
    }
    void put(){
        System.out.println("Score       :"+s);
        System.out.println("Marks       :"+m);
        t=s+m;
        System.out.println("Total       :"+t);
    }
}
public class Oop21 {
    public static void main(String[] args) {
        result ob = new result();
        ob.get();
        ob.put();
    }
}
