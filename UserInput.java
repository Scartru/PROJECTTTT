//Based off of code from HuwsTube



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class UserInput {

    public static void parseCommand(List<String> wordlist) {
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
                    completeAction(verb, noun);
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

    public static String runCommand(String inputstr) {
        List<String> wordList;
        String ok = "ok";
        String lowstr = inputstr.trim().toLowerCase();
        
        if (!lowstr.equals("q")) {
            if (lowstr.equals("")) {
                ok = "You must enter a command";
            } else {
                wordList = wordList(lowstr);
                wordList.forEach((astr) -> System.out.println(astr));
                parseCommand(wordList);
            }
        }
        return ok;
    }

    //grab, drop, open, 

    public static void completeAction(String Verb, String Noun){
        String verb = Verb;
        String noun = Noun;
        System.out.println(verb);
        if (verb.equals("go")){
            if (noun.equals("north")||noun=="south"|| noun=="east"|| noun=="west"){
                //insert go action here 
                System.out.println("You are going "+noun);
            }else{
                System.out.println("Please enter a valid direction when saying a way to go.");
            }
        }
        }

    public static void waitingForWords(BufferedReader br)throws IOException{
        String input;
        String output;

        do {
            System.out.print("*** ");
            input = br.readLine();
            output = runCommand(input);
            System.out.println(output);
        } while (!"q".equals(input));
    }
    
    //     if(verb=="grab"){
    //         //insert grab action here
    //         if(noun=="sword")
    //             System.out.println("Please enter a valid object to grab.");
    //     }
    

    public static void main(String[] args) throws IOException {
        BufferedReader in;
        

        in = new BufferedReader(new InputStreamReader(System.in));
        waitingForWords(in);
        
}
}

