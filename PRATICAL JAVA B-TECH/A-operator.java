/** Demonstrate use of arithmatic operations || Exp-3||Exp Date:- 22/07/24||**/
class AOperator {
    public static void main(String args[]) {
        int a = 10;
        int b = 15;
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;  // Changed 'd' to 'b' as it should be modulus with b, not d

        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);
    }
}
