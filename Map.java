
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
        this.map.add(new Room("r", "Stinky", Direction.NOEXIT, 2, Direction.NOEXIT, 1));
        this.map.add(new Room("r", "Stinky", Direction.NOEXIT, 2, Direction.NOEXIT, 1));
        this.map.add(new Room("r", "Stinky", Direction.NOEXIT, 2, Direction.NOEXIT, 1));
        this.map.add(new Room("r", "Stinky", Direction.NOEXIT, 2, Direction.NOEXIT, 1));
        this.map.add(new Room("r", "Stinky", Direction.NOEXIT, 2, Direction.NOEXIT, 1));
        this.map.add(new Room("r", "Stinky", Direction.NOEXIT, 2, Direction.NOEXIT, 1));
        this.map.add(new Room("r", "Stinky", Direction.NOEXIT, 2, Direction.NOEXIT, 1));
        this.map.add(new Room("r", "Stinky", Direction.NOEXIT, 2, Direction.NOEXIT, 1));
        this.map.add(new Room("r", "Stinky", Direction.NOEXIT, 2, Direction.NOEXIT, 1));

    }


    public ArrayList<Room> getMap() {
        return map;
    }

    public Room getRoom(int n){
        return this.map.get(n);
    }

     
    }
