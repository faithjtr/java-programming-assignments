package taskone;

import java.util.Scanner;

public class QuestionOne {
    
    public static void main(String[] args) {
    
        //Scanner object
        Scanner input = new Scanner(System.in);

        String sirName, oddOReven;
        int age, sirNameLength;
        
            //get inputs
            System.out.println("Enter your sir name :");
            sirName = input.nextLine();

            System.out.println("Enter your age :");
            age = input.nextInt(); 

            //calculating the number of letters in sir name
            sirNameLength = sirName.length();


            //if age is divisible by 2, set oddOReven to even.
            //else set oddOReven to odd.
            if ((age % 2) == 0) {
                oddOReven = "even";
            } else {
                oddOReven = "odd";
            }

            //display Output
            System.out.println("\nThe number of characters in your sir name is : " + sirNameLength);
            System.out.println("Your current age is an " + oddOReven + " number");
    }
}
