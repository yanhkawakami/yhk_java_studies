public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays (long minutes){
        if (minutes < 0){
            System.out.print("Invalid Value");
        }
        else {
            int hours = (int) minutes/60;
            int days = (int) hours/24;
            int years = (int) days/365;
            int remainderDays = (int) days%365;
            System.out.print(minutes + " min = " + years + " y and " + remainderDays + " d");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(1051200);
    }
}