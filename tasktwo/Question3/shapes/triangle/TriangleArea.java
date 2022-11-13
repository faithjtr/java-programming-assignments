package Question3.shapes.triangle;

import java.util.Scanner;

public class TriangleArea {

    static double myBase, myHeight, myArea;

    // input the base and the height
    void baseHeight() {

        Scanner input = new Scanner(System.in);
        // prompt user
        System.out.println("Enter the base of the triangle: ");
        myBase = input.nextDouble(); // store the input

        System.out.println("Enter the height of the triangle: ");
        myHeight = input.nextDouble(); // store the input

    }

    // find the area of the rectangle
    void findArea() {

        // doing calculations
        myArea = 0.5 * myBase * myHeight;
    }

    // method to output area
    void printResults() {

        // output the area
        System.out.println("The area of our triangle is: " + myArea);
    }

    // main method
    public static void main(String[] args) {

        // calling the non-static method by using the object of this class
        TriangleArea thisClassObj = new TriangleArea();

        thisClassObj.baseHeight();
        thisClassObj.findArea();
        thisClassObj.printResults();

    }
}
