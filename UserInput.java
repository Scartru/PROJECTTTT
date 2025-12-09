
import java.util.ArrayList;
import java.util.Arrays;

public class UserInput {
    ArrayList<String> commands;
    ArrayList<String> objects;
    public UserInput(){
        commands = new ArrayList<>(Arrays.asList("go", "take", "grab", "drop")); /*This is the list of acceptable verbs that the player can enter */
        objects = new ArrayList<>(Arrays.asList("crowbar", "key")); /*This is the list of acceptable nounds that the player can enter */
    }

//dont forget to add way to break words up into seperate entries in the list
//dont forget to add way to make all entries lower-case

    public String[] ParseCommand(ArrayList<String> inputList){
        String verb;
        String noun;
        String[] toBeReturned = new String[2];
        if (inputList.size()>2){
            System.out.println("Please only enter commands with two words!");
        } else{
            verb = inputList.get(0);
            if(!commands.contains(verb)){
                System.out.println(verb+" is not a known command!");
            }else{
                toBeReturned[0]=verb;
            }
            noun = inputList.get(1);
            if(!objects.contains(noun)){
                System.out.println(noun+" is not a known object!");
            }else{
                toBeReturned[1]=noun;
            }
        }
        return toBeReturned;
    }

    public void doAction (String[] toBeDone){
        String verb = toBeDone[0];
        String noun = toBeDone[1];

        for (String object : objects) {
            if (noun="go"){}
        }
    }
}
