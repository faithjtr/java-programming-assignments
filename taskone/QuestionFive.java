package taskone;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Double num_one, num_2, output;
    char userOperator;
    

    Scanner input = new Scanner(System.in);

    //getting first number
    System.out.println("Enter the first number");
    num_one = input.nextDouble();

    //getting the userOperator
    System.out.println("Choose an userOperator: +, -, *, or /");
    userOperator = input.next().charAt(0);

    //getting second number
    System.out.println("Enter second number");
    num_2 = input.nextDouble();

    switch (userOperator) {

      // do addition
      case '+':
        output = num_one + num_2;
        System.out.println(num_one + " + " + num_2 + " = " + output);
        break;

      // do subtraction
      case '-':
        output = num_one - num_2;
        System.out.println(num_one + " - " + num_2 + " = " + output);
        break;

      // do multiplication
      case '*':
        output = num_one * num_2;
        System.out.println(num_one + " * " + num_2 + " = " + output);
        break;

      // do division
      case '/':
        output = num_one / num_2;
        System.out.println(num_one + " / " + num_2 + " = " + output);
        break;

      default:
        System.out.println("Invalid userOperator!");
        break;
    }

    input.close();
  }
}
