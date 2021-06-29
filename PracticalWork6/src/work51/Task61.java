package work51;

public class Task61 {
    public static void main(String[] args) {
        double a = 3, b = 4, c = 5;

        double area = areaTriangle(a,b,c);
        System.out.printf("%.2f", area);

    }

    public static double areaTriangle(double a, double b, double c){

        double halfPer = (a + b + c) / 2;
        double area = Math.sqrt(halfPer * (halfPer - a) * (halfPer - b) * (halfPer - c));
        return area;
    }
}


