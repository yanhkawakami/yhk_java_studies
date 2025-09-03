public class SharedDigit {
    public static boolean hasSharedDigit (int number1, int number2) {
        if ((number1 < 10) || (number2 < 10) || (number1 > 99) || (number2 > 99)){
            return false;
        }

        int firstDigitNumber1 = number1 / 10;
        int secondDigitNumber1 = number1 % 10;
        int firstDigitNumber2 = number2 / 10;
        int secondDigitNumber2 = number2 % 10;

        return ((firstDigitNumber1 == firstDigitNumber2) || (firstDigitNumber1 == secondDigitNumber2) ||
                (secondDigitNumber1 == firstDigitNumber2) || (secondDigitNumber1 == secondDigitNumber2));
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit (12,12));
    }
}