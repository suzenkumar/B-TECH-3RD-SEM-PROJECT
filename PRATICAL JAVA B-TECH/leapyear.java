/** Wheather a year is leapyear or not || Exp-9||Exp Date:- 12/08/24||**/
class LeapYear {
    public static void main(String args[]) {
        int year = 2005;

        if (year % 4 == 0) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not a leap year");
        }
    }
}
