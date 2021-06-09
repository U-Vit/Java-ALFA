package work24;

public class Task24 {
    public static void main(String[] args) {
        int num = 654;
        int digit_1 = num % 10;
        int digit_2 = num / 10 % 10;
        int digit_3 = num /100;

        int newNum = digit_1 * 100 + digit_2 * 10 + digit_3;

        System.out.println("first number = " + num + "\nnew number = " + newNum);
        System.out.println(newNum + " - " + num + " = " + (newNum - num));

    }
}
