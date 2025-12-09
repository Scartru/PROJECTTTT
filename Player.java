import java.util.Hashtable;

class Player extends Person {
    private Hashtable<String, Boolean> inventory;

    public Player(String name, Room room) { 
        super(name, room); 
        this.inventory = new Hashtable<String, Boolean>();
        inventory.put("Red Key", false);
        inventory.put("Green Key", false);
        inventory.put("Blue Key", false);
        inventory.put("Crowbar", false);
    }

    public Hashtable<String, Boolean> getInventory() {
        return inventory;
    }

    public void setInventory(Hashtable<String, Boolean> inventory) {
        this.inventory = inventory;
    }

}
