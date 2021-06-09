package work33;

public class Task33 {
    public static void main(String[] args) {
        double price = 830.0;
        double perMinus = 13.0;
        double perPlus = 7.0;

        double newPrice  = price * (1 - perMinus / 100);
        newPrice = newPrice * (1 + perPlus / 100);

        //System.out.println(newPrice);
        System.out.printf("price -> %.2f $", newPrice);


    }
}
