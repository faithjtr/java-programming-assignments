package Question1.methods_in_java.java_methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        //  scanner obj
        Scanner input = new Scanner(System.in);

        // my variables
        double first_num;
        double second_num;
        double third_num;

        // Assigning input values to var firstNum, secondNum, thirdNum
        System.out.println("\nEnter the first number: ");
        first_num = input.nextInt();
        System.out.println("Enter the second number: ");
        second_num = input.nextInt();
        System.out.println("Enter the third number: ");
        third_num = input.nextInt();

        var smallNumber = getSmall(first_num, second_num, third_num);
        var largeNumber = getLarge(first_num, second_num, third_num);

        System.out.println("\nThe smallest number: " + smallNumber);
        System.out.println("The largest number: " + largeNumber);
        System.out.println(largeNumber + " is your largest and " + smallNumber + " is the smallest number.");
    }

    // return smallest num
    static double getSmall(double firstNum, double secondNum, double thirdNum) {

        // get smallest number
        if (firstNum < secondNum) {
            // if true, is firstNum > thirdNum
            if (firstNum < thirdNum) {
                // if true, return firstNum
                return firstNum;
            } else {
                // else false, return thirdNum
                return thirdNum;
            }
        } else {
            // else false, is secondNum < thirdNum
            if (secondNum < thirdNum) {
                // if true, return secondNum
                return secondNum;
            } else {
                // else false, return thirdNum
                return thirdNum;
            }
        }
    }

    // return largest num
    static double getLarge(double firstNum, double secondNum, double thirdNum) {

        // get largest number
        if (firstNum > secondNum) {
            if (firstNum > thirdNum) {
                // if true, return firstNum
                return firstNum;
            } else {
                // else false, return thirdNum
                return thirdNum;
            }
        } else {
            if (secondNum > thirdNum) {
                // if true, return secondNum
                return secondNum;
            } else {
                // else false, return thirdNum
                return thirdNum;
            }
        }
    }
}
