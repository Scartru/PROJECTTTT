import java.util.HashMap;


class Player extends Person {
    private HashMap<String, Boolean> inventory;

    public Player(String name, Room room) { 
        super(name, room); 
        this.inventory = new HashMap<>();
        inventory.put("fridgekey", true);
        inventory.put("cagekey", true);
        inventory.put("towerkey", true);
        inventory.put("crowbar", true);
    }

    public HashMap<String, Boolean> getInventory() {
        return inventory;
    }

    public void setInventory(HashMap<String, Boolean> inventory) {
        this.inventory = inventory;
    }


    /**
     * This allows the user to drop an object given the string and room
     * @param name name of object
     * @param room room of player that object is in
     */
    public void playerDrop(String name, Room room){
        if (inventory.containsKey(name)){
            if (inventory.get(name)){
                inventory.put(name, false);
                room.addObject(name);
                System.out.println("You dropped the "+name);
            }else{
                System.out.println("You do not currently have this item in your inventory.");
            }
        }else{
            System.out.println("This item does not exist.");
        }

    }

    /**
     * This allows the player to pick up an object
     * @param name this is the name of the object that is being picked up
     */
    public void playerGrab(String name){
        if (inventory.containsKey(name)){
            System.out.println(room.getObject());
            if (name.equals(room.getObject())){
                inventory.put(name, true);
                room.removeObject(name);
                System.out.println("Current Inventory:"+this.getInventory());
            }else{
                System.out.println("This item is not in the room.");
            }
            
        }else{
            System.out.println("This item does not exist.");

        }
    }

    
    }
