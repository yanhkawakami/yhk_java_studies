public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2){
        long firstRounded = (long) (num1 * 1000);
        System.out.println("firstRounded: " + firstRounded);
        long secondRounded = (long) (num2 * 1000);
        System.out.println("secondRounded: " + secondRounded);
        return firstRounded == secondRounded;
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.176));
    }
}