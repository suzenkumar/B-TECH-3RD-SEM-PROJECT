/** Enter a number and display its sequare class and object || Exp-12||Exp Date:- 12/08/24||**/
```java
import java.util.Scanner;

public class Square {
    private int number;

    public Square(int number) {
        this.number = number;
    }

    public int getSquare() {
        return number * number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        Square square = new Square(userInput);

        System.out.println("The square of " + userInput + " is " + square.getSquare());
    }
}