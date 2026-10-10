import java.util.Scanner;

public class MovieReviewWordLengthProfiler {

    public static void classifyWordLengths(String review) {

        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        String[] words = review.trim().split("\\s+");

        if (review.trim().isEmpty()) {
            System.out.println("Short: 0 | Medium: 0 | Long: 0");
            return;
        }

        for (String word : words) {

            int length = word.length();

            if (length >= 1 && length <= 4) {
                shortWords++;
            } else if (length >= 5 && length <= 8) {
                mediumWords++;
            } else {
                longWords++;
            }
        }

        System.out.println(
            "Short: " + shortWords
            + " | Medium: " + mediumWords
            + " | Long: " + longWords
        );
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a movie review:");

        String review = scanner.nextLine();

        classifyWordLengths(review);

        scanner.close();
    }
}