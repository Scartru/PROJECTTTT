
import java.util.ArrayList;

public class Map{
    ArrayList <Room>map;


    Door fridgeDoor = new Door("fridgedoor", "NORTH", "SOUTH", 5, 6, "fridgekey");
    Door cageDoor = new Door("cagedoor","SOUTH", "NORTH", 12, 11, "cagekey");
    Door towerDoor = new Door("towerdoor", "EAST", "WEST", 18, 14, "towerkey");
    Door manHole = new Door("manhole", "EAST", "SOUTH",19, 17, "crowbar");

    //This is the constructor for Map which initializes all of the rooms//
    public Map(){
        this.map = new ArrayList<>();

        this.map.add(new Room("0Port-a-Potty", "It’s stinky as hell in here. No one has visited in a long time and the resulting stench is enough to make you gag. On three sides you are surrounded by bright blue plastic… on the fourth, the porta potty’s door seems to be missing. Anyone wanting to do ‘their business’ in here would be quite visible to someone outside. 😶‍🌫️ Luckily, it’s dark outside. To the East, you can see out into what appears to be a courtyard, illuminated by flashing lights from nearby.", -1, 2, -1, -1, ""));
        this.map.add(new Room("1", "You have reached the interior of the restaurant. To your south, you see the courtyard through the window. To your east, you see the kitchen of the restaurant with an ominously looking fridge door", -1, 6, 2, -1, ""));
        this.map.add(new Room("2", "You’ve gotten a bit of a chill out here, alone. No one could hear you if you screamed... To your west, the porta potty hints at some months-old lovely bodily waste, I would not go back there if I were you. 💩💨🔥But, strangely, that porta potty is the only thing reminding you of home, of the parents that once knocked on its door as they begged you to come out before the park closed. Too late now, I guess… You’re trapped. Alone. To your north, you see an abandoned restaurant straight outta a Wild West flick. A wick rocking chair sits on the porch, a kerosene light flickers on and off beside the door. To your east, a Ferris wheel looms above you. Each of its metal carriages is rusting a bit and the paint has peeled off in large chunks. Glancing upwards, you can’t see the top, but the corner of your eye catches what you could swear was movement. About halfway up on your left side, is that dark shape a person? I can’t say that it’d be smart to stick around to find out. To your south, a sing-songy bop draws your attention to a “Go Fishing” booth. Surprisingly, the rods with little magnet tips seem in decent condition… Your childish greed tempts you to catch and steal a rubber ducky or two. For the jeep! ", 1, 7, 3, 0, ""));
        this.map.add(new Room("3", "You grab a rod and cast away. Yeah you missed terribly, but there’s no one around to watch you and your pathetic magnet dangling skills. But no, you’re just ten, so you think you’re great and you have a big ego… you know for sure that you can land the Quack Sparrow one to humor your mom’s Pirates of the Caribbean phase. 🐥😻🎣 She’s one odd duckling, that’s for sure. It’s rather strange, wouldn’t you say, how easily one forgets the dangers of the night while consumed by games and thoughts of a future? So you’re beginning to doubt your hubris… but then, your hairs stand on end. Something feels amiss. You feel like you should get a move on. You can always come back later… for now, you are only getting more vulnerable. To your west, there’s a suspicious looking balloon cart. For an abandoned amusement park, the balloons are full of air and in pristine condition, their colors bright even in the dim light. It’s almost like a clown had just left moments ago. Is it bad you kinda want one? Like lil Georgie has. To your North, the patchy grass of the courtyard waits for you to explore it further… who knows what you may find? And to your east, another booth is set up. Rifles, from the look of it! How exciting for a skibidi  toilet child whose attention span hasn’t allowed them to focus long enough to ever read the news… Kids these days… To you, nothing seems more thrilling than the pow pow pow 💥", 2, 8, -1, 4, ""));
        this.map.add(new Room("4", "Ooooooo prettyyyyy yummy yummy. Balloons! Nothing tickles your little heart like a bright red soft balloon perfect for popping. Like a pimple, if you’ve hit puberty early enough to be blessed with those already. 🧏‍♀️🎈🔪 Reaching across to grab one, you spot a key in the tip jar. You could pocket a dime or two, but something about this key feels important… Where might you have seen one of these before? Wait, yes! In 3rd grade as you were playing hide and seek, where ‘helped’ your cousin hide… in the walk-in refrigerator… and then ‘accidentally’ proceeded to lock the door. Safe to say, your Roblox privilege was suspended for a month… but that fridge key and story was not one to be forgotten. You should probably grab this fridgekey… To your right, the bops of the Go Fish highlight an otherwise eerie night. Wanna head back and try your hand at fishing at ducky once more? It’ll be reel fun!", -1, 3, -1, -1, "fridgekey"));
        this.map.add(new Room("5", "its pretty cold in here. there is a cagekey on the floor. The door to the fridge to your south", -1, -1, -1, -1, "cagekey", fridgeDoor)); ///south
        this.map.add(new Room("6", "You are in the kitchen. To your west, you see the restaurant's dining room. To the south, there's a door leading out to the ferris wheel. To yuor north, a fridge with a locked door looks rather tempting. I'd try to get in there if I were you. But only if you have the fridgekey...", -1, -1, 7, 1, "", fridgeDoor)); ////north
        this.map.add(new Room("7", "You are in the ferris wheel. To your north, you see a room with a fridgedoor. To your west, you see a courtyard. To your south you see a ferris wheel. To your east you see a ring of cages.", 6, 11, 8, 2,""));
        this.map.add(new Room("8", "You are at the shooting range game. To your west you see the go fish game. To your north you see a ferris wheel. To your south you see a tea cup ride.", 7, -1, 9, 3, ""));
        this.map.add(new Room("9", "You are on a teacup ride. To your north, you see a shooting range game. To your south you see a mirror maze haunted house. To your east, you see a carnival tent.", 8, 13, 10, -1,""));
        this.map.add(new Room("10", "You are in the mirror maze haunted house. To your north, you see a teacup ride. To your east, you see a bouncy castle with a locked door at one of its four towers.", 9, 14, -1, -1,""));
        this.map.add(new Room("11", "You are in an open space surrounded by a ring of cages full of animal bones. A tiger once roamed here. Now he's dust. You don't even see his beautiful orange fur. It's been that long. You'll be there soon too. Inshallah. One of the cages has a rather prominent door. I'd open it if I were you and crawl inside. You should use the cagekey if you have it. To your west, there is a ferris wheel. To your east, there are some food trucks.", -1, 15, -1, 7, "", cageDoor)); ////south
        this.map.add(new Room("12", "there is a tower key hanging from the middle of the cage. towerdoor exit door stands to your north", -1, -1, -1, -1, "towerkey", cageDoor)); /// north 
        this.map.add(new Room("13", "You are inside of the grand carnival tent. Spookyyyyy To your west, you see a teacup ride and to your east, a clearing filled with litter and cigarette butts. A smoke would be nice right about now...", -1, 17, -1, 9, ""));
        this.map.add(new Room("14", "You are bouncing sky high. To your west, there is a mirror maze haunted house. You see one of the tower of this bouncy castle has a locked door. You should open it if you have the towerkey", -1, -1, -1, 10, "", towerDoor)); ///east
        this.map.add(new Room("15", "There are some dingy looking food trucks. No wonder everyone was blowing up the porta potty. This food must have suckeddd. To your west, there is a circle of cages. To your south, there is a graveyard.", -1, -1, 16, -1, ""));
        this.map.add(new Room("16", "You are surrounded by tombstones. You aren't quite sure why there'd by a graveyard in an amusement park. But hey, to each their own. The dead performers and crazy clown monsters are all laid to rest around you. To your north, there are some wacky food trucks. To your south, you see a discouraing mass of litter.", 15, -1, 17, -1, ""));
        this.map.add(new Room("17", "You are in a clearing that looks like where eveybody's trash got dumped. Often, performers would come out here to take a smoke. To your west, there are the open flaps of a carnival tent. To your north, there is a depressing looking graveyard. In the center of everything, there lies a stinky manhole. Do you have the crowbar needed to open it?", 16, -1, -1, 13, "", manHole));   ///east
        this.map.add(new Room("18", "You've climbed up into the tower and in it, there lies a wild, gorgeous, life-altering hope of survival: your long-last love... the crowbar. The towerdoor exit lies west of you", -1, -1, -1, -1, "crowbar", towerDoor));  //west
        this.map.add(new Room("19", "The sewers smell as you crawl your way out but there is a light in the distance. Crowbar in hand, our champion emerges!", -1, -1, -1, -1, "", manHole));

    }


    //**
    // This is an accessor which returns an ArrayList of rooms that make up the map so that our map can be accessible by other classes.
    // @return map This returns the ArrayList of rooms that makes up our map
    public ArrayList<Room> getMap() {
        return map;
    }

    /**
     * This returns the room given its index within this map
     * @param n this is the index of the room within the map
     * @return room this is the room that is being obtained by calling a certain index in a map
     */
    public Room getRoom(int n){
        return this.map.get(n);
    }
}
