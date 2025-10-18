//A Bus Fare Discount program using Encapsulation + Getter/Setter Methods
import java.util.*;

class Bus {
    private String pName;
    private int pAge;
    private char pGender;
    private double bFare;

    // Setter for Name
    void setName(String pName) {
        this.pName = pName;
    }

    // Getter for Name
    String getName() {
        return pName;
    }

    // Setter for Gender
    void setGender(char pGender) {
        this.pGender = pGender;
    }

    // Getter for Gender
    char getGender() {
        return pGender;
    }

    // Setter for Age
    void setAge(int pAge) {
        this.pAge = pAge;
    }

    // Getter for Age
    int getAge() {
        return pAge;
    }

    // Setter for Fare
    void setFare(double bFare) {
        this.bFare = bFare;
    }

    // Getter for Fare
    double getFare() {
        return bFare;
    }

    // Method to calculate discount
    double cal() {
        double d = 0;

        if (pAge >= 60) {
            d = bFare * 0.30; // 30% discount for senior citizens
        } else if (pAge <= 12) {
            d = bFare * 0.20; // 20% discount for children
        } else if (pGender == 'F' || pGender == 'f') {
            d = bFare * 0.10; // 10% discount for female passengers
        }

        return d;
    }
}

public class Oop11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bus ob = new Bus();

        System.out.print("Enter Passenger Name: ");
        ob.setName(input.nextLine());

        System.out.print("Enter Gender (M/F): ");
        ob.setGender(input.nextLine().charAt(0));

        System.out.print("Enter Age: ");
        ob.setAge(input.nextInt());

        System.out.print("Enter Bus Fare: ");
        ob.setFare(input.nextDouble());

        System.out.println("-------------------------------------");

        double discount = ob.cal();
        double netFare = ob.getFare() - discount;

        System.out.println("Name             : " + ob.getName());
        System.out.println("Gender           : " + ob.getGender());
        System.out.println("Age              : " + ob.getAge());
        System.out.println("Fare             : " + ob.getFare());
        System.out.println("Discount         : " + discount);
        System.out.println("Net Fare         : " + netFare);

        input.close();
    }
}
