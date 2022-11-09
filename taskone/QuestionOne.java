package taskone;

import java.util.Scanner;

public class QuestionOne {
    
    public static void main(String[] args) {
    
        //Scanner object
        Scanner input = new Scanner(System.in);

        String name;
        String numbertype;
        int age; 
        int nameLength;
        
            //get inputs
            System.out.println("Enter your sir name :");
            name = input.nextLine();
            System.out.println("Enter your age :");
            age = input.nextInt(); 

            nameLength = name.length(); //getting number of letters in sir name.

            //if age is divisible by 2, set oddOReven to even.
            //else set oddOReven to odd.
            if ((age % 2) == 0) {
                numbertype = "even";
            } else {
                numbertype = "odd";
            }

            System.out.println("\nThe number of characters in your sir name is : " + nameLength);
            System.out.println("Your current age is an " + numbertype + " number");
    }
}
