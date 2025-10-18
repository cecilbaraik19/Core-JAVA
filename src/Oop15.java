/* Object Oriented Programming: Construction Overloading*/
class aa15{
    int a,b;
    aa15(int x,int y){
        a=x;
        b=y;
    }
    aa15(aa15 p,aa15 q){
        a = p.a + q.a;
        b = p.b + q.b;
    }
    void disp(){
        System.out.println("Value of a     :"+a);
        System.out.println("Value of b     :"+b);
    }
}
public class Oop15 {
    public static void main(String[] args) {
        aa15 ob1 = new aa15(10,20);
        aa15 ob2 = new aa15(34,50);
        aa15 ob3 = new aa15(13,56);
        ob1.disp();
        System.out.println("------------------------------");
        ob2.disp();
        System.out.println("------------------------------");
        ob3.disp();
    }
}
