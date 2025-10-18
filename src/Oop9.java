// Object Oriented Programming: Inner Class/Nested Class
class aa9 {
    static class inner {
        static int a = 10;
        static int b = 15;
        static int c = 0;
        static void disp() {
            System.out.println("Value of a     :"+a);
            System.out.println("Value of b     :"+b);
            c = a + b;
            System.out.println("Sum of Two No. :"+c);
        }
    }
}

public class Oop9 {
    public static void main(String[] args) {
        aa9.inner.disp();   // <-- QUALIFY inner with the outer class name
    }
}
