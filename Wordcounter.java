
import java.util.Scanner;

public class Wordcounter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter some text:");
            String Text = scanner.nextLine();

            String[] words = Text.split("\\s+"); // Split by whitespace

            int totalWordCount = words.length;

            System.out.println("Total word count: " + totalWordCount);

        }
    }


