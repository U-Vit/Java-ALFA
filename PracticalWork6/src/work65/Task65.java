package work65;

import java.util.Scanner;

public class Task65 {
    public static void main(String[] args) {
        printPyramid(getNumber());
    }
    public static void printPyramid(int height){
        int level = 1;

        while (level <= height){
            printSpace(height - level);
            printNum(level);
            System.out.println("");

            level++;
        }


    }

    static void printSpace(int num){
        int value = 0;
        while (value < num){
            System.out.print(" ");
            value++;
        }
    }

    static void printNum (int level){
        int value = 1;
        while (value <= level){
            System.out.print(value);
            value++;
        }
    }

    public static int getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of word -> ");
        int num = sc.nextInt();
        if(num > 0 && num < 10){
            return num;
        }
        System.out.println("ERROR");

        return 0;
    }
}
