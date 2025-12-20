package scenario.based;

import java.util.Scanner;

public class CalculateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The Coffee Counter Chronicles problem 
		Scanner sc = new Scanner(System.in);
        double gstRate = 0.07;
        while (true){
            System.out.println("Enter coffee type (expresso, latte, cappuccino) or 'exit' to quit:");
            String coffeeType = sc.nextLine().toLowerCase();
            if (coffeeType.equals("exit")) {
                break;
            }
            double price;
            switch (coffeeType) {
                case "expresso":
                    price = 120.0;
                    break;
                case "latte":
                    price = 180.0;
                    break;
                case "cappuccino":
                    price = 160.0;
                    break;
                default:
                    System.out.println("Invalid coffee type");
                    continue;
            }
            System.out.println("Enter quantity:");
            int quantity = sc.nextInt();
            sc.nextLine();
            gstRate = 0.05;
            double bill = price * quantity;
            double gst = bill * gstRate;
            double finalAmount = bill + gst;
            System.out.printf("Total Bill: Rs.%.2f\n", bill);
            System.out.printf("GST (5%%): Rs.%.2f\n", gst);
            System.out.printf("Final Amount: Rs.%.2f\n", finalAmount);
        }
		

	}

}
