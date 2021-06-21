package work51;


import java.util.Scanner;

public class Task51 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = "Отака фігня, малята, лисичка з'їла колобка!";

        System.out.println("Enter \"y\" if you want to use default string\n or enter your own string");

        String lstr = sc.nextLine();

        if(!lstr.equalsIgnoreCase("y")){
            str = lstr;
        }

        int len  = str.length();
        int half_len = len / 2;

        String new_str = str.substring(half_len);

        System.out.println(new_str);
    }
}
