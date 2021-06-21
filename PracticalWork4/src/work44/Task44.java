package work44;

public class Task44 {
    public static void main(String[] args) {
        int digit = 1;
        int i = 0;

        while(digit<=300 && i < 10){
            if(digit % 3 == 0 || digit % 4 == 0) {
                System.out.println(digit);
                i++;
            }

            digit++;
        }

    }
}
