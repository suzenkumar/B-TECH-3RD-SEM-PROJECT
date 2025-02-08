/** Demonstrate Bitwise operators || Exp-6||Exp Date:- 29/07/24||**/
class BitwiseOperator {
    public static void main(String args[]) {
        int a = 11, b = 13, c, d, e, f;

        c = a & b;        // Bitwise AND
        d = a | b;        // Bitwise OR (changed `!` to `|`)
        e = a ^ b;        // Bitwise XOR
        f = ~a;           // Bitwise NOT (removed backtick)

        System.out.println("a & b = " + c);
        System.out.println("a | b = " + d);
        System.out.println("a ^ b = " + e);
        System.out.println("~a = " + f);
    }
}

