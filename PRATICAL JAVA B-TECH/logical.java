/** Demonstrate use of Logical operators || Exp-4||Exp Date:- 29/07/24||**/
class Logical {
    public static void main(String args[]) {
        int a = 3, b = 4, c = 7, d = 1;
        boolean r1, r2, r3;

        r1 = (a < b) && (c == d);     // Correct logical AND operation
        r2 = (a < c) || (b <= d);     // Fixed syntax for logical OR
        r3 = !(c == d);               // Corrected syntax for NOT operation

        System.out.println("Result 1 = " + r1);
        System.out.println("Result 2 = " + r2);
        System.out.println("Result 3 = " + r3);
    }
}

