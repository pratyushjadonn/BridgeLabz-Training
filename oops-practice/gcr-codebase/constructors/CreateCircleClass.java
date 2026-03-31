package level1;
class Circle {
    private double radius;
    // Default constructor
    public Circle() {
        this.radius = 1.0; // Default radius
        displayCircleInfo();
    }
    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
        displayCircleInfo();
    }

    public void displayCircleInfo() {
        System.out.printf("Circle with radius: %.2f%n", radius);
    }
}



public class CreateCircleClass {

	public static void main(String[] args) {
		Circle circle1 = new Circle(); // Default radius
        Circle circle2 = new Circle(5.0); // User-provided radius

	}

}
