package Question2;

import java.util.Scanner;

public class ThreeUnits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double javaMark, networkingMark, mathMark, average; // my variables

        // getting marks
        // get java marks
        System.out.println("Enter marks for Java Programming: ");
        javaMark = input.nextInt(); 
        
        // get networking marks
        System.out.println("Enter marks for Networking: ");
        networkingMark = input.nextInt(); 

        // get maths marks
        System.out.println("Enter marks for Maths: ");
        mathMark = input.nextInt(); 

        average = (javaMark + networkingMark + mathMark) / 3; // Getting the average

        // output the inputs
        System.out.println("\nMarks for Java Programming is: " + javaMark);
        System.out.println("Marks for Networking: " + networkingMark);
        System.out.println("Marks for Maths: " + mathMark);

        // output the average
        System.out.println("\nThe average is: " + average);

    }

}
