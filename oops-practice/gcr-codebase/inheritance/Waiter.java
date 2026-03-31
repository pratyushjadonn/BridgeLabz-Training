package Inheritance;

public class Waiter extends Customer implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Waiter serves food and assists customers.");
    }

}
