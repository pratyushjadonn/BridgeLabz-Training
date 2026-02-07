package functional_interface;
interface PaymentProcessor {

    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Refund of " + amount + " processed using standard policy.");
    }
}

class Paytm implements PaymentProcessor {

    public void processPayment(double amount) {
        System.out.println("Paytm payment of " + amount + " successful");
    }
}

class Razorpay implements PaymentProcessor {

    public void processPayment(double amount) {
        System.out.println("Razorpay payment of " + amount + " successful");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Razorpay refund of " + amount + " initiated");
    }
}

public class PaymentApp {
    public static void main(String[] args) {

        PaymentProcessor p1 = new Paytm();
        PaymentProcessor p2 = new Razorpay();

        p1.refund(500);
        p2.refund(500);
    }
}

