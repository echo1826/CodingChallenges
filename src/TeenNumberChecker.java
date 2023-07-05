public class TeenNumberChecker {
    /*We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).

Write a method named hasTeen with 3 parameters of type int.

The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19
(inclusive). Otherwise return false.


Write another method named isTeen with 1 parameter of type int.

The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19
(inclusive). Otherwise return false.

*/

    public static void main(String[] args) {
        hasTeen(18, 18, 0);
    }

    public static boolean hasTeen(int one, int two, int three) {
        boolean first = isTeen(one);
        boolean second = isTeen(two);
        boolean third = isTeen(three);
        if(first || second || third) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int one) {
        if (one >= 13 && one <= 19) {
            return true;
        }
        return false;
    }
}
