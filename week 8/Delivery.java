import java.util.*;

abstract class DeliveryType {
    double weight;
    double distance;

    DeliveryType(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }

    abstract double calculateFee();
    abstract String getType();
}

class StandardDelivery extends DeliveryType {
    StandardDelivery(double weight, double distance) {
        super(weight, distance);
    }

    double calculateFee() {
        return 5 + 0.50 * weight + 0.10 * distance;
    }

    String getType() {
        return "STANDARD";
    }
}

class ExpressDelivery extends DeliveryType {
    ExpressDelivery(double weight, double distance) {
        super(weight, distance);
    }

    double calculateFee() {
        return 15 + weight + 0.20 * distance;
    }

    String getType() {
        return "EXPRESS";
    }
}

class InternationalDelivery extends DeliveryType {
    double customsFee;

    InternationalDelivery(double weight, double distance, double customsFee) {
        super(weight, distance);
        this.customsFee = customsFee;
    }

    double calculateFee() {
        return 25 + 2 * weight + 0.50 * distance + customsFee;
    }

    String getType() {
        return "INTERNATIONAL";
    }
}

public class Delivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            double weight = sc.nextDouble();
            double distance = sc.nextDouble();

            DeliveryType delivery;

            switch (type) {
                case "STANDARD":
                    delivery = new StandardDelivery(weight, distance);
                    break;
                case "EXPRESS":
                    delivery = new ExpressDelivery(weight, distance);
                    break;
                case "INTERNATIONAL":
                    double customsFee = sc.nextDouble();
                    delivery = new InternationalDelivery(
                        weight, distance, customsFee
                    );
                    break;
                default:
                    System.out.println("Invalid delivery type");
                    return;
            }

            double fee = delivery.calculateFee();
            System.out.printf("%s: %.2f%n", delivery.getType(), fee);
            total += fee;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}