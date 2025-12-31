package level1;
public class CreatePersonClass {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person(person1);
    }
}
class Person {
    private String name;
    private int age;
    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        displayPersonInfo();
    }
    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        displayPersonInfo();
    }
    public void displayPersonInfo() {
        System.out.printf("Name: %s, Age: %d%n", name, age);
    }
}

