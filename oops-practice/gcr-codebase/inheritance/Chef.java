package Inheritance;

public class Chef extends Customer implements Worker {
	Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Chef prepares and cooks food.");
    }
}
