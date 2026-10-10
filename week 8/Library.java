import java.time.*;
import java.util.*;

abstract class LibraryItem {
    String title;

    LibraryItem(String title) {
        this.title = title;
    }

    abstract int getLoanDays();
}

class BookItem extends LibraryItem {
    BookItem(String title) {
        super(title);
    }

    int getLoanDays() {
        return 14;
    }
}

class DVDItem extends LibraryItem {
    DVDItem(String title) {
        super(title);
    }

    int getLoanDays() {
        return 7;
    }
}

class MagazineItem extends LibraryItem {
    MagazineItem(String title) {
        super(title);
    }

    int getLoanDays() {
        return 3;
    }
}

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        LocalDate currentDate = LocalDate.of(2023, 10, 26);

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            String type = line.substring(0, line.indexOf(' '));
            String title = line.substring(line.indexOf(' ') + 1).trim();

            if (title.startsWith("\"") && title.endsWith("\"")) {
                title = title.substring(1, title.length() - 1);
            }

            LibraryItem item;

            switch (type.toUpperCase()) {
                case "BOOK":
                    item = new BookItem(title);
                    break;
                case "DVD":
                    item = new DVDItem(title);
                    break;
                case "MAGAZINE":
                    item = new MagazineItem(title);
                    break;
                default:
                    System.out.println("Invalid item type");
                    return;
            }

            LocalDate dueDate = currentDate.plusDays(item.getLoanDays());
            System.out.println(item.title + ": " + dueDate);
        }

        sc.close();
    }
}