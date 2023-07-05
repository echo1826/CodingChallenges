public class EqualSumChecker {
    /*Write a method hasEqualSum with 3 parameters of type int.

The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to
 the third parameter. Otherwise, return false.*/

    public static boolean hasEqualSum(int one, int two, int three) {
        int sum = one + two;
        if(sum == three) {
            return true;
        }
        return false;
    }
}
