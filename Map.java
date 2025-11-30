import java.util.Scanner;

public class Map {
    private static int[][] map = {
        {1, 1, 0, 1, 0},
        {0, 1, 0, 1, 0},
        {1, 1, 1, 1, 0},
        {0, 0, 0, 1, 1},
        {0, 1, 0, 0, 1}
    };

    private static Scanner scanner = new Scanner(System.in);

    public void movePlayer(String direction) {

        if(direction.equals("East")){
            if (map[row][column++] == 1){
            column++;
            } else{
                System.out.println("you cannot move here");
            }
        } else if(direction.equals("West")){
            if (map[row][column--] == 1){
            column--;
            } else{
                System.out.println("you cannot move here");
            }
        } else if(direction.equals("South")){
            if (map[row++][column] == 1){
            row++;
            } else{
                System.out.println("you cannot move here");
            }
        } else if(direction.equals("North")){
            if (map[row--][column] == 1){
            row--;
            } else{
                System.out.println("you cannot move here");
            }
        } else {
            System.out.println("that direction is not valid");
        }
    }


}



