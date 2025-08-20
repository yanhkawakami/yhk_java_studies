// Code that checks Remainder

public class Remainder {
    public static void main(String[] args) {
        double firstVariable = 20.00d;
        double secondVariable = 80.00d;
        double thirdVariable = (firstVariable + secondVariable) * 100.00d;
        double remainderResult = thirdVariable % 40.00d;
        boolean checkResult = (remainderResult == 0.00d) ? true : false;

        if (!checkResult) {
            System.out.println("Got some remainder!");
        };
    }
}