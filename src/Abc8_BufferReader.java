import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Abc8_BufferReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        String name;
        char grade;
        int roll;
        float per;
        double fee;

        System.out.println("Enter Roll No.");
        roll = Integer.parseInt(in.readLine());

        System.out.println("Enter Name");
        name = in.readLine();

        System.out.println("Enter Percentage");
        per = Float.parseFloat(in.readLine());

        System.out.println("Enter Fee");
        fee = Double.parseDouble(in.readLine());

        System.out.println("Enter Grade");
        grade = in.readLine().charAt(0);

        System.out.println("-------------------------------------");
        System.out.println("Name                    : " + name);
        System.out.println("Roll No.                : " + roll);
        System.out.println("Percentage              : " + per);
        System.out.println("Grade                   : " + grade);
        System.out.println("Fee                     : " + fee);
    }
}
