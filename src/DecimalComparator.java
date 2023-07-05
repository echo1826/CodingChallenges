public class DecimalComparator {
    /*Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers are the same up to three decimal
places. Otherwise, return false.*/
    public static boolean areEqualByThreePlaces(double numberOne, double numberTwo) {
        numberOne = numberOne * 1000;
        numberTwo = numberTwo * 1000;

        int one = (int) numberOne;
        int two = (int) numberTwo;

        if(one == two) {
            return true;
        }
        return false;
    }
}
