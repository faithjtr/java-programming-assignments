package Faith.taskone;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class QuestionFour {
    
    public static void main(String[] args) {
        
        //keeps numbers from 71 to 150
        List<Integer> myRangeOfNumbers = IntStream.range(71, 150).boxed().collect(Collectors.toList());
        myRangeOfNumbers.add(150);

        System.out.println("Multiples of 2 :");
        //these are the multiples of 2
        for (int i = 0; i <= myRangeOfNumbers.size(); i++) {
            if ((myRangeOfNumbers.get(i)) % 2 == 0) {
                System.out.println(myRangeOfNumbers.get(i));
            }
            var maxIndex = 150 - 71;
            if (i == maxIndex) {
                break;
            } 
        }

        System.out.println("");

        System.out.println("Multiples of 3 :");
        //these are the multiples of 3
        for (int i = 0; i <= myRangeOfNumbers.size(); i++) {
            if ((myRangeOfNumbers.get(i)) % 3 == 0) {
                System.out.println(myRangeOfNumbers.get(i));
            }
            var maxIndex = 150 - 71;
            if (i == maxIndex) {
                break;
            } 
        }

        System.out.println("");
        System.out.println("Multiples of 7 :");
        //these are the multiples of 7
        for (int i = 0; i <= myRangeOfNumbers.size(); i++) {
            if ((myRangeOfNumbers.get(i)) % 7 == 0) {
                System.out.println(myRangeOfNumbers.get(i));
            }
            var maxIndex = 150 - 71;
            if (i == maxIndex) {
                break;
            } 
        }

    }
}
