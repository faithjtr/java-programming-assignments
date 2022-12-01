import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // creating an arrays and setting the values to 0
        int[] ourArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        // input data, that is a range of maybe 15 numbers
        System.out.println("\nEnter 15 numbers to our array: \n(After each number, press enter to input.)");
        // store 1st position
        ourArray[0] = input.nextInt(); 
        ourArray[1] = input.nextInt();
        ourArray[2] = input.nextInt();
        ourArray[3] = input.nextInt();
        ourArray[4] = input.nextInt();
        ourArray[5] = input.nextInt();
        ourArray[6] = input.nextInt();
        ourArray[7] = input.nextInt();
        ourArray[8] = input.nextInt();
        ourArray[9] = input.nextInt();
        ourArray[10] = input.nextInt();
        ourArray[11] = input.nextInt();
        ourArray[12] = input.nextInt();
        ourArray[13] = input.nextInt();
        // store 15th position
        ourArray[14] = input.nextInt(); 

        // change the array to a string list.
        var ourList = Arrays.toString(ourArray);

        // display the array as a list
        System.out.println("Our array has the following values: " + ourList);

        System.out.println("Enter a random number to check if it is in the array: ");
        var numInput = input.nextInt();

        check(ourArray, numInput);

    }

    private static void check(int[] arr, int valueToCheck) {

        // implore Linear Search as a method
        boolean test = false;
        for (int num : arr) {

            // check if the specified num
            // is present in the array or not
            if (num == valueToCheck) {
                test = true;
                break;
            }

        }

        // output the result by printing
        if (test) {
            System.out.println(valueToCheck + " is in the array.");
        } else {
            System.out.println(valueToCheck + " is not in the array.");
        }

    }
}
