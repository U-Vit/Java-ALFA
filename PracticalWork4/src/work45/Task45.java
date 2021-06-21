package work45;

public class Task45 {
    public static void main(String[] args) {

        int row = 1;
        int col = 1;

        System.out.print("* |");

        while(col < 10){
            System.out.printf("%3d", col);
            col++;
        }

        System.out.println();

        while (col > 0){
            System.out.print("___");
            col--;
        }
        col = 1;
        System.out.println();

        while (col < 10){

            System.out.print(col + " |");
            while (row < 10){

                System.out.printf("%3d", col * row);
                row++;
            }
            System.out.print("\n");
            row = 1;
            col++;
        }
    }
}
