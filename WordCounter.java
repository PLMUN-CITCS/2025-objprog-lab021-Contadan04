import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence;

        while (true) {
            System.out.print("\nEnter a sentence: ");
            sentence = scanner.nextLine().trim();

            if (sentence.isEmpty()) {
                System.out.println("No input provided. Exiting program.");
                break;
            }

            int wordCount = countWords(sentence);
            System.out.println("The sentence has " + wordCount + " words.");
        }

        scanner.close();
    }

    // Method to count words in a sentence
    private static int countWords(String sentence) {
        if (sentence.isEmpty()) {
            return 0;
        }

        // Split the sentence by whitespace and count the elements in the array
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
}
