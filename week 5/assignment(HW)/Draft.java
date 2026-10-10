import java.util.Arrays;

public class Draft implements Comparable<Draft> {

    private String name;
    private int matchesPlayed;
    private double battingAverage;
    private boolean injured;

    public Draft(String name, int matchesPlayed,
                 double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }

    static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }

    @Override
    public int compareTo(Draft other) {
        return Double.compare(
            other.battingAverage,
            this.battingAverage
        );
    }

    static String draftAndRank(Draft[] players) {
        Draft[] draftable = new Draft[players.length];
        int count = 0;

        for (Draft player : players) {
            if (isDraftable(player.matchesPlayed)
                    || isDraftable(player.matchesPlayed,
                                   player.injured)) {
                draftable[count++] = player;
            }
        }

        draftable = Arrays.copyOf(draftable, count);
        Arrays.sort(draftable);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < draftable.length; i++) {
            if (i > 0) {
                result.append(" | ");
            }

            result.append(i + 1)
                  .append(". ")
                  .append(draftable[i].name);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Draft[] players = {
            new Draft("Virat", 15, 48.0, false),
            new Draft("Rahul", 7, 55.0, false),
            new Draft("Sameer", 3, 60.0, false),
            new Draft("Dev", 12, 20.0, true)
        };

        System.out.println(draftAndRank(players));
    }
}