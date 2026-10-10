public class TypingSpeedAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {

        if (original.length() != typed.length()) {
            System.out.println(
                "Error: Both strings must have equal lengths."
            );
            return;
        }

        int matched = 0;
        int firstMismatch = -1;

        for (int i = 0; i < original.length(); i++) {

            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatch == -1) {
                firstMismatch = i;
            }
        }

        double accuracy = 0.0;

        if (original.length() > 0) {
            accuracy = (matched * 100.0) / original.length();
        }

        System.out.printf(
            "Matched: %d/%d | Accuracy: %.2f%%",
            matched, original.length(), accuracy
        );

        if (firstMismatch == -1) {
            System.out.println(" | No Mismatches");
        } else {
            System.out.printf(
                " | First Mismatch at position %d ('%c' vs '%c')%n",
                firstMismatch + 1,
                original.charAt(firstMismatch),
                typed.charAt(firstMismatch)
            );
        }
    }

    public static void main(String[] args) {

        checkTypingAccuracy("hello world", "hello worlt");

        checkTypingAccuracy("coding", "coding");
    }
}