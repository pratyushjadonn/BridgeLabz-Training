package Inheritance;

public class RestaurantManagement {
	public static void main(String[] args) {
        Worker chef = new Chef("Rahul", 101);
        Worker waiter = new Waiter("Amit", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}
