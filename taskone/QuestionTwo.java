package taskone;

import java.util.Scanner;

public class QuestionTwo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Scanner object
          
        //variables to store input
        double unit_one;
        double unit_two;
        double unit_three;
        double unit_four;
        double unit_five;

        //varable to store output
        double average;
        
            System.out.println("Enter marks of the five units you did on last semester.");
            System.out.println("Unit 1 : ");
            unit_one = input.nextDouble();
            System.out.println("Unit 2 : ");
            unit_two = input.nextDouble();
            System.out.println("Unit 3 : ");
            unit_three = input.nextDouble();
            System.out.println("Unit 4 : ");
            unit_four = input.nextDouble();
            System.out.println("Unit 5 : ");
            unit_five = input.nextDouble();

            //getting average mark by calling getMyAverage() and putting it in a variable
            average = getMyAverage(unit_one, unit_two, unit_three, unit_four, unit_five);

            //Outputting the average
            System.out.println("Average: " + average);
        }

        //a function to get average
    static double getMyAverage(double unit1, double unit2, double unit3, double unit4, double unit5) {
        //finding the average
        double myAVG, roundedAverage;

        myAVG = (unit1 + unit2 + unit3 + unit4 + unit5) / 5; 
        roundedAverage = Math.round(myAVG * 100.0) / 100.0; //rounding the average
        return roundedAverage;
    }
}
