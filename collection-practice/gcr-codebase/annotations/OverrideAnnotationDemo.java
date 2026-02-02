package annotations;
//parent class
class Animal {

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

//child class
class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

//main class
public class OverrideAnnotationDemo {
    public static void main(String[] args) {

        //instantiate Dog
        Animal animal = new Dog();

        //call overridden method
        animal.makeSound();
    }
}
