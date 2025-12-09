
import java.util.ArrayList;

public class Map {
    ArrayList <Room>map;


    public Map(){
        this.map = new ArrayList<>();

        this.map.add(new Room("Port-a-Potty", "Stinky", -1, 2, -1, -1));
        this.map.add(new Room("r", "Stinky as hell here... why is there no door...", -1, 6, 2, -1));

        this.map.add(new Room("r", "Stinky", 1, 7, 3, 0));

        this.map.add(new Room("r", "Stinky", 2, 8, -1, 4));
        this.map.add(new Room("r", "Stinky", -1, 3, -1, -1, "red key"));
        this.map.add(new Room("r", "Stinky", -1, -1, -1, -1, "SR", "green key"));
        this.map.add(new Room("r", "Stinky", -1, -1, 7, 1));
        this.map.add(new Room("r", "Stinky", 6, 11, 8, 2));
        this.map.add(new Room("r", "Stinky", 7, -1, 9, 3));
        this.map.add(new Room("r", "Stinky", 8, 13, 10, -1));
        this.map.add(new Room("r", "Stinky", 9, 14, -1, -1));
        this.map.add(new Room("r", "Stinky", -1, 15, -1, 7, "SG"));
        this.map.add(new Room("r", "Stinky", -1, -1, -1, -1, "NG", "Blue Key"));
        this.map.add(new Room("r", "Stinky", -1, 17, -1, 9));
        this.map.add(new Room("r", "Stinky", -1, -1, -1, 10, "EB"));
        this.map.add(new Room("r", "Stinky", -1, -1, 16, -1));
        this.map.add(new Room("r", "Stinky", 15, -1, 17, -1));
        this.map.add(new Room("r", "Stinky", 16, -1, -1, 13, "E Sewer"));
        this.map.add(new Room("r", "Stinky", -1, -1, -1, -1, "CuB","Crowbar"));
        this.map.add(new Room("r", "Stinky", -1, -1, -1, -1, "W Sewer"));

    }


    public ArrayList<Room> getMap() {
        return map;
    }

    public Room getRoom(int n){
        return this.map.get(n);
    }

     
    }
