import java.util.*;

abstract class Vehicle {
    int hours;

    Vehicle(int hours) {
        this.hours = hours;
    }

    abstract double calculateCharge();
    abstract String getType();
}

class Bike extends Vehicle {
    Bike(int hours) {
        super(hours);
    }

    double calculateCharge() {
        return hours * 10.0;
    }

    String getType() {
        return "BIKE";
    }
}

class Car extends Vehicle {
    Car(int hours) {
        super(hours);
    }

    double calculateCharge() {
        return 30 + (hours - 1) * 20.0;
    }

    String getType() {
        return "CAR";
    }
}

class Truck extends Vehicle {
    Truck(int hours) {
        super(hours);
    }

    double calculateCharge() {
        return Math.max(hours * 50.0, 100);
    }

    String getType() {
        return "TRUCK";
    }
}

public class Parking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            int hours = sc.nextInt();

            Vehicle vehicle;

            switch (type) {
                case "BIKE":
                    vehicle = new Bike(hours);
                    break;
                case "CAR":
                    vehicle = new Car(hours);
                    break;
                case "TRUCK":
                    vehicle = new Truck(hours);
                    break;
                default:
                    System.out.println("Invalid vehicle type");
                    return;
            }

            double charge = vehicle.calculateCharge();
            System.out.printf("%s: %.2f%n",
                    vehicle.getType(), charge);

            total += charge;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}