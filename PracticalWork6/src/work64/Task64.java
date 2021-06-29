package work64;

import java.util.Scanner;

public class Task64 {
    public static void main(String[] args) {

        System.out.println(convertDecimalToBinary(getNumber()));
    }

    public static String convertDecimalToBinary(int number){

        String result = "";

        do{
            int digit = number % 2;
            result  = digit + result;
            number /= 2;
        }while (number > 0);

        return result;
    }

    public static int getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of word -> ");
        int num = sc.nextInt();
        if(num > 0){
            return num;
        }
        System.out.println("ERROR");

        return 0;
    }
}
