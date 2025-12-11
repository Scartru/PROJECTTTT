
import java.util.ArrayList;

public class Map{
    ArrayList <Room>map;


    Door fridgeDoor = new Door("FridgeDoor", "cold", "NORTH", "SOUTH", 5, 6, "FridgeKey");
    Door cageDoor = new Door("CageDoor", "cagey door","SOUTH", "NORTH", 12, 11, "CageKey");
    Door towerDoor = new Door("TowerDoor", "cool door", "EAST", "WEST", 18, 14, "TowerKey");
    Door manHole = new Door("Manhole", "stink pt.2", "EAST", "",19, 0, "Crowbar");

    public Map(){
        this.map = new ArrayList<>();

        this.map.add(new Room("0Port-a-Potty", "Stinky as hell here... why is there no door...", -1, 2, -1, -1, ""));
        this.map.add(new Room("1", "Stinky", -1, 6, 2, -1, ""));
        this.map.add(new Room("2", "Stinky", 1, 7, 3, 0, ""));
        this.map.add(new Room("3", "Stinky", 2, 8, -1, 4, ""));
        this.map.add(new Room("4", "Stinky", -1, 3, -1, -1, "FridgeKey"));
        this.map.add(new Room("5", "Stinky", -1, -1, -1, -1, "CageKey", fridgeDoor)); ///south
        this.map.add(new Room("6", "Stinky", -1, -1, 7, 1, "", fridgeDoor)); ////north
        this.map.add(new Room("7", "Stinky", 6, 11, 8, 2,""));
        this.map.add(new Room("8", "Stinky", 7, -1, 9, 3, ""));
        this.map.add(new Room("9", "Stinky", 8, 13, 10, -1,""));
        this.map.add(new Room("10", "Stinky", 9, 14, -1, -1,""));
        this.map.add(new Room("11", "Stinky", -1, 15, -1, 7, "", cageDoor)); ////south
        this.map.add(new Room("12", "Stinky", -1, -1, -1, -1, "towerKey", cageDoor)); /// north 
        this.map.add(new Room("13", "Stinky", -1, 17, -1, 9, ""));
        this.map.add(new Room("14", "Stinky", -1, -1, -1, 10, "", towerDoor)); ///east
        this.map.add(new Room("15", "Stinky", -1, -1, 16, -1, ""));
        this.map.add(new Room("16", "Stinky", 15, -1, 17, -1, ""));
        this.map.add(new Room("17", "Stinky", 16, -1, -1, 13, "", manHole));   ///east
        this.map.add(new Room("18", "Stinky", -1, -1, -1, -1, "Crowbar", towerDoor));  //west
        this.map.add(new Room("19", "Stinky", -1, -1, -1, -1, ""));

    }


    public ArrayList<Room> getMap() {
        return map;
    }

    public Room getRoom(int n){
        return this.map.get(n);
    }

     
    }
