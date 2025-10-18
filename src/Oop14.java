/* Object Oriented Programming: Construction
Java Constructor with Parameters --> Parameterized Constructor.*/
class aa14{
    int a,b,c;
    aa14(int x,int y){
        a=x;
        b=y;
    }
    void disp(){
        System.out.println("Value of a    :"+a);
        System.out.println("Value of b    :"+b);
        c=a+b;
        System.out.println("Sum of two no. :"+c);
    }
}
public class Oop14 {
    public static void main(String[] args) {
        aa14 ob = new aa14(10,30);
        ob.disp();
    }
}
