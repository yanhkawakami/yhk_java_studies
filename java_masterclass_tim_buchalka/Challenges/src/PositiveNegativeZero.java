public class PositiveNegativeZero {
    public static void checkNumber (int number){
        if (number == 0) {
            System.out.print("zero");
        }
        else if (number > 0) {
            System.out.print("positive");
        }
        else {
            System.out.print("negative");
        }
    }

    public static void main(String[] args) {
        checkNumber(10);
    }
}