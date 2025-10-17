public class Oops2 {
    public static void main(String[] args) {
        aa1 ob = new aa1();
        ob.get();
    }
}
class aa1{
    void get(){
        int a = 199, b = 15;
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        int c = a + b;
        System.out.println("Sum of Two Numbers: " + c);
    }
}
