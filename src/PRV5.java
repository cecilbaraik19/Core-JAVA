// Parameter & Return Value Function: Program for converting Meter into Kilometer
import java.util.*;

public class PRV5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float m, km;

        System.out.println("Enter the distance in meters:");
        m = input.nextFloat();

        km = MeterToKm(m);

        System.out.println("Distance in Kilometers: " + km);
    }

    static float MeterToKm(float w) {
        float yz;
        yz = w / 1000;
        return yz;
    }
}
