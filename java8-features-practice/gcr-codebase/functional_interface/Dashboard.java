package functional_interface;
interface Vehiclee {

    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery information not available");
    }
}

class Carr implements Vehiclee {

    public void displaySpeed() {
        System.out.println("Car speed: 80 km/h");
    }
}

class ElectricCar implements Vehiclee {

    public void displaySpeed() {
        System.out.println("Electric car speed: 70 km/h");
    }

    @Override
    public void displayBattery() {
        System.out.println("Battery level: 85%");
    }
}

public class Dashboard {
    public static void main(String[] args) {

        Vehiclee v1 = new Carr();
        Vehiclee v2 = new ElectricCar();

        v1.displayBattery();
        v2.displayBattery();
    }
}
