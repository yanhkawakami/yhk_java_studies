public class TeenNumberCheck {
    public static boolean hasTeen (int age1, int age2, int age3){
        if ((age1 <= 19 && age1 >= 13) || (age2 <= 19 && age2 >= 13) || (age3 <= 19 && age3 >= 13)){
            return true;
        }
        return false;
    }

    public static boolean isTeen (int age1) {
        if (age1 <= 19 && age1 >= 13) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(TeenNumberCheck.hasTeen(22,22,22));
        System.out.println(TeenNumberCheck.hasTeen(22,22,17));
        System.out.println(TeenNumberCheck.isTeen(12));
    }
}