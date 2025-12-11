import java.util.HashMap;

class Door extends Definition{
    private String color;
    private String direction;
    private String returnDirection;
    private int room1;
    private int room2;
    private String key;
    private Boolean isLocked;


    public Door(String name, String description, String direction, String returnDirection, int room1, int room2, String key) {
        super(name, description); 
        this.direction = direction;
        this.returnDirection = returnDirection;
        this.room1 = room1;
        this.room2 = room2;
        this.key = key;
        this.isLocked = true;
    }

    public boolean isLocked() {
        return isLocked; 
    }

    public void unlock(Map map) {
        this.isLocked = false;
        Room r1= map.getRoom(room1);
        Room r2 = map.getRoom(room2);

        setExit(r1, direction, room2);
        setExit(r2, returnDirection, room1);
    }
    public void unlock(String keyName, Map map, Room room, HashMap<String, Boolean> inventory) { 
        if(room.getHasDoor()){
            String requiredKey = room.getDoor().getName();
                if(room.getDoor().isLocked()){
                    if (inventory.containsKey(keyName)){
                        if (inventory.get(keyName)){
                            if (requiredKey.equals(keyName)){
                                unlock(map);
                                
                            }
                        }
                    }
                }
            }
        }


    private void setExit(Room room, String dir, int target){
        switch (dir) {
        case "NORTH" -> room.setN(target);
        case "EAST"  -> room.setE(target);
        case "SOUTH" -> room.setS(target);
        case "WEST"  -> room.setW(target);
    }
    }

    }



