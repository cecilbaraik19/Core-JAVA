// Object Oriented Programming: Construction --> Default Constructor
class aa13{
    int a,b,c;
    aa13(){
        a=10;
        b=15;
        System.out.println("Value of a    :"+a);
        System.out.println("Value of b    :"+b);
        c=a+b;
        System.out.println("Sum of two no. :"+c);
    }
}
public class Oop13 {
    public static void main(String[] args) {
        aa13 ob = new aa13();
    }
}
