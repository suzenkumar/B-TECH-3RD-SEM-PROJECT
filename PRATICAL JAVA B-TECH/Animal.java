/** Demonstrate  single inheritance|| Exp-3||Exp Date:- 02/09/24||**/
**Animal.java**
```java
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
**Dog.java**
```java
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("The dog is barking.");
    }
}
**Main.java**
```java
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Max");

        dog.eat();
        dog.sleep();
        dog.bark();
    }
}