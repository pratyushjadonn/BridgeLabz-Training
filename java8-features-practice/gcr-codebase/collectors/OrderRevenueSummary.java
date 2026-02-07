package collectors;

import java.util.*;
import java.util.stream.*;

public class OrderRevenueSummary {

	static class Order {
		private String customer;
		private double amount;

		Order(String customer, double amount) {
			this.customer = customer;
			this.amount = amount;
		}

		public String getCustomer() {
			return customer;
		}

		public double getAmount() {
			return amount;
		}
	}

	public static void main(String[] args) {

		List<Order> orders = Arrays.asList(new Order("Alice", 1200), new Order("Bob", 1500), new Order("Alice", 1800),
				new Order("Bob", 1700));

		Map<String, Double> revenueByCustomer = orders.stream()
				.collect(Collectors.groupingBy(Order::getCustomer, Collectors.summingDouble(Order::getAmount)));

		revenueByCustomer.forEach((customer, total) -> System.out.println(customer + " : " + total));
	}
}
