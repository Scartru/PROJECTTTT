class Door extends Definition{
    private String color;
    private String direction;
    private Boolean isLocked;
    private String keyName;

    public Door(String name, String description, String keyName, String color, String direction, String returnDirection) {
        super(name, description); 
        this.keyName = keyName;
        this.color = color;
        this.direction = direction;
        this.isLocked = true;
    }

    public String getColor() {
        return color;   
    }

    public boolean isLocked() {
        return isLocked; 
    }

    public void unlock(String keyName) { 
        if 
        isLocked = false; 

    }
    public static void main(String[] args) {
        Door redDoor = new Door("Red", "Red Door", "Red Key", "mysterious", "North", "South");
        Door greenDoor = new Door("Green", "Green Door", "Green Key", "weird door","South", "North");
        Door blueDoor = new Door("Blue", "Blue Door", "Blue Key", "cool door", "East", "West");

    }
    
    
}