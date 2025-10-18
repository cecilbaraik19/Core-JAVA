//Object Oriented Programming: This Operator
import java.util.*;
class aa8{
    int a=5,b;
    void get(int a){
        b=this.a+a;
    }
    void put(){
        System.out.println("Value of b   :"+b);
    }
}
public class Oop8 {
    public static void main(String[] args) {
        aa8 ob = new aa8();
        ob.get(7);
        ob.put();
    }
}
