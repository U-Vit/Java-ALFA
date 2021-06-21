package work54;

public class Task54 {
    public static void main(String[] args) {
        String str1 = "Cartoon", str2 = "Tomcat";
        int i = 0;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        System.out.println(str1);
        System.out.println(str2);

        while(i < str1.length()){

            int j = 0;
            char chr = str1.charAt(i);

            while(j < str2.length()){

                if(chr == str2.charAt(j)){
                    break;
                }
                else if (j == str2.length() - 1) {

                    System.out.println(chr);
                }
                j++;
            }

            i++;
        }


    }
}
