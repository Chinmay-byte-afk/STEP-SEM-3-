import java.util.*;

abstract class Question {
    String correctAnswer;
    String studentAnswer;
    double points;

    Question(String correctAnswer, String studentAnswer, double points) {
        this.correctAnswer = correctAnswer;
        this.studentAnswer = studentAnswer;
        this.points = points;
    }

    abstract double grade();
    abstract String getType();
}

class MCQQuestion extends Question {
    MCQQuestion(String correctAnswer, String studentAnswer, double points) {
        super(correctAnswer, studentAnswer, points);
    }

    double grade() {
        return correctAnswer.equals(studentAnswer) ? points : 0;
    }

    String getType() {
        return "MCQ";
    }
}

class TFQuestion extends Question {
    TFQuestion(String correctAnswer, String studentAnswer, double points) {
        super(correctAnswer, studentAnswer, points);
    }

    double grade() {
        return correctAnswer.equals(studentAnswer) ? points : 0;
    }

    String getType() {
        return "TF";
    }
}

class EssayQuestion extends Question {
    EssayQuestion(String correctAnswer, String studentAnswer, double points) {
        super(correctAnswer, studentAnswer, points);
    }

    double grade() {
        String[] keywords = correctAnswer.toLowerCase().split(",");
        String answer = studentAnswer.toLowerCase();
        int matches = 0;

        for (String keyword : keywords) {
            if (answer.contains(keyword.trim())) {
                matches++;
            }
        }

        if (matches >= 2) {
            return points * 0.75;
        } else if (matches == 1) {
            return points * 0.50;
        }

        return 0;
    }

    String getType() {
        return "ESSAY";
    }
}

public class Grader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        double total = 0;

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split("\"");

            String type = parts[0].trim().split("\\s+")[0];
            String questionText = parts[1];
            String correctAnswer = parts[3];
            String studentAnswer = parts[5];
            double points = Double.parseDouble(parts[6].trim());

            Question question;

            switch (type.toUpperCase()) {
                case "MCQ":
                    question = new MCQQuestion(
                        correctAnswer, studentAnswer, points
                    );
                    break;
                case "TF":
                    question = new TFQuestion(
                        correctAnswer, studentAnswer, points
                    );
                    break;
                case "ESSAY":
                    question = new EssayQuestion(
                        correctAnswer, studentAnswer, points
                    );
                    break;
                default:
                    System.out.println("Invalid question type");
                    return;
            }

            double score = question.grade();
            System.out.printf("%s: %.2f%n", question.getType(), score);
            total += score;
        }

        System.out.printf("Total Score: %.2f%n", total);
        sc.close();
    }
}