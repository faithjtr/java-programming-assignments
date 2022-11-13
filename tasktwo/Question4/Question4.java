package Question4;

public class Question4 {

    // main method
    public static void main(String[] args) {

        String word1, word2;
        // calling a static method
        word1 = "Hello ";
        word2 = findWord2();

        // using non-static method
        Question4 greting = new Question4();
        greting.printGreeting(word1, word2);
    }

    // static
    static String findWord2() {
        String wordII = "World!";
        return wordII;
    }

    // non static
    void printGreeting(String wordA, String word2) {
        System.out.println(wordA + word2);
    }
}