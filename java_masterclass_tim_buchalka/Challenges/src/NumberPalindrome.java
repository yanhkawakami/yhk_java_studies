public class NumberPalindrome {
    public static boolean isPalindrome (int number) {
        if (number < 0) {
            number = number * (-1);
        }

        int reverse = 0;
        int numberCopy = number;

        while (numberCopy > 0){
            int lastDigit = numberCopy % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            numberCopy = numberCopy / 10;
        }

        return number == reverse;
    }

    public static void main(String[] args) {
        System.out.print(isPalindrome(122));
        System.out.print(isPalindrome(121));
    }
}