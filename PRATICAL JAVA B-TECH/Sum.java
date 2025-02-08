/** Enter a number display sum of digits || Exp-11||Exp Date:- 12/08/24||**/
import java.util.Scanner;

class Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        int n = sc.nextInt(); // Declare and initialize n with user input
        int sum = 0, d;       // Declare sum and digit variable d

        while (n > 0) {
            d = n % 10;       // Get the last digit of n
            sum = sum + d;    // Add the digit to sum
            n = n / 10;       // Remove the last digit from n
        }

        System.out.println("Sum of digits = " + sum);
        sc.close();           // Close the scanner to avoid resource leak
    }
}


