package work53;

public class Task53 {
    public static void main(String[] args) {
        String str = "Luke I am Your Father";

        System.out.println(str);

        int first_space = str.indexOf(' ');
        int last_space = str.lastIndexOf(' ');

        String word1 = str.substring(0, first_space);
        String word2 = str.substring(last_space + 1);
        str = word2 + str.substring(first_space, last_space + 1) + word1;

        System.out.println(str);



    }
}
