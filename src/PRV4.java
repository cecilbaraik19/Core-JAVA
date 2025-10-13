// Parameter & Return Value Function: Program for Conversion of Temperature from Celsius to Fahrenheit
import java.util.*;

public class PRV4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float f, c;

        System.out.println("Enter the temperature in Celsius:");
        c = input.nextFloat();
        f = CelToFar(c);
        System.out.println("Temperature in Celsius: " + f);
    }

    static float CelToFar(float w) {
        float z;
        z = w*9/5+32;
        return z;
    }
}

