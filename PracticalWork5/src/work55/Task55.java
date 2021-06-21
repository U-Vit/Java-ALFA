package work55;

public class Task55 {
    public static void main(String[] args) {

        String str = "football";
        int i = 0;

        while (i < str.length()){

            char chr  = str.charAt(i);

            if(str.indexOf(chr) == str.lastIndexOf(chr)){
                System.out.println(chr);
            }

            i++;
        }
    }
}
