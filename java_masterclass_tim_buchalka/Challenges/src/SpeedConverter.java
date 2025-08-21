public class SpeedConverter {
    public static long toMilesPerHour (double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }
        return Math.round((kilometersPerHour / 1.609));
    }

    public static void printConversion (double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour < 0){
            System.out.print("Invalid Value");
        }
        else {
            System.out.print(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    public static void main(String[] args) {
        printConversion(200);
    }
}