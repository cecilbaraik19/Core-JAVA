public class Oops1 {
    void get() {
        int a = 10, b = 15;
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        int c = a + b;
        System.out.println("Sum of Two Numbers: " + c);
    }

    public static void main(String[] args) {
        Oops1 ob = new Oops1();
        ob.get();
    }
}
