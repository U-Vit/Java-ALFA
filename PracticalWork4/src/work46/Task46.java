package work46;

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number ->");

        int number = sc.nextInt();

        number = number < 0 ? -number : number;

        int result = 0;

        while(number > 0){
            int digit = number % 10;

            result += digit * digit;

            number /= 10;
        }
        System.out.println("Resalt -> " + result);
    }
}
