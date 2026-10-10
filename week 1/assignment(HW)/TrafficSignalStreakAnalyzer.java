public class TrafficSignalStreakAnalyzer {

    public static void findLongestStreak(String signalLog) {

        if (signalLog == null || signalLog.isEmpty()) {
            System.out.println("Signal log is empty.");
            return;
        }

        char currentColor = signalLog.charAt(0);
        int currentStreak = 1;

        char longestColor = currentColor;
        int longestStreak = 1;

        for (int i = 1; i < signalLog.length(); i++) {

            char current = signalLog.charAt(i);

            if (current == currentColor) {
                currentStreak++;
            } else {
                currentColor = current;
                currentStreak = 1;
            }

            if (currentStreak > longestStreak) {
                longestStreak = currentStreak;
                longestColor = currentColor;
            }
        }

        System.out.println(
            "Longest Streak: '" + longestColor
            + "' repeated " + longestStreak + " times"
        );
    }

    public static void main(String[] args) {

        findLongestStreak("RRGGGYRR");

        findLongestStreak("RRRRYYGG");
    }
}