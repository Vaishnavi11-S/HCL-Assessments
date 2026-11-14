import java.util.*;
interface Payment {
    double calculateFee(double amount);
}
class CreditCardPayment implements Payment {
    @Override
    public double calculateFee(double amount) {
        return amount * 2 / 100;
    }
}
class UpiPayment implements Payment {
    @Override
    public double calculateFee(double amount) {
        return amount * 0.5 / 100;
    }
}
class WalletPayment implements Payment {
    @Override
    public double calculateFee(double amount) {
        return amount * 1 / 100;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int paymentType = sc.nextInt();
        double paymentAmount = sc.nextDouble();
        Payment p;
        if (paymentType == 1) {
            p = new CreditCardPayment();
        } else if (paymentType == 2) {
            p = new UpiPayment();
        } else {
            p = new WalletPayment();
        }
        double fee = p.calculateFee(paymentAmount);
        double finalAmount = paymentAmount + fee;
        System.out.printf("Payment Amount: %.2f%n", paymentAmount);
        System.out.printf("Transaction Fee: %.2f%n", fee);
        System.out.printf("Final Amount: %.2f%n", finalAmount);
        sc.close();
    }
}
