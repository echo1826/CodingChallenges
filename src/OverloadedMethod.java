public class OverloadedMethod {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(1));
        System.out.println(convertToCentimeters(5, 8));
    }

    public static double convertToCentimeters(int inches) {
        return inches / 0.39370d;
    }

    public static double convertToCentimeters(int feet, int inches) {
        int totalInches = feet * 12 + inches;
        return convertToCentimeters(totalInches);
    }
}
