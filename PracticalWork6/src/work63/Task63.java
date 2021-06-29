package work63;

import java.util.Scanner;

public class Task63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text -> ");
        String str = sc.nextLine();

        System.out.println("Enter number of word -> ");
        int num = sc.nextInt();

        System.out.println(getFirstChr(str, num));
    }

    public static char getFirstChr(String str, int numWord) {

        char chr = '\u0800';

        str = str.trim();

        if (numWord == 1) {
            return str.charAt(0);
        }

        int numSpase = 1, countWord = 1;

        while ((numSpase = str.indexOf(' ', numSpase)) != -1) {

            if (++countWord == numWord) {
                return str.charAt(numSpase + 1);
            }
            countWord++;
        }

        return chr;
    }
}
