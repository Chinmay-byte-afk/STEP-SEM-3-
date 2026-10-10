public class Attendance {

    private String[] students;
    private int count;

    public Attendance(int capacity) {
        students = new String[capacity];
        count = 0;
    }

    public void markPresent(String name) {
        if (isPresent(name)) {
            return;
        }

        if (count < students.length) {
            students[count] = name;
            count++;
        } else {
            System.out.println("Attendance sheet is full");
        }
    }

    public int getPresentCount() {
        return count;
    }

    public boolean isPresent(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i].equals(name)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Attendance sheet = new Attendance(30);

        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");

        System.out.println("Present count: "
                + sheet.getPresentCount());

        System.out.println("Ben present: "
                + sheet.isPresent("Ben"));

        System.out.println("Chen present: "
                + sheet.isPresent("Chen"));
    }
}