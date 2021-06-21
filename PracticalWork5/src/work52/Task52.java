package work52;


public class Task52 {
    public static void main(String[] args) {

        String str = "Alfa Bank Ukraine";

        int first_space = str.indexOf(' ');
        int last_space = str.lastIndexOf(' ');

        String  abbreviation = String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(first_space + 1)) +
                String.valueOf(str.charAt(last_space + 1));

        System.out.println(str);

        System.out.println(abbreviation);
    }
}
