package scenario.based;
import java.util.Scanner;
public class MetroSmartCard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the balance:");
        double balance = sc.nextDouble();
        System.out.println("Initial Smart Card Balance: ₹" + balance);
        while (balance > 0) {
            System.out.println("Enter distance(in km)/Enter -1 to quit: ");
            int distance = sc.nextInt();
            if (distance == -1) {
                break;
            }
            int fare = (distance <= 5) ? 10 :  (distance <= 15) ? 30 : 50;
            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare deducted: ₹" + fare);
                System.out.println("Remaining Balance: ₹" + balance);
            } else {
                System.out.println("Insufficient balance! Please recharge");
                break;
            }
        }

        System.out.println("\nThank you for using Metro");
    }
}
