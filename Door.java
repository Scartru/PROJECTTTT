import java.util.HashMap;


class Door{
    private String direction;
    private String returnDirection;
    private int room1;
    private int room2;
    private String key;
    private Boolean isLocked;
    private String name;

//This is the constructor for Door
    public Door(String name, String direction, String returnDirection, int room1, int room2, String key) {
        this.name = name;
        this.direction = direction;
        this.returnDirection = returnDirection;
        this.room1 = room1;
        this.room2 = room2;
        this.key = key;
        this.isLocked = true;
    }
/**
 * This checks the boolean attribute to see if the door if 'locked' or not
 * @return boolean whether the door is locked or not
 */
    public boolean isLocked() {
        return isLocked; 
    }

    /**
     * This changes the value of the space where the door is on the map so that it effectively does not exist. Then, it changes the isLocked attribute to false
     * @param map this is the map on which we are playing
     */
    public void unlock(Map map) {
        this.isLocked = false;

        setExit(map.getRoom(room1), returnDirection, room2);
        setExit(map.getRoom(room2), direction, room1);
    }

    /**
     * This checks if the door is in the room, if the attempted door is the door in the room, if the door is already locked, and if the user has the key
     * @param doorName This is the name of the door
     * @param map this is the map that we are playing on
     * @param room this is the room that the door exists in 
     * @param inventory this is the player inventory
     */
    public void unlock(String doorName, Map map, Room room, HashMap<String, Boolean> inventory) { 
        if(room.getHasDoor()){
            if(room.getDoor().getName().equals(doorName)){
                if(room.getDoor().isLocked()){
                    if(inventory.get(room.getDoor().key)){
                        unlock(map);
                    }else{
                        System.out.println("You do not have the right key for this door. \n");
                    }
                }else{
                    System.out.println("The door is already open. \n");
                }
            }else{
                System.out.println("This is not the correct door. \n");
            }
        }else{
            System.out.println("This room does not have a door to unlock. \n");
        }
    }
    
    /**
     * This is an accessor that returns the name of the player
     * @return this is the name of the door
     */
    public String getName(){
        return this.name;
    }


    /**
     * This replaces the unnacessable (-1) direction value with newly accessable room in correspondant direction
     * @param room that is changed to be able to access target room
     * @param dir direction that connects the rooms 
     * @param target newly accessable room index, room that can now access the return room
     */
    private void setExit(Room room, String dir, int target){

        switch (dir) {
        case "NORTH" -> room.setN(target);
        case "EAST"  -> room.setE(target);
        case "SOUTH" -> room.setS(target);
        case "WEST"  -> room.setW(target);
    }
} 



}
    


