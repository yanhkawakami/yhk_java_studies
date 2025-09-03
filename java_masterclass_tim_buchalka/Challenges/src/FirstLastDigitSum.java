public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit (int number) {
        if (number < 0){
            return -1;
        }

        int lastDigit = number % 10;
        int firstDigit = 0;

        while (number > 0) {
            firstDigit = number;
            number = number / 10;
        }

        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(102));
        System.out.println(sumFirstAndLastDigit(1008182));
    }
}