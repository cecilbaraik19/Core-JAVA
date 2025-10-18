//Object Oriented Programming: Adding of two Number
class aa2{
    int a,b,c;
    void get(int x,int y){
        a=x;
        b=y;
    }
    void put(){
        System.out.println("Value of a :"+a);
        System.out.println("Value of b :"+b);
        c=a+b;
        System.out.println("Sum of two No. :"+c);
    }
}
public class Oops3 {
    public static void main(String[] args) {
        aa2 ob = new aa2();
        ob.get(20,30);
        ob.put();
    }
}
