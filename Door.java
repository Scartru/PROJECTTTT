import java.util.HashMap;

class Door{
    private String direction;
    private String returnDirection;
    private int room1;
    private int room2;
    private String key;
    private Boolean isLocked;
    private String name;


    public Door(String name, String direction, String returnDirection, int room1, int room2, String key) {
        this.name = name;
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

        setExit(map.getRoom(room1), returnDirection, room2);
        setExit(map.getRoom(room2), direction, room1);
    }

    public void unlock(String doorName, Map map, Room room, HashMap<String, Boolean> inventory) { 
        if(room.getHasDoor()){
            if(room.getDoor().getName().equals(doorName)){
                if(room.getDoor().isLocked()){
                    if(inventory.get(room.getDoor().key)){
                        unlock(map);
                    }else{
                        System.out.println("You do not have the right key for this door.");
                    }
                }else{
                    System.out.println("The door is already open.");
                }
            }else{
                System.out.println("This is not the correct door.");
            }
        }else{
            System.out.println("This room does not have a door to unlock.");
        }
    }
    
    public String getName(){
        return this.name;
    }


    private void setExit(Room room, String dir, int target){
    // System.out.println("1:" + room.getN());
    // System.out.println(room.getE());
    // System.out.println(room.getS());
    // System.out.println(room.getW());
        // System.out.println(room + "\n" + dir + "\n" + target);
        switch (dir) {
        case "NORTH" -> room.setN(target);
        case "EAST"  -> room.setE(target);
        case "SOUTH" -> room.setS(target);
        case "WEST"  -> room.setW(target);
    }
    // System.out.println("2:" + room.getN());
    // System.out.println(room.getE());
    // System.out.println(room.getS());
    // System.out.println(room.getW());
} 


//     public String printThingys(){
//         return (name +"\n" + direction +"\n" + room1 +"\n" + key);
//     }
}
    



