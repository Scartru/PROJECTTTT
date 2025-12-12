import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Game{

    private Map map;
    private Player player;
    private Clown clown;
    private boolean status = true;
    private int counter = 0;

    /**
     * Game constructor which initializes a new map, player in specified room, and a clown in a specified room
     */
    public Game(){
        this.map = new Map();
        this.player = new Player("Player", map.getRoom(0));
        this.clown = new Clown("Clown", map.getRoom(9));
    }

    /**
     * moves player
     * @param direction player moves to
     */
    public void move(Direction direction){
        player.moveTo(direction, map);
    }

    /**
     * drops an object in room player is in
     * @param object that will be dropped
     */
    public void drop(String object){
        player.playerDrop(object, player.getRoom());
    }

    /**
     * grabs an object from the room player is in
     * @param object that will be grabbed from the room player is in
     */
    public void grab(String object){
        player.playerGrab(object);
    }

    /**
     * Unlocks door 
     * @param door to be unlocked
     * @param keyName that is connected with door
     */
    public void unlockDoor(Door door, String keyName){
        door.unlock(keyName, map, player.getRoom(), player.getInventory());
    }

    /**
     * returns door as string?
     * @param doorName
     * @return !!!!!!!!!!!!!!!!!!!!!!!!!
     */
    public Door stringToDoor(String doorName){
        return UserInput.stringToDoorWithoutMap(doorName, map);
    }

    /**
     * runs game
     * @param args 
     * @throws IOException !!!!!!!!!!!!!!!!!
     */
    public void main(String[] args) throws IOException{
        // Game game = new Game();
        run(this);
    }

    /**
     * @param br
     * @param game
     * @throws IOException !!!!!!!!!!!!!!!
     */
    public static void waitingForWords(BufferedReader br, Game game)throws IOException{
        String input;
        // String output;


            System.out.print("*** ");
            input = br.readLine();
            UserInput.runCommand(input, game);
            // System.out.println(output);
    }

    /**
     * runs game 
     * @param game constructed
     * @throws IOException
     */
    public void run(Game game) throws IOException{
        boolean stillPlaying = true;
        BufferedReader in;
        in = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("A clown is looking for you... Escape!!!");
        
        do {
            Room currentRoom = player.getRoom();
            System.out.println(currentRoom.getDescription());
            waitingForWords(in, game);
            clown.moveRandomly(map);

            /**
             * If clown is in the same room with the player...
             * 1st time = warns player
             * 2nd time = clown catches player and sets status to false and ends game
             */
            if(counter == 0){
                if(player.getRoom() == clown.getRoom()) {
                        counter = 1;
                        System.out.println("UH OH! The clown is also in room " + clown.getRoom()+" with you. RUN!");
                    }else{
                        counter = 0;
                    }
                }else{
                    System.out.println("The clown caught you hahaahahah");
                    stillPlaying = false;
                    status = false;
                }
            //if Player makes it to the sewers (final room) game is finished
            if(player.getRoom().getName().equals("19")){
                stillPlaying = false;
            }
        } while (stillPlaying);
        
         // checks if status is true, player is alive and wins, or false, player was caught and loses
        if (status == true){
            System.out.println("Congrats YOU WIN! You escaped and live to see another day hopefully! :D");
        }else { 
            System.out.println("Game Over...");
        }
    }
}


