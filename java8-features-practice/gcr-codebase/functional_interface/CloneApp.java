package functional_interface;
class Product implements Cloneable {

    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneApp {
    public static void main(String[] args) throws CloneNotSupportedException {

        Product p1 = new Product("Laptop", 60000);
        Product p2 = (Product) p1.clone();

        System.out.println(p1.name + " " + p1.price);
        System.out.println(p2.name + " " + p2.price);
    }
}
