public class IDCard {

    String name;
    int booksIssued;

    IDCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }

    public static void main(String[] args) {

        IDCard ravi = new IDCard("Ravi", 0);

        IDCard duplicate = ravi;

        duplicate.booksIssued = 3;

        System.out.println(
                "Ravi's booksIssued (via first variable): "
                + ravi.booksIssued);

        System.out.println(
                "duplicate == ravi: " + (duplicate == ravi));

        IDCard separate = new IDCard("Ravi", 3);

        System.out.println(
                "separate == ravi: " + (separate == ravi));
    }
}