package work32;

public class Task32 {
    public static void main(String[] args) {
        double percent = 12.0;
        int sum = 10_000;
        int periodMonth = 6;

        double monthPercent = percent / 12;
        double profit = sum * (monthPercent / 100) * periodMonth;

        System.out.println("Your profit -> " + profit);

    }
}
