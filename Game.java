import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game { 

    private Map map;
    private Player player;
    private Clown clown;

    public Game(){
        Map map = new Map();
        Player player = new Player("Player", map.getRoom(0));
        Clown clown = new Clown("Clown", map.getRoom(10));
  
    }

    public static void main(String[] args) throws IOException{
        // boolean stillPlaying = true;
        // BufferedReader in;
        // in = new BufferedReader(new InputStreamReader(System.in));
        // String userResponse = "";

        // Map map = new Map();
        // Player player = new Player("Player", map.getRoom(0));
        // Clown clown = new Clown("Clown", map.getRoom(10));

        // System.out.println("A clown is looking for you... Escape!!!");
            
        do { 
            // Room currentRoom = player.getRoom();
            // Room clownCurrentRoom = clown.getRoom();
            System.out.println("You are still playing. Follow the instructions if you want to win/lose...");
            System.out.println("clownSameRoom?");
            // System.out.println(currentRoom.getDescription());

            UserInput.waitingForWords(in);


            ///updates clown
            // clown.moveRandomly(map);
            
            
        } while (stillPlaying);
    }




}


