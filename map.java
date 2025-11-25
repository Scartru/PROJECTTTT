public class map {
    private static int[][] map = {
        {1, 1, 0, 1, 0},
        {0, 1, 0, 0, 0},
        {0, 1, 1, 1, 0},
        {0, 0, 0, 1, 1},
        {0, 1, 0, 0, 1}
    };
    private int x;
    private int y;
    private static Scanner scanner = new Scanner(System.in);

    public boolean movePlayer(String direction) {

        if(direction.equalsTo("South")){
            y++;
        } else if(direction.equalsTo("North")){
            y--;
        } else if(direction.equalsTo("East")){
            x++;
        } else if(direction.equalsTo("West")){
            x--;
        } else {
            System.print.ln("that direction is not valid");
        }
    }
}



