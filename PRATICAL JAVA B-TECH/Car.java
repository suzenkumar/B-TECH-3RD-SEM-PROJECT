/** Demonstrate single inheritance middle part || Exp-14|Exp Date:- 02/09/24||**/
// Derived class
public class Car extends Vehicle {
    private String model;

    public Car(String brand, String model) {
        super(brand);  // Call the constructor of the base class
        this.model = model;
    }

    public void displayModel() {
        System.out.println("Model: " + model);
    }
}
