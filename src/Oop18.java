//Object Oriented Programming:Inheritance-->Hierarchical Inheritance
class Parent{
    void disp(){
        System.out.println("S/O Mr. A.B Singh");
        System.out.println("Lalpur,Ranchi,Jharkhand");
    }
}
class son1 extends Parent{
    void disp1(){
        System.out.println("Mr. B.B Singh");
        disp();
    }
}
class son2 extends Parent{
    void disp2(){
        System.out.println("Mr. C.B Singh");
        disp();
    }
}
public class Oop18 {
    public static void main(String[] args) {
        son1 ob1 = new son1();
        son2 ob2 = new son2();
        ob1.disp1();
        System.out.println("------------------------------------");
        ob2.disp2();
    }
}
