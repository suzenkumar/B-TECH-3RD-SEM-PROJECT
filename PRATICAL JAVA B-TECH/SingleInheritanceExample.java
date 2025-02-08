/** show the use of single inheritance || Exp-15|Exp Date:- 02/09/24||**/
// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class (single inheritance)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class
public class SingleInheritanceExample {
    public static void main(String args[]) {
        Dog dog = new Dog(); // Creating an object of the derived class

        // Accessing methods from both base and derived classes
        dog.eat();   // Method from Animal class
        dog.bark();  // Method from Dog class
    }
}

