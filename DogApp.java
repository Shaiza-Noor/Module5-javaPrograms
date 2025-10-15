// Dog class 
class Dog {
    String name;
    String breed;
    int age;

    // Constructor
    Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // Method
    void bark() {
        System.out.println(name + " barks loudly! Woof!");
    }
}

// Main class (public) → filename must be DogApp.java
public class DogApp {
    public static void main(String[] args) {
        // Create first dog
        Dog dog1 = new Dog("Buddy", "Labrador", 3);

        // Create second dog
        Dog dog2 = new Dog("Bella", "Beagle", 2);

        // Call bark() for both dogs
        dog1.bark();
        dog2.bark();
    }
}
