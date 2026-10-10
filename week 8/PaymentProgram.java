import java.util.*;

abstract class Payment {
    protected double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract double calculateAmount();

    String getType() {
        return "";
    }
}

class CardPayment extends Payment {
    CardPayment(double amount) {
        super(amount);
    }

    @Override
    double calculateAmount() {
        return amount * 1.02;
    }

    @Override
    String getType() {
        return "CARD";
    }
}

class WalletPayment extends Payment {
    WalletPayment(double amount) {
        super(amount);
    }

    @Override
    double calculateAmount() {
        return amount * 1.01;
    }

    @Override
    String getType() {
        return "WALLET";
    }
}

class BankTransferPayment extends Payment {
    BankTransferPayment(double amount) {
        super(amount);
    }

    @Override
    double calculateAmount() {
        return amount;
    }

    @Override
    String getType() {
        return "BANKTRANSFER";
    }
}

public class PaymentProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Payment[] payments = new Payment[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            double amount = sc.nextDouble();

            switch (type) {
                case "CARD":
                    payments[i] = new CardPayment(amount);
                    break;
                case "WALLET":
                    payments[i] = new WalletPayment(amount);
                    break;
                case "BANKTRANSFER":
                    payments[i] = new BankTransferPayment(amount);
                    break;
                default:
                    System.out.println("Invalid payment type");
                    return;
            }
        }

        for (Payment p : payments) {
            double result = p.calculateAmount();
            System.out.printf("%s: %.2f%n", p.getType(), result);
            total += result;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}