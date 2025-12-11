import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Game{

    private Map map;
    private Player player;
    private Clown clown;
    private boolean status = true;
    private int counter = 0;

    public Game(){
        this.map = new Map();
        this.player = new Player("Player", map.getRoom(0));
        this.clown = new Clown("Clown", map.getRoom(10));
    }

    public void move(Direction direction){
        player.moveTo(direction, map);
    }

    public void main(String[] args) throws IOException{
        Game game = new Game();
        System.out.println(this.player);
        game.run();
    }
        
    public void run() throws IOException{
        boolean stillPlaying = true;
        BufferedReader in;
        in = new BufferedReader(new InputStreamReader(System.in));
        String userResponse = "";
        
        // Map map = new Map();
        // Player player = new Player("Player", map.getRoom(0));
        // Clown clown = new Clown("Clown", map.getRoom(10));
        System.out.println(this.player);
        System.out.println("A clown is looking for you... Escape!!!");
            
        do { 
            Room currentRoom = player.getRoom();
            Room clownCurrentRoom = clown.getRoom();
            System.out.println("You are still playing. Follow the instructions if you want to win/lose...");
            System.out.println("check for where player is:" + currentRoom); ////check number room for now
            System.out.println(currentRoom.getDescription());
            System.out.println("check for what inventory is:" + player.getInventory()); ////check

            UserInput.waitingForWords(in, this);
            ///single player action hsappens in parsing whatever class 
            ///updates clown
            clown.moveRandomly(map);
            System.out.println("check for where clown is:" + clown.getRoom()); //// check
            
            
            if(counter == 0){
                if(player.getRoom() == clown.getRoom()) {
                        counter = 1;
                    System.out.println("the clown is smilin at cha :)");
                   
                    }else{
                        counter = 0;
                    System.out.println("check :no clown here"); ////check
                   
                    }
                }else{
                    System.out.println("The clown caught you lol");
                    stillPlaying = false;
                    status = false;
                }

        } while (stillPlaying);


        if (status == true){
            System.out.println("YAYYYYYY YOU LIVE TO SEE ANOTHER BEAUTIFUL DAY");
        }else { // win?
            System.out.println("NOOOOOOOOOOO");
        }
    }




}


