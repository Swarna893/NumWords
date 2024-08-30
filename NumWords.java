import java.util.Scanner;

public class NumWords {

    public static int countWords(String str) {
        int wordCount = 0;
        boolean isWord = false;
        int endOfLine = str.length() - 1;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Check if the current character is a letter or digit
            if ((currentChar >= 'a' && currentChar <= 'z') || 
                (currentChar >= 'A' && currentChar <= 'Z') || 
                (currentChar >= '0' && currentChar <= '9')) {
                isWord = true;
            } else if (isWord) {
                wordCount++;
                isWord = false;
            }

            // If the last character is a word, count it
            if (i == endOfLine && isWord) {
                wordCount++;
            }
        }

        return wordCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        int wordCount = countWords(input);
        System.out.println("The number of words is: " + wordCount);

        scanner.close();
    }
}
