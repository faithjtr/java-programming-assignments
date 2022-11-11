package taskone;

//importting Scanner
import java.util.Scanner;

public class QuestionThree {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Test divisibility by 0 - 9 :");
        int data;
        data = input.nextInt();//user input

        // calling the methods
        checkZero(data);
        checkOne(data);
        checkTwo(data);
        checkThree(data);
        checkFour(data);
        checkFive(data);
        checkSix(data);
        checkSeven(data);
        checkEight(data);
        checkNine(data);
    }

    //to test 0
    static void checkZero(int data_argument) {
        System.out.println(data_argument + " can't be divisible by 0.");
    }

    //to test 1
    static void checkOne(int data_argument) {
        System.out.println(data_argument + " is divisible by 1.");
    }

    //to test 2
    static void checkTwo(int data_argument) {
        if (data_argument % 2 == 0) {
            System.out.println(data_argument + " is divisible by 2.");
        } else {
            System.out.println(data_argument + " is not divisible by 2.");
        }
    }

    //to test 3
    static void checkThree(int data_argument) {
        if ((data_argument % 3) == 0) {
            System.out.println(data_argument + " is divisible by 3");
        } else {
            System.out.println(data_argument + " is not divisible by 3");
        }
    }

    //to test 4
    static void checkFour(int data_argument) {
        if ((data_argument % 4) == 0) {
            System.out.println(data_argument + " is divisible by 4");
        } else {
            System.out.println(data_argument + " is not divisible by 4");
        }
    }

    //to test 5
    static void checkFive(int data_argument) {
    if ((data_argument % 5) == 0) {
            System.out.println(data_argument + " is divisible by 5");
        } else {
            System.out.println(data_argument + " is not divisible by 5");
        }
    }

    //to test 6
    static void checkSix(int data_argument) {
        if ((data_argument % 6) == 0) {
            System.out.println(data_argument + " is divisible by 6");
        } else {
            System.out.println(data_argument + " is not divisible by 6");
        }
    }

    //to test 7
    static void checkSeven(int data_argument) {
        if ((data_argument % 7) == 0) {
            System.out.println(data_argument + " is divisible by 7");
        } else {
            System.out.println(data_argument + " is not divisible by 7");
        }
    }

    //to test 8
    static void checkEight(int data_argument) {
        if ((data_argument % 8) == 0) {
            System.out.println(data_argument + " is divisible by 8");
        } else {
            System.out.println(data_argument + " is not divisible by 8");
        }
    }

    //to test 9
    static void checkNine(int data_argument) {
        if ((data_argument % 9) == 0) {
            System.out.println(data_argument + " is divisible by 9");
        } else {
            System.out.println(data_argument + " is not divisible by 9");
        }
    }
}
