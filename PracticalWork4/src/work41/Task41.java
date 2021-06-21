package work41;

import java.util.Scanner;


public class Task41 {

    public static void main(String[] args) {
        int a, b, c, res;

        System.out.println("Enter three numbers, please");

        Scanner sc = new Scanner(System.in);
        a  = sc.nextInt();
        sc = new Scanner(System.in);
        b  = sc.nextInt();
        sc = new Scanner(System.in);
        c  = sc.nextInt();

        res = a;
        if (b > res) {
            res = b;
        }
        if (c > res) {
            res = c;
        }
        System.out.println("Max Value = " + res);




    }
}
