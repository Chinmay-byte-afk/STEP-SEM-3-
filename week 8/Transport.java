import java.util.*;

abstract class TransportType {
    double distance;

    TransportType(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();
    abstract String getType();
}

class Bus extends TransportType {
    Bus(double distance) {
        super(distance);
    }

    double calculateFare() {
        return Math.min(2 + 0.10 * distance, 10);
    }

    String getType() {
        return "BUS";
    }
}

class Train extends TransportType {
    Train(double distance) {
        super(distance);
    }

    double calculateFare() {
        return 3 + 0.15 * distance;
    }

    String getType() {
        return "TRAIN";
    }
}

class Metro extends TransportType {
    double peakFactor;

    Metro(double distance, double peakFactor) {
        super(distance);
        this.peakFactor = peakFactor;
    }

    double calculateFare() {
        return (1.50 + 0.20 * distance) * peakFactor;
    }

    String getType() {
        return "METRO";
    }
}

public class Transport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            double distance = sc.nextDouble();

            TransportType transport;

            switch (type) {
                case "BUS":
                    transport = new Bus(distance);
                    break;
                case "TRAIN":
                    transport = new Train(distance);
                    break;
                case "METRO":
                    double peakFactor = sc.nextDouble();
                    transport = new Metro(distance, peakFactor);
                    break;
                default:
                    System.out.println("Invalid transport type");
                    return;
            }

            double fare = transport.calculateFare();
            System.out.printf("%s: %.2f%n", transport.getType(), fare);
            total += fare;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}