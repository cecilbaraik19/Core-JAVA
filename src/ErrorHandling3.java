//Multiple Catch Block
class ee3 {
    int a = 40, b = 0;
    int arr[] = new int[40];

    void disp() {
        try {
            arr[45] = a / b;
            System.out.println("Value of arr[45] = " + arr[45]);
        }
        catch (ArithmeticException e1) {
            System.out.println(e1);
        }
        catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println(e2);
        }
        finally {
            System.out.println("This message from finally block");
        }
    }
}

public class ErrorHandling3 {
    public static void main(String[] args) {
        ee3 ob = new ee3();
        ob.disp();
    }
}
