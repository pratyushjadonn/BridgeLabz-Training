package ClassAndObject;
public class AreaOfCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        circle.calculateArea();
        circle.calculateCircumference();
    }
}
class Circle {
    private double radius;
    private final double PI = 3.1416;

    public Circle(double radius) {
        this.radius = radius;
    }
    public void calculateArea() {
        double area = PI * radius * radius;
        System.out.printf("Area of circle: %.4f%n", area);
    }
    public void calculateCircumference() {
        double circumference = 2 * PI * radius;
        System.out.printf("Circumference of circle: %.4f%n", circumference);
    }
}

