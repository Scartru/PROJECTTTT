import java.util.*;

public class Game extends UserInput{ 

    private Map map;
    private Player player;
    private Clown clown;
    private boolean status = true;
    private int counter = 0;

    public Game(){
        Map map = new Map();
        Player player = new Player("Player", map.getRoom(0));
        Clown clown = new Clown("Clown", map.getRoom(10));
  
    }

    public static void main(String[] args){
        Game game = new Game();
        game.run();
    }
        
    public void run(){
        boolean stillPlaying = true;
        Scanner userInput = new Scanner(System.in);
        String userResponse = "";

        Map map = new Map();
        Player player = new Player("Player", map.getRoom(0));
        Clown clown = new Clown("Clown", map.getRoom(10));

        System.out.println("A clown is looking for you... Escape!!!");
            
        do { 
            Room currentRoom = player.getRoom();
            Room clownCurrentRoom = clown.getRoom();
            System.out.println("You are still playing. Follow the instructions if you want to win/lose...");
            System.out.println("clownSameRoom?");
            System.out.println(currentRoom.getDescription());

            userResponse = userInput.nextLine().toUpperCase();
            ///single player action hsappens in parsing whatever class 
            completeAction(userResponse);
            ///updates clown
            clown.moveRandomly(map);
            
            if(counter == 0){
                if(player.getRoom() == clown.getRoom()) {
                     counter = 1;
                    }else{
                        counter = 0;
                    }
                }else{
                    System.out.println("The clown caught you lol");
                    stillPlaying = false;
                    status = false;
                }

        } while (stillPlaying);

        userInput.close();

        if (status == true){
            System.out.println("YAYYYYYY YOU LIVE TO SEE ANOTHER BEAUTIFUL DAY");
        }else { // win?
            System.out.println("NOOOOOOOOOOO");
        }
    }




}


