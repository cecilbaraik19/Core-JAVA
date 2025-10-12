// BufferReader Program in No Parameter & No Return Value
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NPNRV2 {
    public static void main(String[] args) throws IOException {
        disp();
    }

    static void disp() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;

        System.out.println("Enter the Value of a & b");
        a = Integer.parseInt(in.readLine());
        b = Integer.parseInt(in.readLine());

        System.out.println("Value of a  : " + a);
        System.out.println("Value of b  : " + b);

        c = a + b;
        System.out.println("Sum of two no. : " + c);
    }
}
