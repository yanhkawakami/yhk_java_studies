public class EvenDigitSum {
    public static int getEvenDigitSum (int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            int actualDigit = number % 10;
            if ((actualDigit % 2) == 0) {
                sum += actualDigit;
            }
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(12));
        System.out.println(getEvenDigitSum(-12));
        System.out.println(getEvenDigitSum(12345678));
    }
}