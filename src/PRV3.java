// Parameter & Return Value Function: Program for Conversion of Temperature from Fahrenheit to Celsius
import java.util.*;

public class PRV3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float f, c;

        System.out.println("Enter the temperature in Fahrenheit:");
        f = input.nextFloat();
        c = FarToCel(f);
        System.out.println("Temperature in Celsius: " + c);
    }

    static float FarToCel(float w) {
        float z;
        z = (w - 32) * 5 / 9;
        return z;
    }
}
