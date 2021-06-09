package work31;

public class Task31 {
    public static void main(String[] args) {
        double gramInPound = 453.6;
        double weightInPounds = 10;
        int kg = (int)(weightInPounds * gramInPound / 1000);
        int grams = (int)(weightInPounds * gramInPound % 1000);

        System.out.println(weightInPounds + " pounds it`s:\n" + kg + " kg\n" + grams + " gr");

    }
}
