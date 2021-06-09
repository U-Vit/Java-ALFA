package work22;


public class Task22 {
    public static void main(String[] args) {

        long currentTime = System.currentTimeMillis() / 1000;

        long sec = currentTime % 60;
        currentTime = currentTime / 60;

        long minute = currentTime % 60;
        currentTime = currentTime / 60;

        long hour = currentTime % 24;
        currentTime = currentTime / 24;


        System.out.println("dd:hh:mm:ss - " + currentTime + ":" + hour + ":" + minute + ":" + sec);





    }
}