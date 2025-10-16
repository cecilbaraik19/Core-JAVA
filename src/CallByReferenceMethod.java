import java.util.*;

public class CallByReferenceMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input array size
        System.out.print("Enter Array Size: ");
        int s = input.nextInt();

        int[] arr = new int[s];

        // Input array elements
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < s; i++) {
            arr[i] = input.nextInt();
        }

        // Display array before function call
        System.out.println("\n--- Array Elements Before Function ---");
        displayArray(arr);

        // Call function (pass by reference)
        disp(arr);

        // Display array after function call
        System.out.println("\n--- Array Elements After Function ---");
        displayArray(arr);

        input.close();
    }

    // Function to modify array (Call by Reference)
    static void disp(int[] arr) {
        System.out.println("\n--- Inside Function ---");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 2; // Modify array permanently
        }

        displayArray(arr);
    }

    // Helper function to display array elements
    static void displayArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
