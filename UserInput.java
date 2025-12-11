//Based off of code from HuwsTube



import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class UserInput {
    Game game;

    public UserInput(Game game){
        this.game = game;
    }
    public static void parseCommand(List<String> wordlist, Game game) {
        String verb;
        String noun;
        List<String> commands = new ArrayList<>(Arrays.asList("grab", "drop", "go", "open"));
        List<String> objects = new ArrayList<>(Arrays.asList("crowbar", "key", "door", "north", "west", "east", "south"));
        
        if (wordlist.size() != 2) {
            System.out.println("Only 2 word commands allowed!");
        } else {
            verb = wordlist.get(0);
            noun = wordlist.get(1);
            if (objects.contains(noun)) {
                
                if (!commands.contains(verb)) {
                    System.out.println(verb + " is not a known verb!");
                }else{
                    completeAction(verb, noun, game);
                }
            }else{
                System.out.println(noun + " is not a known noun!");
            }
            }
            
        }
    

    public static List<String> wordList(String input) {
        String delims = " \t,.:;?!\"'";
        List<String> strlist = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(input, delims);
        String t;

        while (tokenizer.hasMoreTokens()) {
            t = tokenizer.nextToken();
            strlist.add(t);
        }
        return strlist;
    }

    public static String runCommand(String inputstr, Game game) {
        List<String> wordList;
        String ok = "ok";
        String lowstr = inputstr.trim().toLowerCase();
        
        if (!lowstr.equals("q")) {
            if (lowstr.equals("")) {
                ok = "You must enter a command";
            } else {
                wordList = wordList(lowstr);
                wordList.forEach((astr) -> System.out.println(astr));
                parseCommand(wordList, game);
            }
        }
        return ok;
    }

    //grab, drop, open, 

    public static void completeAction(String Verb, String Noun, Game game){
        String verb = Verb;
        String noun = Noun;
        System.out.println(verb);
        if (verb.equals("go")){
            if (noun.equals("north")||noun.equals("south")|| noun.equals("east")|| noun.equals("west")){
                game.move(stringToDirection(noun));
                System.out.println("You are going "+noun);
            }else{
                System.out.println("Please enter a valid direction when saying a way to go.");
            }
        }
        if (verb.equals("drop")){
            if (noun.equals("crowbar")||noun.equals("green key")||noun.equals("red key")||noun.equals("blue key")){
                System.out.println("You are dropping the "+noun);
            }else{
                System.out.println("Please enter a valid object when saying an object to drop.");
            }
        }
        if(verb.equals("open")){
            if (noun.equals("door")){
                System.out.println("You are opening the door");
            }else{
                System.out.println("Please enter a valid thing to open.");
            }
        }
    
    }

    
    
    //     if(verb=="grab"){
    //         //insert grab action here
    //         if(noun=="sword")
    //             System.out.println("Please enter a valid object to grab.");
    //     }
    
    /**
     * This, to aid in movement of the player, will convert a string that the user inputs 
     * @param string
     * @return
     */
    public static Direction stringToDirection(String string){
        Direction[] dirs = Direction.values();
        if (string.equals("north")){
            return dirs[0];
        }
        if(string.equals("east")){
            return dirs[1];
        }
        if(string.equals("south")){
            return dirs[2];
        }
        if(string.equals("west")){
            return dirs[3];
        }else{
            return dirs[4];
        }
    }

    public  void main(String[] args) throws IOException {
        BufferedReader in;
        

        // in = new BufferedReader(new InputStreamReader(System.in));
        // Game newGame = new Game();
        // waitingForWords(in, newGame);
        // completeAction("open","door");
        // System.out.println(stringToDirection("south"));
        
}
}

