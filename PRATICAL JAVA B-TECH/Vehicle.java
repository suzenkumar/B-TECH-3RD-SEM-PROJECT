/** Demonstrate single inheritance first part || Exp-14|Exp Date:- 02/09/24||**/
// Base class
public class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}
