package work42;

import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit -> ");
        int digit = sc.nextInt();

        if (digit == 1){
            System.out.println("One");
        }else if(digit == 2) {
            System.out.println("Two");
        }else if(digit == 3) {
            System.out.println("Three");
        }else if(digit == 4) {
            System.out.println("Four");
        }else if(digit == 5) {
            System.out.println("Five");
        }else if(digit == 6) {
            System.out.println("Six");
        }else if(digit == 7) {
            System.out.println("Seven");
        }else if(digit == 8) {
            System.out.println("Eight");
        }else if(digit == 9) {
            System.out.println("Nine");
        }else{
            System.out.println("Other");
        }

        // variant 2
        System.out.println("variant with case:");

        switch (digit){
            case 1: System.out.println("One"); break;
            case 2: System.out.println("Two"); break;
            case 3: System.out.println("Three"); break;
            case 4: System.out.println("Four"); break;
            case 5 :System.out.println("Five"); break;
            case 6: System.out.println("Six"); break;
            case 7: System.out.println("Seven"); break;
            case 8: System.out.println("Eight"); break;
            case 9: System.out.println("Nine"); break;
            default: System.out.println("Other");
        }
    }
}
