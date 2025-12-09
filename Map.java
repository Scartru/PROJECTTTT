
import java.util.ArrayList;

public class Map{
    ArrayList <Room>map;


    Door redDoor = new Door("Red Door", "mysterious", "NORTH", "SOUTH", 5, 6, "Red key");
    Door greenDoor = new Door("Green Door", "weird door","SOUTH", "NORTH", 12, 11, "Green key");
    Door blueDoor = new Door("Blue Door", "cool door", "EAST", "WEST", 18, 14, "Blue key");
    Door manHole = new Door("Sewer manhole", "stink pt.2", "EAST", "",19, 0, "Crowbar");

    public Map(){
        this.map = new ArrayList<>();


        this.map.add(new Room("Port-a-Potty", "Stinky as hell here... why is there no door...", -1, 2, -1, -1, ""));
        this.map.add(new Room("r", "Stinky", -1, 6, 2, -1, ""));
        this.map.add(new Room("r", "Stinky", 1, 7, 3, 0, ""));
        this.map.add(new Room("r", "Stinky", 2, 8, -1, 4, ""));
        this.map.add(new Room("r", "Stinky", -1, 3, -1, -1, "red key"));
        this.map.add(new Room("r", "Stinky", -1, -1, -1, -1, "green key", redDoor)); ///south
        this.map.add(new Room("r", "Stinky", -1, -1, 7, 1, "", redDoor)); ////north
        this.map.add(new Room("r", "Stinky", 6, 11, 8, 2,""));
        this.map.add(new Room("r", "Stinky", 7, -1, 9, 3, ""));
        this.map.add(new Room("r", "Stinky", 8, 13, 10, -1,""));
        this.map.add(new Room("r", "Stinky", 9, 14, -1, -1,""));
        this.map.add(new Room("r", "Stinky", -1, 15, -1, 7, "", greenDoor)); ////south
        this.map.add(new Room("r", "Stinky", -1, -1, -1, -1, "Blue Key", greenDoor)); /// north 
        this.map.add(new Room("r", "Stinky", -1, 17, -1, 9, ""));
        this.map.add(new Room("r", "Stinky", -1, -1, -1, 10, "", blueDoor)); ///east
        this.map.add(new Room("r", "Stinky", -1, -1, 16, -1, ""));
        this.map.add(new Room("r", "Stinky", 15, -1, 17, -1, ""));
        this.map.add(new Room("r", "Stinky", 16, -1, -1, 13, "", manHole));   ///east
        this.map.add(new Room("r", "Stinky", -1, -1, -1, -1, "Crowbar", blueDoor));  //west
        this.map.add(new Room("r", "Stinky", -1, -1, -1, -1, ""));

    }


    public ArrayList<Room> getMap() {
        return map;
    }

    public Room getRoom(int n){
        return this.map.get(n);
    }

     
    }