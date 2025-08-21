public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.print("Invalid Value");
        }
        else {
            int megabytes = kiloBytes / 1024;
            int remaining = kiloBytes % 1024;

            System.out.print(kiloBytes + " KB = " + megabytes + " MB and " + remaining + " KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(91821);
    }
}