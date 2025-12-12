//Based off of code from HuwsTube



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class UserInput {
    Game game;

    // This is the constructor for this class
    public UserInput(Game game){
        this.game = game;
    }
    /**
     * This breaks up the list of words from the previous wordList command into noun and verb and from there, calls on another method, completeAction
     * @param wordlist this is the list of words, which should be initialized by wordList and should only be two indeces long
     * @param game this is the game that this UserInput class is running in
     */
    public static void parseCommand(List<String> wordlist, Game game) {
        String verb;
        String noun;
        List<String> commands = new ArrayList<>(Arrays.asList("grab", "drop", "go", "open"));
        List<String> objects = new ArrayList<>(Arrays.asList("crowbar", "fridgeKey", "fridgekey", "cageKey", "cagekey", "towerKey", "towerkey", "door", "north", "west", "east", "south", "towerdoor", "cagedoor", "fridgedoor", "manhole"));
        
        if (wordlist.size() != 2) {
            System.out.println("\n Only 2 word commands allowed! \n");
        } else {
            verb = wordlist.get(0);
            noun = wordlist.get(1);
            if (objects.contains(noun)) {
                
                if (!commands.contains(verb)) {
                    System.out.println("\n" + verb + " is not a known verb! \n");
                }else{
                    completeAction(verb, noun, game);
                }
            }else{
                System.out.println("\n"+noun + " is not a known noun! \n");
            }
            }
            
        }
    

    /**
     * This takes the string of user input and removes all unnecessary spaces and punctuation and puts it in a list
     * @param input this is the string that will be parsed from
     * @return this is the resulting string that is the words as a list
     */
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

    /**
     * This is the first ran function that calls takes in the input string, ensures that we do not run into errors via casing and then calls the parsecommanf from the resulting wordlist
     * @param inputstr this is the string of user input
     * @param game this is the game within which this command is being run
     * @return this is the string that tells the user to input a command or accepts the command that has been entered
     */
    public static String runCommand(String inputstr, Game game) {
        List<String> wordList;
        String ok = "ok";
        String lowstr = inputstr.trim().toLowerCase();
        
        if (!lowstr.equals("q")) {
            if (lowstr.equals("")) {
                ok = "\n You must enter a command \n";
            } else {
                wordList = wordList(lowstr);
                // wordList.forEach((astr) -> System.out.println(astr));
                parseCommand(wordList, game);
            }
        }
        return ok;
    }

    //grab, drop, open, 

    /**
     * This is method that takes the noun and the verb obtained from the parseCommand action and then checks each string if it matches one of the available commands. If it does, it calls that command
     * @param Verb this is the verb string to be checked
     * @param Noun this is the noun string to be checked
     * @param game this is the game that this method is running in
     */
    public static void completeAction(String Verb, String Noun, Game game){
        String verb = Verb;
        String noun = Noun;
        // System.out.println(verb);
        if (verb.equals("go")){
            if (noun.equals("north")||noun.equals("south")|| noun.equals("east")|| noun.equals("west")){
                System.out.println("");
                game.move(stringToDirection(noun));
                // System.out.println("You are going "+noun);
            }else{
                System.out.println("Please enter a valid direction when saying a way to go. \n");
            }
        }
        if (verb.equals("drop")){
            if (noun.equals("crowbar")||noun.equals("fridgeKey")||noun.equals("fridgekey")||noun.equals("cageKey")||noun.equals("cagekey")||noun.equals("towerKey")||noun.equals("towerkey")){
                System.out.println("You are dropping the "+noun +"\n");
                game.drop(noun);
                System.out.println("");
            }else{
                System.out.println("Please enter a valid object when saying an object to drop. \n");
            }
        }
        if(verb.equals("open")){
            if (noun.equals("towerdoor")||noun.equals("cagedoor")||noun.equals("fridgedoor")||noun.equals("manhole")){
                if(noun.equals("towerdoor")){
                    System.out.println("\n You are opening the tower door \n");
                    game.unlockDoor(game.stringToDoor(noun), "towerdoor");
                    System.out.println("");
                }
                if(noun.equals("cagedoor")){
                    System.out.println("\n You are opening the  cage door \n");
                    game.unlockDoor(game.stringToDoor(noun), "cagedoor");
                    System.out.println("");

                }
                if(noun.equals("fridgedoor")){
                    System.out.println("\n You are opening the  fridge door \n");
                    game.unlockDoor(game.stringToDoor(noun), "fridgedoor");
                    System.out.println("");

                }
                if(noun.equals("manhole")){
                    System.out.println("\n You are opening the manhole \n");
                    game.unlockDoor(game.stringToDoor(noun), "manhole");
                    System.out.println("");

                }
            }else{
                System.out.println("\n Please enter a valid thing to open. \n");
            }
        }
    
    

        if(verb.equals("grab")){
            if(noun.equals("fridgekey")||noun.equals("cagekey")||noun.equals("towerkey")||noun.equals("crowbar")){
                System.out.println("You are grabbing "+noun+"\n");
                    game.grab(noun);
                    System.out.println("");
            }else{
                System.out.println("Please enter a valid object to grab. \n");
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

    /**
     * This is the method that converts a user input string to a door class
     * @param doorName this is the name of the door that was inputted by the player
     * @param map this is the map within which the door sits
     * @return this is the door which is the equivalent of the inputted string
     */
    public static Door stringToDoorWithoutMap(String doorName, Map map){
        if (doorName.equals("fridgedoor")){
            return map.fridgeDoor;
        }
        if(doorName.equals("cagedoor")){
            return map.cageDoor;
        }
        if(doorName.equals("towerdoor")){
            return map.towerDoor;
        }else{
            return map.manHole;
        }
    }



    // public  void main(String[] args) throws IOException {

        

        // in = new BufferedReader(new InputStreamReader(System.in));
        // Game newGame = new Game();
        // waitingForWords(in, newGame);
        // completeAction("open","door");
        // System.out.println(stringToDirection("south"));
        
}



