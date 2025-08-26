public class AreaCalculator {
    public static double area (double x, double y){
        if ((x < 0) || (y < 0)){
            return -1.0;
        }
        return x * y;
    }

    public static double area (double radius){
        if (radius < 0.0){
            return -1.0;
        }
        return radius * radius * Math.PI ;
    }

    public static void main(String[] args) {
        System.out.print(area(1.0, 2.0));
        System.out.print(area(5.0));
    }
}