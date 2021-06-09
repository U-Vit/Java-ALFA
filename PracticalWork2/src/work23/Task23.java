package work23;

public class Task23 {
    public static void main(String[] args) {
        int x = 100;
        int y = 30;

        System.out.println("x = " + x + "\ny = " + y);

        x = y + x;
        y = x - y;
        x = x - y;
        System.out.println("Міняємо місцями і отримуємо\nx = " + x + "\ny = " + y);
    }
}
