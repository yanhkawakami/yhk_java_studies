public class IntEqualityPrinter {
    public static void printEqual(int var1, int var2, int var3){
        if ((var1 < 0) || (var2 < 0) || (var3 < 0)){
            System.out.print("Invalid Value");
        }
        else {
            if ((var1 == var2) && (var2 == var3)){
                System.out.print("All numbers are equal");
            }
            else if ((var1 != var2) && (var1 != var3) && (var2 != var3)){
                System.out.print("All numbers are different");
            }
            else {
                System.out.print("Neither all are equal or different");
            }
        }
    }

    public static void main(String[] args) {
        printEqual(1,1,3);
    }
}