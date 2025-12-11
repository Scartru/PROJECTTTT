import java.util.HashMap;


class Player extends Person {
    private HashMap<String, Boolean> inventory;

    public Player(String name, Room room) { 
        super(name, room); 
        this.inventory = new HashMap<>();
        inventory.put("Red Key", false);
        inventory.put("Green Key", false);
        inventory.put("Blue Key", false);
        inventory.put("Crowbar", false);
    }

    public HashMap<String, Boolean> getInventory() {
        return inventory;
    }

    public void setInventory(HashMap<String, Boolean> inventory) {
        this.inventory = inventory;
    }



    public void drop(String name, Room room){
        if (inventory.containsKey(name)){
            inventory.put(name, false);
            room.addObject(name);
        }

    }

    public void pickUp(String name){
        if (inventory.containsKey(name)){
            inventory.put(name, true);
            room.removeObject(name);
        }
    }

}
