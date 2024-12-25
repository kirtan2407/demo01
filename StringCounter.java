import java.util.Scanner;

public class StringCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Count characters
        int charCount = input.length();

        // Count words
        String[] words = input.trim().split("\\s+");
        int wordCount = (input.trim().isEmpty()) ? 0 : words.length;

        // Count lines (based on the presence of '\n')
        String[] lines = input.split("\\n");
        int lineCount = lines.length;

        System.out.println("Character Count: " + charCount);
        System.out.println("Word Count: " + wordCount);
        System.out.println("Line Count: " + lineCount);

        scanner.close();
    }
}
// this is string 
